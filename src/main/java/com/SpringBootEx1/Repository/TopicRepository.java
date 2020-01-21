package com.SpringBootEx1.Repository;

import org.springframework.data.repository.CrudRepository;
import com.SpringBootEx1.Entity.Topic;

public interface TopicRepository extends CrudRepository<Topic ,String>
{
	
	

}
