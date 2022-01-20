package com.kata.bank.service;
import com.kata.bank.model.Client;


public interface ClientService {
    public Client findClient(int id);

    void deposit(int idClient, int idAccount, double amount);

    public void withdrawAmount(int idClient ,int idAccountDouble, Double amount);

    String display(int idClient, int idAccount);
}
