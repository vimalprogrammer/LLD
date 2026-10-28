package com.example.splitwise.service;

import com.example.splitwise.dto.response.Transaction;
import com.example.splitwise.exceptions.GroupNotFoundException;
import com.example.splitwise.factory.SettleUpStrategyFactory;
import com.example.splitwise.model.Expense;
import com.example.splitwise.model.Group;
import com.example.splitwise.model.UserExpense;
import com.example.splitwise.repository.GroupRepository;
import com.example.splitwise.strategy.SettleUpStrategy;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SettleUpService {

    private final GroupRepository groupRepository;
    private final SettleUpStrategy settleUpStrategy;

    public SettleUpService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
        this.settleUpStrategy = SettleUpStrategyFactory.getSettleUpStrategy("heap");
    }

    public List<Transaction> settleUpGroup(int groupId) {
        Optional<Group> groupOptional = groupRepository.findById(groupId);
        if(groupOptional.isEmpty()) {
            throw new GroupNotFoundException("Invalid group id: "+groupId);
        }

        Group currGroup = groupOptional.get();
        List<Expense> expenses = currGroup.getExpenses();

        List<Expense> expensesToSettle = settleUpStrategy.settleUp(expenses);

        List<Transaction> transactions = new ArrayList<>();
        for(Expense expense: expensesToSettle) {
            for(UserExpense userExpense: expense.getUserExpenses()) {
                Transaction transaction = new Transaction();
                transaction.setAmount(userExpense.getAmount());
                transaction.setUser(userExpense.getUser().getName());
                transaction.setUserExpenseType(userExpense.getUserExpenseType());
                transactions.add(transaction);
            }
        }
        return transactions;
    }
}
