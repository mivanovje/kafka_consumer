package com.lesson10.kafka_consumer.consumer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ListenerDemoChannel {
    private Logger logger = LogManager.getLogger();

    @StreamListener(Channel.BROADCASTS)
    public void broadcasted(String message) {
        logger.info(message);
    }
}
