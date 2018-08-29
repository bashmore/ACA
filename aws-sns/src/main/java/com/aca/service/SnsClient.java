package com.aca.service;

import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.sns.AmazonSNSClient;

public class SnsClient {
	
	// AWS credentials
	
	private static final String ACCESS_KEY = "AKIAJTHLKBCFW6GJ3ZOA";
	private static final String SECRET_KEY = "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";
	
	public static final String myTopic = "arn:aws:sns:us-east-1:804338056114:hi";
	
	public static AmazonSNSClient getAwsClient() {
		
		AmazonSNSClient snsClient = new AmazonSNSClient(new BasicAWSCredentials(ACCESS_KEY, SECRET_KEY));
		
		return snsClient;
	}
	



}
