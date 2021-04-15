package com.tesco.rewards.card.validator;

import org.springframework.stereotype.Component;

import com.tesco.rewards.card.model.CardVerifyRequest;

@Component
public class CardVerifyValidator {
	
	public void validateRequest(CardVerifyRequest request, String clientId, String reqId, String msfts) {
		
		//validate the request, if the data is invalid then throw the user defined exception
		
	}

}
