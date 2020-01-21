package com.SpringBootEx1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootEx1.Entity.Topic;
import com.SpringBootEx1.Service.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	TopicService t;
	
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics()
	{
		return t.getTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id)
	{
		return t.getTopic(id);
		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public List<Topic> postATopic(@RequestBody Topic tp)
	{
		t.postTopic(tp);	
		return t.getTopics();
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void putATopic(@RequestBody Topic tp,@PathVariable String id)
	{
		 t.putTopic(id,tp);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteATopic(@PathVariable String id)
	{
		t.deleteTopic(id);		
	}

	

}
