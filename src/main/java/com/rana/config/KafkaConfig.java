package com.rana.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.rana.constant.AppConfig;




@Configuration
public class KafkaConfig {
	
	@Bean
	public NewTopic topic() {
		return TopicBuilder
				.name(AppConfig.TOPIC_NAME)
				.build();
	}

}
