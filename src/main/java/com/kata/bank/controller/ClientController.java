package com.kata.bank.controller;

import com.kata.bank.model.Account;
import com.kata.bank.service.AccountService;
import com.kata.bank.service.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/client")
@CrossOrigin
public class ClientController {

    @Autowired
    ClientServiceImpl clientService;

    @Autowired
    AccountService accountService;

    @GetMapping("/deposit")
    @ResponseBody
    public void depositAmount(@RequestParam int idClient ,@RequestParam int idAccount,@RequestParam Double amount) {
        clientService.deposit(idClient,idAccount,amount);
    }

    @GetMapping("/withdraw ")
    @ResponseBody
    public void withdrawAmount(@RequestParam int idClient ,@RequestParam int idAccount,@RequestParam Double amount) {
        clientService.withdrawAmount(idClient,idAccount,amount);
    }

    @GetMapping("/display")
    @ResponseBody
    public List<Account> display (@RequestParam int idClient , @RequestParam int idAccount) {
        clientService.display(idClient,idAccount);
        return null;
    }
}
