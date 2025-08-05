package com.githuh.kailandias.agendaviagens.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;

    @Column(name = "nome",length = 255,nullable = false)
    private String nome;

    @Column(name = "cpf", length = 14,nullable = false,unique = true)
    private String cpf;

    @Column(name = "telefone",  length = 20,nullable = false,unique = true)
    private String telefone;

    @Column(name = "email", length = 255,nullable = false, unique = true)
    private String email;

    @Column(name = "senha", length = 255,nullable = false)
    private String senha;

    @Column(name = "data_criacao")
    private LocalDateTime dataCadastro;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "usuario")
    private Taxista taxista;


    // Antes do usuario ser criado este metodo é chamado passando a data e hora atual
    @PrePersist
    public void prePersist() {
        setDataCadastro(LocalDateTime.now());
    }


}
