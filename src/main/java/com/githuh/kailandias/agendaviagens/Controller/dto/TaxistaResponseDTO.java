package com.githuh.kailandias.agendaviagens.Controller.dto;

// Este DTO define a resposta da API ao listar taxistas.
public record TaxistaResponseDTO(
        Long idTaxista,
        String nome,
        String telefone
) {
}
