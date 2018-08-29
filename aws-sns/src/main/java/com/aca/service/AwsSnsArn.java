package com.aca.service;

import java.util.List;

import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.ListSubscriptionsByTopicResult;
import com.amazonaws.services.sns.model.Subscription;

public class AwsSnsArn {

	public void printArns() {
		AmazonSNSClient snsClient = SnsClient.getAwsClient();
		
		ListSubscriptionsByTopicResult subscriptions = snsClient.listSubscriptionsByTopic(SnsClient.myTopic);
		
		List<Subscription> subs = subscriptions.getSubscriptions();
		
		for (Subscription sub : subs) {
			System.out.println("============================");
			System.out.println("endpoint: " + sub.getEndpoint());
			System.out.println("Arn: " + sub.getSubscriptionArn());
		}
	}
}
