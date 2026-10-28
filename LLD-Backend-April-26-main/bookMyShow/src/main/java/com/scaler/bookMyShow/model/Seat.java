package com.scaler.bookMyShow.model;

import com.scaler.bookMyShow.model.enums.SeatType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseEntity{

    private String seatName;

    private int rowVal;

    private int columnVal;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;
}
