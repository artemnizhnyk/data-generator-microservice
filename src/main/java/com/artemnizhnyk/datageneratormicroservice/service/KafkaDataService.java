package com.artemnizhnyk.datageneratormicroservice.service;

import com.artemnizhnyk.datageneratormicroservice.model.Data;

public interface KafkaDataService {

    void send(Data data);
}
