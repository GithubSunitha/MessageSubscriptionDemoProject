package com.example.demo.model;

public class SubscriptionResponse {
	
	private int numEventTypes;
	private Subscription subscription;
	
	public SubscriptionResponse() {
		numEventTypes = 100;
	}

	/**
	 * Method to return the number of event types received by the Subscription
	 * @return the numEventTypes
	 */
	public int getNumEventTypes() {
		return numEventTypes;
	}

	/**
	 * @param numEventTypes the numEventTypes to set
	 */
	public void setNumEventTypes(int numEventTypes) {
		this.numEventTypes = numEventTypes;
	}

	/**
	 * @return the subscription
	 */
	public Subscription getSubscription() {
		return subscription;
	}

	/**
	 * @param subscription the subscription to set
	 */
	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}
}
