package com.scaler.bookMyShow.controller;

import com.scaler.bookMyShow.dto.SignUpRequestDto;
import com.scaler.bookMyShow.dto.SignupResponseDto;
import com.scaler.bookMyShow.model.User;
import com.scaler.bookMyShow.model.enums.ResponseStatus;
import com.scaler.bookMyShow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public SignupResponseDto signUp(SignUpRequestDto request) {
        SignupResponseDto response = new SignupResponseDto();

        try {
            User user = userService.signup(request.getName(),
                    request.getEmail(),
                    request.getPassword());
            response.setStatus(ResponseStatus.SUCCESS);
            response.setUserId(user.getId());

        }
        catch (Exception e) {
            response.setStatus(ResponseStatus.FAILED);
        }

        return response;
    }
}
