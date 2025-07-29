package com.githuh.kailandias.agendaviagens.Controller.mapper;

import com.githuh.kailandias.agendaviagens.Controller.dto.UsuarioDTO;
import com.githuh.kailandias.agendaviagens.Model.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    UsuarioDTO toDto(Usuario usuario);

    Usuario toEntity(UsuarioDTO dto);


}
