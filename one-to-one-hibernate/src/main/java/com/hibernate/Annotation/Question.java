package com.hibernate.Annotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {
	
	@Id
	@Column(name="question_id")
	private int queId;
	private String que;
	
	@OneToOne
	private Answer ans;
	
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Question(int queId, String que, Answer ans) {
		super();
		this.queId = queId;
		this.que = que;
		this.ans = ans;
	}
	
	public int getQueId() {
		return queId;
	}
	
	public void setQueId(int queId) {
		this.queId = queId;
	}
	public String getQue() {
		return que;
	}
	public void setQue(String que) {
		this.que = que;
	}
	public Answer getAns() {
		return ans;
	}
	public void setAns(Answer ans) {
		this.ans = ans;
	}

	@Override
	public String toString() {
		return "Question [queId=" + queId + ", que=" + que + ", ans=" + ans + "]";
	}
	
	

}
