package com.rana.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.rana.constant.AppConfig;

@Service
public class CabLocationService {

	@Autowired
	KafkaTemplate<String, Object> kafkaTemplate;
	
	public boolean updateLocation(String location) {
		kafkaTemplate.send(AppConfig.TOPIC_NAME,location);
		
		return true;
	}
	
}
