package com.tesco.rewards.card.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tesco.rewards.card.dao.CardVerifyDao;
import com.tesco.rewards.card.model.CardVerifyRequest;
import com.tesco.rewards.card.model.CardVerifyResponse;
import com.tesco.rewards.card.service.CardVerifyService;

@Component
public class CardVerifyServiceImpl implements CardVerifyService {

	
	
	public CardVerifyResponse validateCard(CardVerifyRequest request) {
		
		//1. get the request from controller
		//2. prepare the request for dao
		//3. call the dao and get the response
		//4. prepare the service response
		
		
		return null;
	}

}
