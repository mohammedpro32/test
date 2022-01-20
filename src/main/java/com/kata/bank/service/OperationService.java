package com.kata.bank.service;

import com.kata.bank.model.Operation;
import java.time.Instant;
import java.util.List;


public interface OperationService {

    public void saveOperation(Operation operation);
}
