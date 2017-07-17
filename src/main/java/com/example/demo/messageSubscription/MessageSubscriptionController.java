package com.example.demo.messageSubscription;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Subscription;
import com.example.demo.model.SubscriptionMessage;
import com.example.demo.model.SubscriptionRequest;
import com.example.demo.model.SubscriptionResponse;
import com.example.demo.service.SubscriptionService;

@RestController
public class MessageSubscriptionController {

	Logger logger = LoggerFactory.getLogger(MessageSubscriptionController.class);

	@Autowired
	SubscriptionService subscriptionService;

	@RequestMapping(value="/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> sayHello() {
		return new ResponseEntity<String>("Message Subscription Microservice", HttpStatus.OK);
	}
	/**
	 * Method to Create a Subscription
	 * 
	 * @param subscription
	 * @return
	 */
	@RequestMapping(value = "/addSubscription", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> createSubscription(@RequestBody Subscription subscription) {
		HttpHeaders headers = new HttpHeaders();
		try {
			subscriptionService.saveSubscription(subscription);
		} catch (Exception ex) {
			return new ResponseEntity<Void>(headers, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	/**
	 * Method to read a Subscription
	 * 
	 * @param subscription
	 * @return
	 */
	@RequestMapping(value = "/getSubscription/{subscriptionId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<SubscriptionResponse> readSubscription(@PathVariable String subscriptionId) {
		SubscriptionResponse subscriptionResponse = new SubscriptionResponse();
		try {
			SubscriptionRequest subscriptionRequest = new SubscriptionRequest();
			Subscription subscription = subscriptionService.retrieveSubscription(subscriptionRequest);
			subscriptionResponse.setSubscription(subscription);
		} catch (Exception ex) {
			return new ResponseEntity<SubscriptionResponse>(subscriptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<SubscriptionResponse>(subscriptionResponse, HttpStatus.OK);
	}

	/**
	 * Method to update a Subscription
	 * 
	 * @param subscription
	 * @return
	 */
	@RequestMapping(value = "/updateSubscription", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> updateSubscription(@RequestBody Subscription subscription) {
		HttpHeaders headers = new HttpHeaders();
		try {
			subscriptionService.saveSubscription(subscription);
		} catch (Exception ex) {
			return new ResponseEntity<Void>(headers, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Void>(headers, HttpStatus.OK);
	}

	/**
	 * Method to post a message
	 * 
	 * @param message
	 * @return
	 */
	@RequestMapping(value = "/addMessage", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> createMessage(@RequestBody SubscriptionMessage message) {
		HttpHeaders headers = new HttpHeaders();
		try {
			subscriptionService.saveMessage(message);
		} catch (Exception ex) {
			return new ResponseEntity<Void>(headers, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
}
