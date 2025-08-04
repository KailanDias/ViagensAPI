package com.githuh.kailandias.agendaviagens.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Carro")
@Data
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carro")
    private Long idCarros;

    @Column(name = "modelo", nullable = false)
    private String modelo;

    @Column(name = "marca", nullable = false)
    private String marca;

    @Column(name = "cor", nullable = false)
    private String cor;

    @Column(name = "placa", nullable = false)
    private String placa;

    @Column(name = "ano", nullable = false, updatable = true)
    private Integer ano;

    @Column(name = "vagas_totais",  nullable = false)
    private Integer vagasTotais;

    @OneToOne
    @JoinColumn(name = "id_taxista", nullable = false)
    private Taxista taxista;

}
