package com.example.demo.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.example.demo.topic.Topic;

@Entity
public class Course {

	private int courseId;
	@Id
	private String courseName;
	private String desctiption;

	@ManyToOne
	private Topic topic;

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public Course() {

	}

	public int getCourseId() {
		return courseId;
	}

	public Course(int courseId, String courseName, String desctiption, String topicName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.desctiption = desctiption;
		this.topic = new Topic(0, topicName, "");
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDesctiption() {
		return desctiption;
	}

	public void setDesctiption(String desctiption) {
		this.desctiption = desctiption;
	}

}
