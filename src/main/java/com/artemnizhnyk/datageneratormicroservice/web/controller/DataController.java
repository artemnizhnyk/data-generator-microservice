package com.artemnizhnyk.datageneratormicroservice.web.controller;

import com.artemnizhnyk.datageneratormicroservice.model.Data;
import com.artemnizhnyk.datageneratormicroservice.model.test.DataTestOptions;
import com.artemnizhnyk.datageneratormicroservice.service.KafkaDataService;
import com.artemnizhnyk.datageneratormicroservice.service.TestDataService;
import com.artemnizhnyk.datageneratormicroservice.web.dto.DataDto;
import com.artemnizhnyk.datageneratormicroservice.web.dto.DataTestOptionsDto;
import com.artemnizhnyk.datageneratormicroservice.web.mapper.DataMapper;
import com.artemnizhnyk.datageneratormicroservice.web.mapper.DataTestOptionsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api/v1/data")
@RestController
public class DataController {

    private final KafkaDataService kafkaDataService;
    private final TestDataService testDataService;

    private final DataMapper dataMapper;
    private final DataTestOptionsMapper dataTestOptionsMapper;

    @PostMapping("/send")
    public void send(@RequestBody DataDto dataDto) {
        Data data = dataMapper.toEntity(dataDto);
        kafkaDataService.send(data);
    }

    @PostMapping("/test/send")
    public void testSend(@RequestBody DataTestOptionsDto testOptionsDto) {
        DataTestOptions testOptions = dataTestOptionsMapper.toEntity(testOptionsDto);
        testDataService.sendMessages(testOptions);
    }
}
