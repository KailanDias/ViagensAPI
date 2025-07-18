package Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Carros")
@Data
public class Carros {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carros")
    private Long idCarros;

    @Column(name = "modelo", nullable = false)
    private String modelo;

    @Column(name = "marca", nullable = false)
    private String marca;

    @Column(name = "name", nullable = false)
    private String cor;

    @Column(name = "placa", nullable = false)
    private String placa;

    @Column(name = "ano", nullable = false, updatable = true)
    private Integer ano;

    @Column(name = "vags_totais",  nullable = false)
    private Integer vagasTotais;

    @OneToOne
    @JoinColumn(name = "id_taxista", nullable = false)
    private Taxistas taxistas;

}
