package com.githuh.kailandias.agendaviagens.Controller;

import com.githuh.kailandias.agendaviagens.Controller.dto.TaxistaDTO;
import com.githuh.kailandias.agendaviagens.Controller.dto.TaxistaResponseDTO;
import com.githuh.kailandias.agendaviagens.Controller.dto.UsuarioDTO;
import com.githuh.kailandias.agendaviagens.Controller.mapper.TaxistaMapper;
import com.githuh.kailandias.agendaviagens.Model.Taxista;
import com.githuh.kailandias.agendaviagens.Model.Usuario;
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
    public TaxistaService service;

    @Autowired
    public TaxistaMapper mapper;

    @PostMapping
    public TaxistaResponseDTO salvar(@RequestBody TaxistaDTO dto){
        Taxista taxista = mapper.toEntity(dto);
        Taxista salvo = service.salvar(taxista);
        return mapper.toResponseDto(salvo);
    }

    @DeleteMapping("{id}" )
    public TaxistaDTO deletar(@PathVariable Long id){
        Taxista taxista = service.deletar(id);
        return mapper.toDto(taxista);
    }


    @GetMapping
    public List<TaxistaDTO> listar() {
        return service.listarTodos().stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

}
