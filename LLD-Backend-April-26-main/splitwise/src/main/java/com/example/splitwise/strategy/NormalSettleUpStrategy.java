package com.example.splitwise.strategy;

import com.example.splitwise.model.Expense;

import java.util.List;

public class NormalSettleUpStrategy implements SettleUpStrategy{
    @Override
    public List<Expense> settleUp(List<Expense> expenses) {
        return List.of();
    }
}
