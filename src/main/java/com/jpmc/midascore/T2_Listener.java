package com.jpmc.midascore;

import com.jpmc.midascore.foundation.Transaction;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class T2_Listener  {
    @KafkaListener(topics = "${general.kafka-topic}", groupId = "temp")
    public void listen(Transaction record)
    {
        System.out.println(record);
    }
}
