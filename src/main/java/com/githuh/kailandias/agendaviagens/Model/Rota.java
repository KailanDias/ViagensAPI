package com.githuh.kailandias.agendaviagens.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "rotas")
public class Rota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rotas")
    private Long idRota;

    @Column(name = "ponto_partida", nullable = false)
    private String pontoPartida;

    @Column(name = "cidade_destino", nullable = false)
    private String cidadeDestino;

    @OneToMany(mappedBy = "rota", cascade = CascadeType.ALL,  orphanRemoval = true)
    List<Viagem> viagens = new ArrayList<>();
}
