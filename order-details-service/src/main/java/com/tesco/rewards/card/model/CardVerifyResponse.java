package com.tesco.rewards.card.model;

import lombok.Data;

@Data
public class CardVerifyResponse {
	
	private String statusCode;
	private String statusMsg;
	private boolean cardStatus;

}
