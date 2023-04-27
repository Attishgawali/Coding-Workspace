package com.spring_core.reference_type;

public class B {
	private String name;
	private int y;
	
	
	
	public B(String name, int y) {
		super();
		this.name = name;
		this.y = y;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public B() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "B [name=" + name + ", y=" + y + "]";
	}

	
	
}
