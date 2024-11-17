package com.jpmc.midascore;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener;

public class T2_Listener  {
    @KafkaListener(topics = "${general.kafka-topic}")
    public void listen(String record)
    {

    }
}
