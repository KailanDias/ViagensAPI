package com.githuh.kailandias.agendaviagens.Service;

import com.githuh.kailandias.agendaviagens.Model.Taxista;
import com.githuh.kailandias.agendaviagens.Model.Usuario;
import com.githuh.kailandias.agendaviagens.Repository.TaxistasRepository;
import com.githuh.kailandias.agendaviagens.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxistaService {

    @Autowired
    public TaxistasRepository taxistasRepository;

    @Autowired
    public UsuarioRepository usuarioRepository;

    public Taxista salvar(Taxista taxista){
        // Busca a instância gerenciada do Usuario a partir do ID
        Long usuarioId = taxista.getUsuario().getIdUsuario();
        Usuario usuario = usuarioRepository.findById(usuarioId)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado com o id: " + usuarioId));

        // Associa o usuário persistente e gerenciado pelo JPA ao taxista
        taxista.setUsuario(usuario);

        // Agora salva o taxista com a referência correta
        return taxistasRepository.save(taxista);
    }




//    public Taxista salvar(Taxista taxista){
//        return taxistasRepository.save(taxista);
//    }

    public Taxista deletar(Long id){
        Taxista taxista = taxistasRepository.findById(id).get();
        taxistasRepository.delete( taxista);
        return taxista;
    }

    public List<Taxista> listarTodos(){
        return taxistasRepository.findAll();
    }


}
