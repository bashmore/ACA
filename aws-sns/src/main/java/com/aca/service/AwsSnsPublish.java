package com.aca.service;

import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.PublishResult;

public class AwsSnsPublish {
	
	public String publishMessage(String message, String subject) {
		
		PublishRequest publishRequest = new PublishRequest(SnsClient.myTopic, message, subject);
	
		AmazonSNSClient snsClient = SnsClient.getAwsClient();
		
		PublishResult publishResult = snsClient.publish(publishRequest);
		
		//print MessageID of message published to SNS topic
		System.out.println("MessageID: " + publishResult.getMessageId());
		
		return publishResult.getMessageId();
	}

}
