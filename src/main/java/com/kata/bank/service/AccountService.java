package com.kata.bank.service;

public interface AccountService {
    public void updateAccountByidAccountAndIdClient(int idClient, int idAccount, double amount);
    public void withdrawAmountByidAccountAndIdClient(int idClient, int idAccount, double amount);
    public String displaydrawAmountByidAccountAndIdClient(int idClient, int idAccount);
}
