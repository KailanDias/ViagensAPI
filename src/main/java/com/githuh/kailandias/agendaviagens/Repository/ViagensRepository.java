package com.githuh.kailandias.agendaviagens.Repository;

import com.githuh.kailandias.agendaviagens.Model.Viagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ViagensRepository extends JpaRepository<Viagem, Long> {
}
