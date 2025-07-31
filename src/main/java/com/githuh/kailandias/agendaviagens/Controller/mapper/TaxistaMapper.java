package com.githuh.kailandias.agendaviagens.Controller.mapper;

import com.githuh.kailandias.agendaviagens.Controller.dto.TaxistaDTO;
import com.githuh.kailandias.agendaviagens.Model.Taxista;
import com.githuh.kailandias.agendaviagens.Model.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TaxistaMapper {

    @Mapping(source = "usuario.idUsuario", target = "idUsuario")
    TaxistaDTO toDto(Taxista taxista);

    Taxista toEntity(TaxistaDTO dto);

    default Usuario map(Long idUsuario) {
        if (idUsuario == null) {
            return null;
        }
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(idUsuario);
        return usuario;
    }
}
