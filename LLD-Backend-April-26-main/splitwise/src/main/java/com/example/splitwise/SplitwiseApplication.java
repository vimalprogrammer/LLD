package com.example.splitwise;

import com.example.splitwise.commands.Command;
import com.example.splitwise.commands.CommandExecutor;
import com.example.splitwise.commands.RegisterCommand;
import com.example.splitwise.commands.SettleUpCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SplitwiseApplication implements CommandLineRunner {

	@Autowired
	CommandExecutor commandExecutor;

	public static void main(String[] args) {
		SpringApplication.run(SplitwiseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		commandExecutor.executeCommand(input);
	}
}
