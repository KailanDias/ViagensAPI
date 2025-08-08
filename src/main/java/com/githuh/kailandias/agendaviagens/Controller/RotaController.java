package com.githuh.kailandias.agendaviagens.Controller;

import com.githuh.kailandias.agendaviagens.Controller.dto.RotaDTO;
import com.githuh.kailandias.agendaviagens.Controller.dto.RotaResponseDTO;
import com.githuh.kailandias.agendaviagens.Controller.mapper.RotaMapper;
import com.githuh.kailandias.agendaviagens.Model.Rota;
import com.githuh.kailandias.agendaviagens.Service.RotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rotas")
public class RotaController {

    @Autowired
    public RotaService  service;

    @Autowired
    public RotaMapper  mapper;


    @PostMapping
    public RotaResponseDTO salvar(@RequestBody RotaDTO dto){
        Rota rota = mapper.toEntity(dto);
        Rota salvar = service.salvar(rota);
        return mapper.toResponseDto(salvar);
    }

    @DeleteMapping("{id}")
    public RotaDTO deletar(@PathVariable Long id){
        Rota rota = service.deletar(id);
        return mapper.toDto(rota);
    }

    @GetMapping
    public List<RotaResponseDTO> listar(){
        return service.listarTodos().stream()
                .map(mapper::toResponseDto)
                .collect(Collectors.toList());
    }



}
