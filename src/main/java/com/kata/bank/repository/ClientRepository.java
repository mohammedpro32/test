package com.kata.bank.repository;

import com.kata.bank.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ClientRepository extends JpaRepository<Client,Integer> {
}
