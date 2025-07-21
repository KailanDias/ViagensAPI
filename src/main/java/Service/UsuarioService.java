package Service;

import Model.Usuario;
import Repository.UsuarioRepository;
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

    public Usuario deletar(Usuario usuario){
        usuarioRepository.delete(usuario);
        return usuario;
    }

    public List<Usuario> listarTodos(){
        return usuarioRepository.findAll();
    }

}
