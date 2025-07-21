package Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuarios")
    private Long idUsuario;

    @Column(name = "nome",length = 255,nullable = false)
    private String nome;

    @Column(name = "cpf", length = 14,nullable = false)
    private String cpf;

    @Column(name = "telefone",  length = 20,nullable = false)
    private String telefone;

    @Column(name = "email", length = 255,nullable = false)
    private String email;

    @Column(name = "senha", length = 255,nullable = false)
    private String senha;

    @Column(name = "data_criacao")
    private Date dataCadastro;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "usuario")
    private Taxistas taxistas;


}
