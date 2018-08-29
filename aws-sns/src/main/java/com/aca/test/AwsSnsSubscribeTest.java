package com.aca.test;

import com.aca.service.AwsSnsSubscription;

public class AwsSnsSubscribeTest {

	public static void main(String[] args) {
		
		AwsSnsSubscribeTest test = new AwsSnsSubscribeTest();
		test.start();

	}
	
	private void start() {
		
		String emailAddress = "xxxx@yahoo.com";
		
		AwsSnsSubscription awsSnsSubscription = new AwsSnsSubscription();
		awsSnsSubscription.subscribe(emailAddress);
	}

}
