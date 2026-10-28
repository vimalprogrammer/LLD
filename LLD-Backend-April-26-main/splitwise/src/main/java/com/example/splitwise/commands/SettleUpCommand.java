package com.example.splitwise.commands;

import com.example.splitwise.controller.SettleUpController;
import com.example.splitwise.dto.request.SettleUpGroupRequestDto;
import com.example.splitwise.dto.request.SettleUpUserRequest;
import com.example.splitwise.dto.response.SettleUpResponse;
import org.springframework.stereotype.Component;

@Component
public class SettleUpCommand implements Command{

    private final SettleUpController settleUpController;

    public SettleUpCommand(SettleUpController settleUpController) {
        this.settleUpController = settleUpController;
    }

    @Override
    public boolean matches(String input) {
        String words[] = input.split(" ");
        if(words[0].equalsIgnoreCase("settleup")) {
            return true;
        }
        return false;
    }

    @Override
    public void execute(String input) {
        String words[] = input.split(" ");
        if(words.length < 2) {
            throw new RuntimeException("Invalid command");
        }

        SettleUpResponse response = null;
        if(words[1].equalsIgnoreCase("group")) {
            // group settle up
            SettleUpGroupRequestDto request = new SettleUpGroupRequestDto();
            request.setGroupId(Integer.parseInt(words[2]));
            response = settleUpController.settleUpGroup(request);
        }
        else {
            // user settle up
            SettleUpUserRequest request = new SettleUpUserRequest();
            request.setUserId(Integer.parseInt(words[2]));
            response = settleUpController.settleUpUser(request);
        }

        System.out.println(response.getMessage());
        System.out.println(response.getStatus());
        System.out.println(response.getTransactions());
    }
}
