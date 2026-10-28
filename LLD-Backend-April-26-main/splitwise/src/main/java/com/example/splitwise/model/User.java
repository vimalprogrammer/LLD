package com.example.splitwise.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends BaseEntity{

    private String name;
    private String phoneNumber;
    private String password;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Expense> expenses;
}

