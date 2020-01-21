package com.SpringBootEx1.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	
	@Id
	private String topic;
	private String course;
	private String description;
	
	public Topic()
	{
		
	}
	
	public Topic(String topic, String course, String description) {
		super();
		this.topic = topic;
		this.course = course;
		this.description = description;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
