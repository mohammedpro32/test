package com.kata.bank.service;

import com.kata.bank.model.Client;
import com.kata.bank.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kata.bank.util.AuthorizedDeposit;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private AccountService accountService;
    @Override
    public Client findClient(int id) {
        return clientRepository.getById(id);
    }

    @Override
    public void deposit(int idClient, int idAccount, double amount) {
        if (AuthorizedDeposit.convertAmount(amount)) {
        }
        else {
            accountService.updateAccountByidAccountAndIdClient(idClient, idAccount, amount);
        }
    }

    @Override
    public void withdrawAmount(int idClient, int idAccountDouble, Double amount) {
        accountService.withdrawAmountByidAccountAndIdClient(idClient,idAccountDouble,amount);
    }

    @Override
    public String display(int idClient, int idAccount) {
        return accountService.displaydrawAmountByidAccountAndIdClient(1,1);
    }

}
