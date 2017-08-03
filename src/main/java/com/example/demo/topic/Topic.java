package com.example.demo.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {

	
	private int topicId;
	@Id
	private String topicName;
	private String desctiption;

	public Topic() {

	}

	public Topic(int topicId, String topicName, String desctiption) {
		super();
		this.topicId = topicId;
		this.topicName = topicName;
		this.desctiption = desctiption;

	}

	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getDesctiption() {
		return desctiption;
	}

	public void setDesctiption(String desctiption) {
		this.desctiption = desctiption;
	}

}
