package Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "Taxistas")
public class Taxistas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_taxistas")
    private Long idTaxista;

    @OneToOne
    @JoinColumn(name = "id_taxistas", nullable = false)
    private Usuario usuario;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "taxistas")
    private Carros carros;

}
