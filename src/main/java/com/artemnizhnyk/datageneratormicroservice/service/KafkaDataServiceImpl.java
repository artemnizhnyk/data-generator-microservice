package com.artemnizhnyk.datageneratormicroservice.service;

import com.artemnizhnyk.datageneratormicroservice.model.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.kafka.sender.KafkaSender;

@RequiredArgsConstructor
@Service
public class KafkaDataServiceImpl implements KafkaDataService {

    private final KafkaSender<String, Object> sender;

    @Override
    public void send(final Data data) {
    }
}
