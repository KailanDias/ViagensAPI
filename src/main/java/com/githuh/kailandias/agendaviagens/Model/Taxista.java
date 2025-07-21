package com.githuh.kailandias.agendaviagens.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Taxistas")
public class Taxista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_taxistas")
    private Long idTaxista;

    @OneToOne
    @JoinColumn(name = "id_taxistas", referencedColumnName = "id_usuarios", nullable = false)
    private Usuario usuario;

    @OneToMany(mappedBy = "taxista",  cascade = CascadeType.ALL, orphanRemoval = true)
    List<Viagen> viagens = new ArrayList<>();

}
