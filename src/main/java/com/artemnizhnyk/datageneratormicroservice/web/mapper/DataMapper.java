package com.artemnizhnyk.datageneratormicroservice.web.mapper;

import com.artemnizhnyk.datageneratormicroservice.model.Data;
import com.artemnizhnyk.datageneratormicroservice.web.dto.DataDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Data, DataDto> {
}
