package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Subscription {

	private String subscriptionId;
	List<String> messageTypes;

	public Subscription() {
		messageTypes = new ArrayList<String>();
		// hard coded for now
		messageTypes.add("Default Type1");
		messageTypes.add("Default Type2");
	}

	public String getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public List<String> getMessageTypes() {
		return messageTypes;
	}

	public void setMessageTypes(List<String> messageTypes) {
		this.messageTypes = messageTypes;
	}

}
