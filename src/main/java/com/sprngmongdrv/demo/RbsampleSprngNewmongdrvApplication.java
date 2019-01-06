package com.sprngmongdrv.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class RbsampleSprngNewmongdrvApplication {

	public static void main(String[] args) {
		SpringApplication.run(RbsampleSprngNewmongdrvApplication.class, args);
	}
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public void findX(){
		mongoTemplate.findOne(null, null);
	}

}

