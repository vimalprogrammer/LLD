package com.example.splitwise.controller;

import com.example.splitwise.dto.request.SettleUpGroupRequestDto;
import com.example.splitwise.dto.request.SettleUpUserRequest;
import com.example.splitwise.dto.response.ResponseStatus;
import com.example.splitwise.dto.response.SettleUpResponse;
import com.example.splitwise.dto.response.Transaction;
import com.example.splitwise.service.SettleUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class SettleUpController {

    private final SettleUpService settleUpService;

    @Autowired
    public SettleUpController(SettleUpService settleUpService) {
        this.settleUpService = settleUpService;
    }

    public SettleUpResponse settleUpUser(SettleUpUserRequest request) {
        // TODO
        return null;
    }

    public SettleUpResponse settleUpGroup(SettleUpGroupRequestDto requestDto) {
        SettleUpResponse response = new SettleUpResponse();

        try {
            List<Transaction> transactions = settleUpService.settleUpGroup(requestDto.getGroupId());
            response.setTransactions(transactions);
            response.setStatus(ResponseStatus.SUCCESS);
            response.setMessage("Transactions generated successfully");
        }
        catch (Exception e) {
            response.setStatus(ResponseStatus.FAILED);
            response.setMessage(e.getMessage());
        }
        return response;
    }
}
