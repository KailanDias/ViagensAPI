package com.githuh.kailandias.agendaviagens.Controller.mapper;

import com.githuh.kailandias.agendaviagens.Controller.dto.UsuarioDTO;
import com.githuh.kailandias.agendaviagens.Model.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    // Adicione esta anotação para corrigir o erro
    @Mapping(source = "idUsuario", target = "id")
    UsuarioDTO toDto(Usuario usuario);

    @Mapping(target = "idUsuario", ignore = true)
    Usuario toEntity(UsuarioDTO dto);

//    @Mapping(target = "id", ignore = true)
//    @Mapping(target = "email", ignore = true) // Ignora campos que não devem ser atualizados a partir do DTO
//    @Mapping(target = "senha", ignore = true)
//    @Mapping(target = "dataCadastro", ignore = true)
//    void updateEntityFromDto(UsuarioDTO dto, @MappingTarget Usuario usuario);

}
