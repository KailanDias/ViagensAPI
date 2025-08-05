package com.githuh.kailandias.agendaviagens.Controller.dto;

import java.time.LocalDateTime;

public record UsuarioDTO(Long idUsuario,
        String nome,
        String cpf,
        String email,
        String telefone,
        LocalDateTime dataCadastro
    ) {
}
