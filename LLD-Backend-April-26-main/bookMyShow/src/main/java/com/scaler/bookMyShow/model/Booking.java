package com.scaler.bookMyShow.model;

import com.scaler.bookMyShow.model.enums.TicketStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany
    @JoinColumn
    private List<ShowSeat> showSeats;

    private Date bookingDate;

    @OneToMany
    @JoinColumn
    private List<Payment> payments;

    private int amount;

    @ManyToOne
    @JoinColumn
    private Show show;

    @Enumerated(value = EnumType.STRING)
    private TicketStatus ticketStatus;
}
