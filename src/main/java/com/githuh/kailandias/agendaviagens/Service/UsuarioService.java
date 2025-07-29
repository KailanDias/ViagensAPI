package com.githuh.kailandias.agendaviagens.Service;

import com.githuh.kailandias.agendaviagens.Model.Usuario;
import com.githuh.kailandias.agendaviagens.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    public UsuarioRepository usuarioRepository;

    public Usuario salvar(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public Usuario deletar(Long id){
        Usuario usuario = usuarioRepository.findById(id).get();
        usuarioRepository.delete(usuario);
        return usuario;
    }

    public List<Usuario> listarTodos(){
        return usuarioRepository.findAll();
    }

}
