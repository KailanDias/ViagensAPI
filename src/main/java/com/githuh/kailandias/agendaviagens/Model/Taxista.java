package com.githuh.kailandias.agendaviagens.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Taxistas")
public class Taxista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_taxista")
    private Long idTaxista;

    @OneToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id_usuarios", nullable = false, unique = true)
    private Usuario usuario;

    @OneToMany(mappedBy = "taxista",  cascade = CascadeType.ALL, orphanRemoval = true)
    List<Viagem> viagens = new ArrayList<>();

}
