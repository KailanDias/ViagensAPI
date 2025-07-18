package Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "rotas")
public class Rotas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rotas")
    private int idRota;

    @Column(name = "ponto_partida", nullable = false)
    private String pontoPartida;

    @Column(name = "cidade_destino", nullable = false)
    private String cidadeDestino;

}
