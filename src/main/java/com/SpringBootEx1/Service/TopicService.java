package com.SpringBootEx1.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootEx1.Entity.Topic;
import com.SpringBootEx1.Repository.TopicRepository;

@Service
public class TopicService 
{	
	@Autowired
	private TopicRepository topicRepository;
	
	
	public List<Topic> getTopics() 
	{		
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	public Topic getTopic(String id) 
    {	
	   return topicRepository.findOne(id);
    }

	public void postTopic(Topic tp) 
	{		
		topicRepository.save(tp);
	}

	public void putTopic(String id, Topic tp) {
		topicRepository.save(tp);
	}

	public void deleteTopic(String id) {
		topicRepository.delete(id);
	}

}
