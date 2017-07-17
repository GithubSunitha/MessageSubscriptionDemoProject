package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.model.Subscription;
import com.example.demo.model.SubscriptionMessage;
import com.example.demo.model.SubscriptionRequest;
import com.example.demo.service.SubscriptionService;
import com.example.demo.service.exception.SubscriptionException;

/**
 * Class that holds the service methods 
 * Logic depends on where the actual data store is located which could be accessed directly or through a REST API 
 * @author Sunitha
 *
 */
@Service("subscriptionService")
public class SubscriptionServiceImpl implements SubscriptionService {

	public void saveSubscription(Subscription subscription) throws SubscriptionException {
		//save subscription 		
	}
	
	public Subscription retrieveSubscription(SubscriptionRequest subscriptionRequest) throws SubscriptionException {
		Subscription subscription = new Subscription();
		//retrieve subscription
		return subscription;
	}
	
	public void saveMessage(SubscriptionMessage message) throws SubscriptionException {
		//post message
	}

}
