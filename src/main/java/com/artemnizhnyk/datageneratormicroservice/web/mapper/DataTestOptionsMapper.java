package com.artemnizhnyk.datageneratormicroservice.web.mapper;

import com.artemnizhnyk.datageneratormicroservice.model.test.DataTestOptions;
import com.artemnizhnyk.datageneratormicroservice.web.dto.DataTestOptionsDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataTestOptionsMapper
        extends Mappable<DataTestOptions, DataTestOptionsDto> {
}
