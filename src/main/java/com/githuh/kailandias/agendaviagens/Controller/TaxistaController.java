package com.githuh.kailandias.agendaviagens.Controller;

import com.githuh.kailandias.agendaviagens.Controller.dto.TaxistaDTO;
import com.githuh.kailandias.agendaviagens.Controller.dto.TaxistaResponseDTO;
import com.githuh.kailandias.agendaviagens.Controller.mapper.TaxistaMapper;
import com.githuh.kailandias.agendaviagens.Model.Taxista;
import com.githuh.kailandias.agendaviagens.Repository.TaxistasRepository;
import com.githuh.kailandias.agendaviagens.Service.TaxistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/taxistas")
public class TaxistaController {

    @Autowired
    public TaxistasRepository taxistasRepository;

    @Autowired
    public TaxistaService service;

    @Autowired
    public TaxistaMapper mapper;

    @PostMapping
    public Taxista salvar(Taxista taxista){
        return taxistasRepository.save(taxista);
    }

    @DeleteMapping("{id}" )
    public void deletar(Taxista id){
        this.taxistasRepository.delete(id);
    }

    @GetMapping
    public List<TaxistaResponseDTO> listar() {
        return taxistasRepository.findAll().stream()
                .map(mapper::toResponseDto)
                .collect(Collectors.toList());
    }

}
