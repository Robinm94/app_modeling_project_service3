package com.example.asssignment;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcctTransactionRepository extends ReactiveMongoRepository<AcctTransaction, String> {
	
}
