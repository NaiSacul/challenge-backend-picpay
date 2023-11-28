package com.naisacul.challengebackendpicpay.repositories;

import com.naisacul.challengebackendpicpay.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
