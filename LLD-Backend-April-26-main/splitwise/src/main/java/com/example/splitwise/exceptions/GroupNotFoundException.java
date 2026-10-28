package com.example.splitwise.exceptions;

import com.example.splitwise.repository.GroupRepository;

public class GroupNotFoundException extends RuntimeException{

    public GroupNotFoundException(String message) {
        super(message);
    }
}
