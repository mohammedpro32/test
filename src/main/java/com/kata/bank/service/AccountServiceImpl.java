package com.kata.bank.service;
import com.kata.bank.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public void updateAccountByidAccountAndIdClient(int idClient, int idAccount, double amount) {
        accountRepository.updateAccountByidAccountAndIdClient(idClient,idAccount,amount);
    }

    @Override
    public void withdrawAmountByidAccountAndIdClient(int idClient, int idAccount, double amount) {
        accountRepository.withdrawAmountByidAccountAndIdClient(idClient,idAccount,amount);
    }
    @Override
    public String displaydrawAmountByidAccountAndIdClient(int idClient, int idAccount) {
        return accountRepository.displayAmountByidAccountAndIdClient(idClient,idAccount);
    }


}
