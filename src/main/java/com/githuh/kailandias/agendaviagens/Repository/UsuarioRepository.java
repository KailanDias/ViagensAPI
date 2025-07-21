package com.githuh.kailandias.agendaviagens.Repository;

import com.githuh.kailandias.agendaviagens.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
