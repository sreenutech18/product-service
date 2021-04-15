package com.tesco.rewards.card.dao;

import org.springframework.stereotype.Component;

import com.tesco.rewards.card.model.CardVerifyDaoRequest;
import com.tesco.rewards.card.model.CardVerifyDaoResponse;

//@Component
public interface CardVerifyDao {
	
	public CardVerifyDaoResponse validateCard(CardVerifyDaoRequest request); 

}
