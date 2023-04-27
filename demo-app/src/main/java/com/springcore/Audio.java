package com.springcore;

public class Audio {
	
	private long length;
	
	public Audio() {
		super();
		System.out.println("Audio without filed consructor called ...");
	}

	public Audio(long length) {
		super();
		System.out.println("Audio all filed consructor called ...");
		this.length = length;
	}

	public long getLength() {
		return length;
	}

	public void setLength(long length) {
		System.out.println("Audio all filed consructor called ...");
		this.length = length;
	}

	@Override
	public String toString() {
		return "Audio [length=" + length + "]";
	}
	
	public String audioDuration() {
		return "Length of audio played - "+ this.length + "Minutes";
	}

}
