package com.tesco.rewards.card.service;

import com.tesco.rewards.card.model.CardVerifyRequest;
import com.tesco.rewards.card.model.CardVerifyResponse;


public interface CardVerifyService {
	
public CardVerifyResponse validateCard(CardVerifyRequest request); 
	

}
