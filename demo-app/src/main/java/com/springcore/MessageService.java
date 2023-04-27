package com.springcore;

public class MessageService {
	
	private String textMsg;
	private String senderName;
	
	
	
	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		System.out.println("MessageService Setter method called ...");
		this.senderName = senderName;
	}

	public MessageService() {
		super();
		System.out.println("MessageService without filed consructor called ...");
	}
	
	public MessageService(String textMsg) {
		super();
		System.out.println("MessageService all filed consructor called ...");
		this.textMsg = textMsg;
		
	}

	public String getTextMsg() {
		return textMsg;
	}

	public void setTextMsg(String textMsg) {
		System.out.println("MessageService Setter method called ...");
		this.textMsg = textMsg;
	}

	@Override
	public String toString() {
		return "MessageService [textMsg=" + textMsg + "]";
	}
	
	
}
