package com.scaler.bookMyShow.model;

import com.scaler.bookMyShow.model.enums.PaymentGateway;
import com.scaler.bookMyShow.model.enums.PaymentMode;
import com.scaler.bookMyShow.model.enums.PaymentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Payment extends BaseEntity{

    private Double amount;

    private Date paymentDate;

    @Enumerated(value = EnumType.STRING)
    private PaymentGateway paymentGateway;

    @Enumerated(value = EnumType.ORDINAL)
    private PaymentStatus paymentStatus;

    @Enumerated(value = EnumType.STRING)
    private PaymentMode paymentMode;

    private String refNumber;
}
