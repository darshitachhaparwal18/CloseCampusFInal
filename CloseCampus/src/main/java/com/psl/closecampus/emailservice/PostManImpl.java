package com.psl.closecampus.emailservice;

import java.util.Arrays;
import java.util.List;

import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.model.Body;
import com.amazonaws.services.simpleemail.model.Content;
import com.amazonaws.services.simpleemail.model.Destination;
import com.amazonaws.services.simpleemail.model.Message;
import com.amazonaws.services.simpleemail.model.SendEmailRequest;
import com.sun.org.apache.bcel.internal.generic.DSTORE;

public class PostManImpl implements IPostMan {

	private String from, to, subject, body;
	private AmazonSimpleEmailService amazonSimpleEmailService;

	public PostManImpl(AmazonSimpleEmailService amazonSimpleEmailService) {
		this.amazonSimpleEmailService = amazonSimpleEmailService;
	}

	@Override
	public void setFrom(String from) {
		this.from = from;
	}

	@Override
	public void setTo(String to) {
		this.to = to;
	}

	@Override
	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public void send() {
		Destination destination = new Destination(getToAsList());
		SendEmailRequest request = new SendEmailRequest(from, destination, createMessage());
		amazonSimpleEmailService.sendEmail(request);
	}

	private Message createMessage() {
		Body amazonBody = new Body();
		amazonBody.setText(new Content(body));
		Message message = new Message(new Content(subject),amazonBody);
		return message;
	}

	@Override
	public IPostMan withFrom(String from) {
		this.from = from;
		return this;
	}

	@Override
	public IPostMan withTo(String to) {
		this.to = to;
		return this;
	}

	@Override
	public IPostMan withSubject(String subject) {
		this.subject = subject;
		return this;
	}

	@Override
	public IPostMan withBody(String body) {
		this.body = body;
		return this;
	}
	
	private List<String> getToAsList(){
		return Arrays.asList(to.split(","));
	}

}
