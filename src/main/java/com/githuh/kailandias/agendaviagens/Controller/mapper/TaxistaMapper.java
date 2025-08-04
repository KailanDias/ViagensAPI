package com.githuh.kailandias.agendaviagens.Controller.mapper;

import com.githuh.kailandias.agendaviagens.Controller.dto.TaxistaDTO;
import com.githuh.kailandias.agendaviagens.Controller.dto.TaxistaResponseDTO;
import com.githuh.kailandias.agendaviagens.Model.Taxista;
import com.githuh.kailandias.agendaviagens.Model.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TaxistaMapper {

    TaxistaDTO toDto(Taxista taxista);

    @Mapping(source = "idUsuario", target = "usuario")
    Taxista toEntity(TaxistaDTO dto);

    @Mapping(source = "idTaxista", target = "idTaxista")
    @Mapping(source = "usuario.nome", target = "nome")
    @Mapping(source = "usuario.telefone", target = "telefone")
    TaxistaResponseDTO toResponseDto(Taxista taxista);

    default Usuario map(Long idUsuario) {
        if (idUsuario == null) {
            return null;
        }
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(idUsuario);
        return usuario;
    }
}
