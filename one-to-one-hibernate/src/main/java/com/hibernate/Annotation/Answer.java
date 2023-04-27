package com.hibernate.Annotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {
	
	@Id
	@Column(name="answer_id")
	private int ansId;
	
	private String ans;
	
	
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Answer(int ansId, String ans) {
		super();
		this.ansId = ansId;
		this.ans = ans;
	}


	public int getAnsId() {
		return ansId;
	}
	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}


	@Override
	public String toString() {
		return "Answer [ansId=" + ansId + ", ans=" + ans + "]";
	}
	
	

}
