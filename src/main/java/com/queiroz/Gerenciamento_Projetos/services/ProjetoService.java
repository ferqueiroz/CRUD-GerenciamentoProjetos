package com.queiroz.Gerenciamento_Projetos.services;

import com.queiroz.Gerenciamento_Projetos.models.ProjetoModel;
import com.queiroz.Gerenciamento_Projetos.repositories.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjetoService {
    @Autowired
    private ProjetoRepository projetoRepository;

    public ProjetoModel criar(ProjetoModel projetoModel) {
        return projetoRepository.save(projetoModel);
    }

    public List<ProjetoModel> listar() {
        return projetoRepository.findAll();
    }

    public Optional<ProjetoModel> buscar(Long id) {
        return projetoRepository.findById(id);
    }

    public void excluir(Long id) {
        projetoRepository.deleteById(id);
    }
}
