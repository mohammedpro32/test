package com.kata.bank.model;

import java.time.Instant;
import java.util.Currency;
import java.util.Locale;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;

@Entity
public class Operation {

 public String getId() {
  return id;
 }

 public void setId(String id) {
  this.id = id;
 }

 public String getAccountId() {
  return accountId;
 }

 public void setAccountId(String accountId) {
  this.accountId = accountId;
 }

 public Instant getDate() {
  return date;
 }

 public void setDate(Instant date) {
  this.date = date;
 }

 public String getLabel() {
  return label;
 }

 public void setLabel(String label) {
  this.label = label;
 }

 public double getAmount() {
  return amount;
 }

 public void setAmount(double amount) {
  this.amount = amount;
 }

 public String getCurrency() {
  return currency;
 }

 public void setCurrency(String currency) {
  this.currency = currency;
 }

 @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;


    private String accountId;


    private Instant date ;

    private String label;

    private double amount;


    private String currency ;//= Currency.getInstance(Locale.getDefault());

}