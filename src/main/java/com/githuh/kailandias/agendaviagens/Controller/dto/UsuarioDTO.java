package com.githuh.kailandias.agendaviagens.Controller.dto;

import java.time.LocalDateTime;

public record UsuarioDTO(Long id,
        String nome,
        String cpf,
        String telefone,
        LocalDateTime dataCadastro
    ) {
}
