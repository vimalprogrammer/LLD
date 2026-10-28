package com.scaler.bookMyShow.dto;

import com.scaler.bookMyShow.model.enums.ResponseStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookingResponse {

    private int amount;
    private int bookingId;
    private ResponseStatus status;
    private String screenName;
    private String message;
}
