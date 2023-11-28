package com.naisacul.challengebackendpicpay.controllers;

import com.naisacul.challengebackendpicpay.domain.transaction.Transaction;
import com.naisacul.challengebackendpicpay.dtos.TransactionDTO;
import com.naisacul.challengebackendpicpay.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody TransactionDTO transactionDTO) throws Exception {

        Transaction newTransaction = this.transactionService.createTransaction(transactionDTO);

        return new ResponseEntity<>(newTransaction, HttpStatus.OK);
    }
}