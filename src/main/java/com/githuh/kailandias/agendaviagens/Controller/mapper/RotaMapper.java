package com.githuh.kailandias.agendaviagens.Controller.mapper;

import com.githuh.kailandias.agendaviagens.Controller.dto.RotaDTO;
import com.githuh.kailandias.agendaviagens.Model.Rota;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RotaMapper {

    RotaDTO toDto(Rota entity);

    Rota toEntity(RotaDTO dto);

}
