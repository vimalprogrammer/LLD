package com.example.splitwise.dto.response;

import com.example.splitwise.model.UserExpense;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SettleUpResponse {

    private String message;
    private ResponseStatus status;

    private List<Transaction> transactions;
}
