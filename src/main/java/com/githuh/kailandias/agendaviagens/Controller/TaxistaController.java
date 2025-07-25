package com.githuh.kailandias.agendaviagens.Controller;

import com.githuh.kailandias.agendaviagens.Model.Taxista;
import com.githuh.kailandias.agendaviagens.Repository.TaxistasRepository;
import com.githuh.kailandias.agendaviagens.Service.TaxistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/taxistas")
public class TaxistaController {

    @Autowired
    public TaxistasRepository taxistasRepository;

    @PostMapping
    public Taxista salvar(Taxista taxista){
        return taxistasRepository.save(taxista);
    }

    @DeleteMapping("{id}" )
    public void deletar(Taxista id){
        this.taxistasRepository.delete(id);
    }

    @GetMapping
    public List<Taxista> listar(){
        return taxistasRepository.findAll();
    }

}
