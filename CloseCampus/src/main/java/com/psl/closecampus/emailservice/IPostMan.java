package com.psl.closecampus.emailservice;

public interface IPostMan {
	void setFrom(String from);
	void setTo(String to);
	void setSubject(String subject);
	void setBody(String body);
	void send();
	
	
	IPostMan withFrom(String from);
	IPostMan withTo(String to);
	IPostMan withSubject(String subject);
	IPostMan withBody(String body);
}
