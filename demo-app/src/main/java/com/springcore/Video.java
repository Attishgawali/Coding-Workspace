package com.springcore;

public class Video {
	
	private String format;
	
	public Video() {
		super();
		System.out.println("Video without filed consructor called ...");
	}

	public Video(String format) {
		super();
		System.out.println("Video all filed consructor called ...");
		this.format = format;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		System.out.println("Video all filed consructor called ...");
		this.format = format;
	}

	@Override
	public String toString() {
		return "Video [format=" + format + "]";
	}
	
	public String videoFromat() {
		return "format of Vidoe is - "+ this.format;
	}
	

}
