package com.githuh.kailandias.agendaviagens.Service;

import com.githuh.kailandias.agendaviagens.Controller.dto.RotaDTO;
import com.githuh.kailandias.agendaviagens.Model.Rota;
import com.githuh.kailandias.agendaviagens.Repository.RotasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RotaService {

    @Autowired
    private RotasRepository repository;

    public Rota salvar(Rota rota){
        return repository.save(rota);
    }

    public List<Rota>  listar(){
        return repository.findAll();
    }

    public Rota deletar(Long id){
        Rota rota = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Rota inexistente"));
        repository.delete(rota);
        return rota;
    }

    public List<Rota> listarTodos(){
        return repository.findAll();
    }


}
