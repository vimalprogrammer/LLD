package com.example.splitwise.factory;

import com.example.splitwise.strategy.HeapSettleUpStrategy;
import com.example.splitwise.strategy.NormalSettleUpStrategy;
import com.example.splitwise.strategy.SettleUpStrategy;

import java.nio.file.Path;

public class SettleUpStrategyFactory {

    public static SettleUpStrategy getSettleUpStrategy(String settleUpStrategy) {
        if(settleUpStrategy.equalsIgnoreCase("heap")) {
            return new HeapSettleUpStrategy();
        }
       return new NormalSettleUpStrategy();
    }
}
