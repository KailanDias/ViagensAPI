package com.githuh.kailandias.agendaviagens.Service;

import com.githuh.kailandias.agendaviagens.Model.Taxista;
import com.githuh.kailandias.agendaviagens.Model.Usuario;
import com.githuh.kailandias.agendaviagens.Repository.TaxistasRepository;
import com.githuh.kailandias.agendaviagens.Repository.UsuarioRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TaxistaService {

    @Autowired
    public TaxistasRepository taxistasRepository;

    @Autowired
    public UsuarioRepository usuarioRepository;

    @Transactional // Garante que a operação de busca e salvamento seja atômica
    public Taxista salvar(Taxista taxista){
        // 1. Pega o ID do usuário que veio na requisição
        Long usuarioId = taxista.getUsuario().getIdUsuario();

        // 2. Busca a entidade Usuario completa no banco de dados
        Usuario usuarioCompleto = usuarioRepository.findById(usuarioId)
                .orElseThrow(() -> new EntityNotFoundException("Usuário não encontrado com o ID: " + usuarioId));

        // 3. Associa o objeto Usuario, agora com todos os dados, ao taxista
        taxista.setUsuario(usuarioCompleto);

        // 4. Salva o taxista. O objeto retornado agora contém todos os dados do usuário.
        return taxistasRepository.save(taxista);
    }




//    public Taxista salvar(Taxista taxista){
//        return taxistasRepository.save(taxista);
//    }

    public Taxista deletar(Taxista taxista){
        taxistasRepository.delete(taxista);
        return taxista;
    }

    public List<Taxista> listarTodos(){
        return taxistasRepository.findAll();
    }


}
