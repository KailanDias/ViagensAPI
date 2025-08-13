package com.githuh.kailandias.agendaviagens.Controller.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public record ViagemResponseDTO(
        Long idViagens,
        LocalDate dataViagem,
        LocalTime horaSaidaPrevista,
        int vagasDisponiveis,
        String status,
        String observacoes,
        TaxistaResponseDTO taxista,
        RotaResponseDTO rota
) {
}
