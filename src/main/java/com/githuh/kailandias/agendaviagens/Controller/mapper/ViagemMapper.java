package com.githuh.kailandias.agendaviagens.Controller.mapper;

import com.githuh.kailandias.agendaviagens.Controller.dto.ViagemResponseDTO;
import com.githuh.kailandias.agendaviagens.Model.Viagem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {TaxistaMapper.class, RotaMapper.class})
public interface ViagemMapper {

    @Mapping(source = "taxista", target = "taxista")
    @Mapping(source = "rota", target = "rota")
    ViagemResponseDTO toResponseDto(Viagem viagem);

}
