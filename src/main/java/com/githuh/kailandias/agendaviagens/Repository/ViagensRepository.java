package com.githuh.kailandias.agendaviagens.Repository;

import com.githuh.kailandias.agendaviagens.Model.Viagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ViagensRepository extends JpaRepository<Viagem, Long> {

    @Query("SELECT v FROM Viagem v WHERE v.status = 'Agendada' AND v.vagasDisponiveis > 0")
    List<Viagem> findViagensDisponiveis();
}
