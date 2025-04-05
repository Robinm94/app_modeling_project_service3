package com.example.asssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import reactor.core.publisher.Mono;

@RestController
public class AcctTransactionController {

	@Autowired
	  Environment environment;
	
	@Autowired
    private AcctTransactionService acctTransactionService;
	
	 @GetMapping("/")
	  public String health() {
	    return "I am Ok";
	  }
	 
	  @GetMapping("/backend")
	  public String backend() {
	    System.out.println("Inside AcctTransactionController::backend...");
	    String serverPort = environment.getProperty("local.server.port");
	    System.out.println("Port : " + serverPort);
	    return "Hello form Backend!!! " + " Host : localhost " + " :: Port : " + serverPort;
	  }
	  
	  @PostMapping("/confirmBuy")
	    public String confirmBuy(@RequestBody AcctTransaction tx) throws JsonProcessingException {
	        Mono<AcctTransaction> confirmedTransaction = acctTransactionService.confirmBuyTransaction(tx);
	        ObjectMapper objectMapper = new ObjectMapper();
	        String jsonString = objectMapper.writeValueAsString(confirmedTransaction.block());
	        return jsonString;
	    }

	    @PostMapping("/confirmSell")
	    public String confirmSell(@RequestBody AcctTransaction tx) throws JsonProcessingException {
			Mono<AcctTransaction> confirmedTransaction = acctTransactionService.confirmSellTransaction(tx);
			ObjectMapper objectMapper = new ObjectMapper();
			String jsonString = objectMapper.writeValueAsString(confirmedTransaction.block());
			return jsonString;
	    }
	  
}
