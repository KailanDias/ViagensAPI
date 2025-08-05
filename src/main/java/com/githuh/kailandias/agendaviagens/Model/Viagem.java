package com.githuh.kailandias.agendaviagens.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;

@Entity
@Data
@Table(name = "viagem")
public class Viagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_viagem")
    private Long idViagens;

    @Column(name = "data_viagem", nullable = false)
    private LocalDate dataViagem;

    @Column(name = "hora_saida_prevista")
    private LocalTime horaSaidaPrevista;

    @Column(name = "vagas_disponiveis", nullable = false)
    private int vagasDisponiveis;

    @Column(nullable = false)
    private String status = "Agendada";

    private String observacoes;

    @Column(name = "data_criacao")
    private OffsetDateTime dataCriacao;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_taxista", nullable = false)
    private Taxista taxista;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "rota_id", nullable = false)
    private Rota rota;

}