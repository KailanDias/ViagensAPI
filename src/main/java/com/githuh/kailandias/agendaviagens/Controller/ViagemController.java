package com.githuh.kailandias.agendaviagens.Controller;

import com.githuh.kailandias.agendaviagens.Controller.dto.ViagemResponseDTO;
import com.githuh.kailandias.agendaviagens.Controller.mapper.ViagemMapper;
import com.githuh.kailandias.agendaviagens.Service.ViagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/viagens")
public class ViagemController {

    @Autowired
    private ViagemService service;

    @Autowired
    private ViagemMapper mapper;

    @GetMapping
    public List<ViagemResponseDTO> listarViagensDisponiveis() {
        return service.listarViagensDisponiveis().stream()
                .map(mapper::toResponseDto)
                .collect(Collectors.toList());
    }



}
