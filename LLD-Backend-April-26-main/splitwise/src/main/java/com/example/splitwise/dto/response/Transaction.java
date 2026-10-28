package com.example.splitwise.dto.response;

import com.example.splitwise.model.enums.UserExpenseType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

    private String user;

    private int amount;

    private UserExpenseType userExpenseType;
}
