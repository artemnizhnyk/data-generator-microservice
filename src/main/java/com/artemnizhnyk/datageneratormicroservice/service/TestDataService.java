package com.artemnizhnyk.datageneratormicroservice.service;

import com.artemnizhnyk.datageneratormicroservice.model.test.DataTestOptions;

public interface TestDataService {

    void sendMessages(DataTestOptions testOptions);
}
