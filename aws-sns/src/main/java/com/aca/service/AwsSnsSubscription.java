package com.aca.service;

import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.SubscribeRequest;
import com.amazonaws.services.sns.model.SubscribeResult;
import com.amazonaws.services.sns.model.UnsubscribeRequest;
import com.amazonaws.services.sns.model.UnsubscribeResult;

public class AwsSnsSubscription {

	public int subscribe(String emailAddress) {
		
		AmazonSNSClient snsClient = SnsClient.getAwsClient();
			
			SubscribeRequest request = new SubscribeRequest();
			request.setProtocol("email");
			request.setTopicArn(SnsClient.myTopic);
			request.setEndpoint(emailAddress);
			
			SubscribeResult result = snsClient.subscribe(request);
			
			int statusCode = result.getSdkHttpMetadata().getHttpStatusCode();
			System.out.println(" result status code: " + statusCode);
			
			return statusCode;
			
	}
	
	public int Unsubscribe(String arn) {
		
		AmazonSNSClient snsClient = SnsClient.getAwsClient();
		
		UnsubscribeRequest request = new UnsubscribeRequest();
		request.setSubscriptionArn(arn);
		
		UnsubscribeResult result = snsClient.unsubscribe(request);
		
		int statusCode = result.getSdkHttpMetadata().getHttpStatusCode();
		System.out.println(" result of AWS unsubscription of arn: " + arn + " status code: " + statusCode);
		
		return statusCode;
		
	}
}
