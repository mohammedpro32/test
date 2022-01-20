package com.kata.bank.util;

import java.util.Currency;

public class AuthorizedDeposit {
    public static boolean convertAmount(double amount) {
        return amount >= 0.01;
    }
}
