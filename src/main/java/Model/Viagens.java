package Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.util.Date;

@Entity
@Data
@Table(name = "viagens")
public class Viagens {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_viagens")
    private Long id;

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
    @JoinColumn(name = "taxista_id", nullable = false)
    private Taxistas taxista;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "rota_id", nullable = false)
    private Rotas rota;

}
