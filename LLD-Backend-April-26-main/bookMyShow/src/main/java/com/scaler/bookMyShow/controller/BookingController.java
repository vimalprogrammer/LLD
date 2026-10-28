package com.scaler.bookMyShow.controller;

import com.scaler.bookMyShow.dto.BookingRequest;
import com.scaler.bookMyShow.dto.BookingResponse;
import com.scaler.bookMyShow.model.Booking;
import com.scaler.bookMyShow.model.enums.ResponseStatus;
import com.scaler.bookMyShow.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {

    private final BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    BookingResponse bookTicket(BookingRequest bookingRequest) {
        BookingResponse response = new BookingResponse();
        try {
            Booking booking = bookingService.bookTicket(bookingRequest.getShowId(),
                    bookingRequest.getUserId(),
                    bookingRequest.getShowSeatsIds());
            response.setBookingId(booking.getId());
            response.setAmount(booking.getAmount());
            response.setScreenName(booking.getShow().getScreen().getName());
            response.setStatus(ResponseStatus.SUCCESS);

        }
        catch (Exception e) {
            response.setStatus(ResponseStatus.FAILED);
            response.setMessage("Booking request failed."+e.getMessage());
        }

        return response;
    }
}
