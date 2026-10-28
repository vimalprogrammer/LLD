package com.scaler.bookMyShow.model;

import com.scaler.bookMyShow.model.enums.SeatType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeatType extends BaseEntity{

    @ManyToOne
    @JoinColumn
    private Show show;

    private SeatType seatType;

    private int price;
}
