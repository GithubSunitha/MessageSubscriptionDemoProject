package com.example.demo.service;

import com.example.demo.model.Subscription;
import com.example.demo.model.SubscriptionMessage;
import com.example.demo.model.SubscriptionRequest;
import com.example.demo.service.exception.SubscriptionException;

public interface SubscriptionService {
	public void saveSubscription(Subscription subscription) throws SubscriptionException;
	public Subscription retrieveSubscription(SubscriptionRequest subscriptionRequest) throws SubscriptionException;
	public void saveMessage(SubscriptionMessage message) throws SubscriptionException;
}
