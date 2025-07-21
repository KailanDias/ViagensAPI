package Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Taxistas")
public class Taxistas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_taxistas")
    private Long idTaxista;

    @OneToOne
    @JoinColumn(name = "id_taxistas", referencedColumnName = "id_usuarios", nullable = false)
    private Usuario usuario;

    @OneToMany(mappedBy = "taxistas",  cascade = CascadeType.ALL, orphanRemoval = true)
    List<Viagens> viagens = new ArrayList<>();

}
