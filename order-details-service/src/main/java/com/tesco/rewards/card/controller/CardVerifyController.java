package com.tesco.rewards.card.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.tesco.rewards.card.model.CardVerifyRequest;
import com.tesco.rewards.card.model.CardVerifyResponse;
import com.tesco.rewards.card.service.CardVerifyService;
import com.tesco.rewards.card.validator.CardVerifyValidator;

@RestController
public class CardVerifyController {
	
	@Autowired
	CardVerifyValidator cardVerifyValidator;
	
	@Autowired
	CardVerifyService cardVerifyService;
	
	
	@PostMapping("/card/validate")
	public CardVerifyResponse validateCard(@RequestBody CardVerifyRequest request,
										   @RequestHeader(value="client-id", required=false) String clientId
										  
										  ) {
		
		//Get the request from consumers
		//validate the request
		//prepare the request for service 
		//call the service and fet the response
		//prepare the controller service 
		//send controller response to consumer.
		
		
		CardVerifyResponse response = new CardVerifyResponse();
		
		response.setCardStatus(true);
		response.setStatusCode("0");
		response.setStatusMsg("success");
		
		
		return response;
	}
	

}
