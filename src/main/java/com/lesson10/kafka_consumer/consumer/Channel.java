package com.lesson10.kafka_consumer.consumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface Channel {
    String BROADCASTS = "broadcasts";

    @Input(BROADCASTS)
    SubscribableChannel broadcasts();
}
