package com.scaler.bookMyShow.service;

import com.scaler.bookMyShow.Repository.BookingRepository;
import com.scaler.bookMyShow.Repository.ShowRepository;
import com.scaler.bookMyShow.Repository.ShowSeatRepo;
import com.scaler.bookMyShow.Repository.UserRepository;
import com.scaler.bookMyShow.esceptions.UserNotFoundException;
import com.scaler.bookMyShow.model.Booking;
import com.scaler.bookMyShow.model.Show;
import com.scaler.bookMyShow.model.ShowSeat;
import com.scaler.bookMyShow.model.User;
import com.scaler.bookMyShow.model.enums.ShowSeatStatus;
import com.scaler.bookMyShow.model.enums.TicketStatus;
import com.zaxxer.hikari.util.IsolationLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;

@Service
public class BookingService {


    private UserRepository userRepository;
    private ShowRepository showRepository;
    private ShowSeatRepo showSeatRepo;
    private BookingRepository bookingRepository;

    @Autowired
    public BookingService(UserRepository userRepository,
                          ShowRepository showRepository,
                          ShowSeatRepo showSeatRepo,
                          BookingRepository bookingRepository) {
        this.userRepository = userRepository;
        this.showRepository = showRepository;
        this.showSeatRepo = showSeatRepo;
        this.bookingRepository = bookingRepository;
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Booking bookTicket(int showId,
                              int userId,
                              List<Integer> showSeatsIds) {

        Optional<User> userOptional = userRepository.findById(userId);
        if(userOptional.isEmpty()) {
            throw new UserNotFoundException("Invalid user id: "+userId);
        }

        User currentUser = userOptional.get();

        // validate showId
        Optional<Show> showOptional = showRepository.findById(showId);
        if(showOptional.isEmpty()) {
            throw new RuntimeException("Invalid show id: "+showId);
        }

        Show bookedShow = showOptional.get();

        List<ShowSeat> showSeats = new ArrayList<>();
        for(Integer showSeatId: showSeatsIds) {
            ShowSeat showSeat = showSeatRepo.findById(showSeatId).get();
            if(!showSeat.getStatus().equals(ShowSeatStatus.AVAILABLE)) {
                throw new RuntimeException("All the request seats are not available. Please try again");
            }
            showSeats.add(showSeat);
        };

        List<ShowSeat> savedShowSeats = new ArrayList<>();
        for(ShowSeat showSeat: showSeats) {
            showSeat.setStatus(ShowSeatStatus.BLOCKED);
            showSeat.setBlockedAt(new Date());
            ShowSeat savedShowSeat = showSeatRepo.save(showSeat);
            savedShowSeats.add(savedShowSeat);
        }

        Booking booking = new Booking();
        booking.setUser(currentUser);
        booking.setShowSeats(savedShowSeats);
        booking.setBookingDate(new Date());
        booking.setPayments(new ArrayList<>());
       // booking.setAmount(pricingService.calculatePrice(savedShowSeats,show));
        booking.setAmount(2000);
        booking.setShow(bookedShow);
        booking.setTicketStatus(TicketStatus.PENDING);
        Booking savedBooking = bookingRepository.save(booking);

        return savedBooking;
    }
}
