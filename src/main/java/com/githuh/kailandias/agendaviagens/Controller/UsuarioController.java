package com.githuh.kailandias.agendaviagens.Controller;


import com.githuh.kailandias.agendaviagens.Model.Usuario;
import com.githuh.kailandias.agendaviagens.Repository.UsuarioRepository;
import com.githuh.kailandias.agendaviagens.Service.UsuarioService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    public UsuarioRepository repository;

    @PostMapping
    public Usuario salvar(@RequestBody Usuario usuario){
        return repository.save(usuario);
    }

    @DeleteMapping("{id}")
    public Usuario deletar(@PathVariable Long id){
        Usuario usuario = repository.findById(id).get();
        repository.delete(usuario);
        return usuario;
    }

    @GetMapping
    public List<Usuario> listar(){
        return repository.findAll();
    }



}
