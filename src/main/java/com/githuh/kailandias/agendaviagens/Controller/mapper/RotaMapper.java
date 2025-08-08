package com.githuh.kailandias.agendaviagens.Controller.mapper;

import com.githuh.kailandias.agendaviagens.Controller.dto.RotaDTO;
import com.githuh.kailandias.agendaviagens.Controller.dto.RotaResponseDTO;
import com.githuh.kailandias.agendaviagens.Model.Rota;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RotaMapper {

    RotaDTO toDto(Rota entity);

    @Mapping(source = "idRota", target = "idRota")
    Rota toEntity(RotaDTO dto);

    @Mapping(source = "idRota", target = "idRota")
    RotaResponseDTO toResponseDto(Rota entity);

}
