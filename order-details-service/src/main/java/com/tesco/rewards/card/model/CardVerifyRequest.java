package com.tesco.rewards.card.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data 
public class CardVerifyRequest {
	
	private String cardNum;
	private String cvvNum;
	private String expDate;
	private String nameOnCard;
	

}
