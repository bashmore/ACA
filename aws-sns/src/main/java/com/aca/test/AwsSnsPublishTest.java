package com.aca.test;

import com.aca.service.AwsSnsPublish;

public class AwsSnsPublishTest {

	public static void main(String[] args) {
		
		AwsSnsPublishTest test = new AwsSnsPublishTest();
		test.start();

	}
	
	private void start() {
		
		String myMessage = "blah blah blah";
		String mySubject = "blah";
		
		AwsSnsPublish awsSnsPublish = new AwsSnsPublish();
		
		awsSnsPublish.publishMessage(myMessage, mySubject);
	}

}
