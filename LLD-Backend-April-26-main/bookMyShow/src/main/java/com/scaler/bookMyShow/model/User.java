package com.scaler.bookMyShow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends BaseEntity{

    private String name;

    private String email; //findByEmail

    private String password;

    @OneToMany(mappedBy = "user")
    private List<Booking> bookings;
}
