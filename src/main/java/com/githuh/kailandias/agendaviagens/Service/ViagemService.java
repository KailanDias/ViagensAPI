package com.githuh.kailandias.agendaviagens.Service;

import com.githuh.kailandias.agendaviagens.Model.Viagem;
import com.githuh.kailandias.agendaviagens.Repository.ViagensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViagemService {


    @Autowired
    private ViagensRepository repository;

    public List<Viagem> listarViagensDisponiveis() {
        return repository.findViagensDisponiveis();
    }

    public Viagem salvar(Viagem viagem){
        return repository.save(viagem);
    }
}
