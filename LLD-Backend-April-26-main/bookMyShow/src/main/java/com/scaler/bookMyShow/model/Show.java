package com.scaler.bookMyShow.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

@Getter
@Setter
@Entity
@Table(name = "shows")
public class Show extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "screen_id")
    private Screen screen;

    @ManyToOne
    @JoinColumn
    private Movie movie;

    @ManyToOne
    @JoinColumn
    private Theatre theatre;

    private Date startTime;

    private Date endTime;

    @OneToMany(mappedBy = "show")
    private List<ShowSeat> seats;

    @OneToMany(mappedBy = "show")
    private List<ShowSeatType> showSeatTypes;
}
