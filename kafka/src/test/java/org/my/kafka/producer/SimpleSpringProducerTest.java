package org.my.kafka.producer;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleSpringProducerTest {

    @Test
    @Ignore
    public void send() {
        SimpleSpringProducer producer = new SimpleSpringProducer();

        for (int i = 0; i < 500; i++) {
            producer.send(String.valueOf(i), String.valueOf(i));
        }
    }
}