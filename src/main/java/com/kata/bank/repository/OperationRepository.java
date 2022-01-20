package com.kata.bank.repository;

import com.kata.bank.model.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface OperationRepository extends JpaRepository<Operation,Integer> {
}
