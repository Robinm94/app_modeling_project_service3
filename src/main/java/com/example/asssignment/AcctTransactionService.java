package com.example.asssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Mono;

@Service
public class AcctTransactionService {

	@Autowired
    private AcctTransactionRepository repository;

    public Mono<AcctTransaction> confirmBuyTransaction(AcctTransaction tx) {
        tx.setTransactionType("BUY");
        return repository.save(tx);
    }

    public Mono<AcctTransaction> confirmSellTransaction(AcctTransaction tx) {
        tx.setTransactionType("SELL");
        return repository.save(tx);
    }
}
