package com.githuh.kailandias.agendaviagens.Controller;


import com.githuh.kailandias.agendaviagens.Controller.dto.UsuarioDTO;
import com.githuh.kailandias.agendaviagens.Controller.mapper.UsuarioMapper;
import com.githuh.kailandias.agendaviagens.Model.Usuario;
import com.githuh.kailandias.agendaviagens.Repository.UsuarioRepository;
import com.githuh.kailandias.agendaviagens.Service.UsuarioService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    public UsuarioService service;

    @Autowired
    public UsuarioMapper mapper;


    @PostMapping
    public UsuarioDTO salvar(@RequestBody Usuario usuario) {
        Usuario usuarioSalvo = service.salvar(usuario);
        return mapper.toDto(usuarioSalvo);
    }

    @DeleteMapping("{id}")
    public UsuarioDTO deletar(@PathVariable Long id){
        Usuario usuario = service.deletar(id);
        return mapper.toDto(usuario);
    }

    @GetMapping
    public List<UsuarioDTO> listar() {
        return service.listarTodos().stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }



}
