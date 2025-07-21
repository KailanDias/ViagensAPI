package Controller;


import Model.Usuario;
import Repository.UsuarioRepository;
import Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    public UsuarioService usuarioService;

    public UsuarioRepository repository;

    @PostMapping
    public Usuario salvar(@RequestBody Usuario usuario){
        return repository.save(usuario);
    }



}
