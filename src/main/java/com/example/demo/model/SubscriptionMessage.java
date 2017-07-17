package com.example.demo.model;

public class SubscriptionMessage {
	
	private String messageType;
	private String messageDetail;
	
	public SubscriptionMessage() {
		messageType="default";
		messageDetail="default message type";
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public String getMessageDetail() {
		return messageDetail;
	}
	public void setMessageDetail(String messageDetail) {
		this.messageDetail = messageDetail;
	}
	
}
