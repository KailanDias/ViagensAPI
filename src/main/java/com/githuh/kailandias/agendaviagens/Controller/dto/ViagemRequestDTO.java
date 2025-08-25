package com.githuh.kailandias.agendaviagens.Controller.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public record ViagemRequestDTO(
        Long idTaxista,
        Long idRota,
        LocalDate dataViagem,
        LocalTime HoraSaidaPrevista,
        int vagasDisponiveis,
        String observacoes
) {
}
