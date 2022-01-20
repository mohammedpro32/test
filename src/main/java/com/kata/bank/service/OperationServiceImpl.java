package com.kata.bank.service;


import java.time.Instant;
import java.util.Currency;
import java.util.List;

import com.kata.bank.model.Account;
import com.kata.bank.model.Operation;
import com.kata.bank.repository.AccountRepository;
import com.kata.bank.repository.OperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.util.Objects.requireNonNull;

@Service
public class OperationServiceImpl implements OperationService {

    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private OperationRepository operationRepository;

    /*public List<Operation> findOperations(String accountId,
                                          Instant startOperationDate,
                                          Instant endOperationDate) {

        return operationRepository
            .findOperationsByAccountIdAndDateBetweenOrderByDateDesc(accountId,
                requireNonNull(startOperationDate),
                requireNonNull(endOperationDate));
    }*/


    @Override
    public void saveOperation(Operation operation) {

        Account account = null; //getAccount(operation);

        double newPotentialAccountAmount = getNewPotentialAccountAmount(account, operation);

        if (!isOperationAllowed(account, newPotentialAccountAmount)) {
            //throw new UnauthorizedOperationException(account, operation);
        }

        //account.setAmount(newPotentialAccountAmount);



        accountRepository.save(account);
        operationRepository.save(requireNonNull(operation));
    }

  /*  @Autowired
    private Account getAccount(Operation operation) {
        return null;
        //return requireNonNull(accountRepository.findOne(operation.getAccountId()));
    }*/

    private double getNewPotentialAccountAmount(Account account, Operation operation) {

        /*double accountAmount = account.getAmount();
        double operationAmount = operation.getAmount();

        String accountCurrency = account.getCurrency();
        Currency operationCurrency = operation.getCurrency();

       // double
         //   operationAmountWithAccountCurrency =
            //convertAmount(operationAmount, operationCurrency, accountCurrency);
*/
        return 5 ; //+ operationAmountWithAccountCurrency;
    }

    private boolean isOperationAllowed(Account account, double newPotentialAccountAmount) {
       // return account.isAllowNegativeAmount() || newPotentialAccountAmount >= 0;
        return true;
    }
}
