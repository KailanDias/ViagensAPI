package com.githuh.kailandias.agendaviagens.Service;

import com.githuh.kailandias.agendaviagens.Model.Taxista;
import com.githuh.kailandias.agendaviagens.Model.Usuario;
import com.githuh.kailandias.agendaviagens.Repository.TaxistasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxistaService {

    @Autowired
    public TaxistasRepository taxistasRepository;

    public Taxista salvar(Taxista taxista){
        return taxistasRepository.save(taxista);
    }

    public Taxista deletar(Taxista taxista){
        taxistasRepository.delete(taxista);
        return taxista;
    }

    public List<Taxista> listarTodos(){
        return taxistasRepository.findAll();
    }


}
