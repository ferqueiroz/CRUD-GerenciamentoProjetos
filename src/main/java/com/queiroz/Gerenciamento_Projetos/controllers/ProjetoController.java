package com.queiroz.Gerenciamento_Projetos.controllers;

import com.queiroz.Gerenciamento_Projetos.models.ProjetoModel;
import com.queiroz.Gerenciamento_Projetos.services.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {
    @Autowired
    ProjetoService projetoService;

    @GetMapping
    public ResponseEntity<List<ProjetoModel>> listar(){
        return ResponseEntity.ok().body(projetoService.listar());
    }

    @PostMapping
    public ResponseEntity<ProjetoModel> salvar(@RequestBody ProjetoModel projetoModel) {
        return ResponseEntity.status(201).body(projetoService.criar(projetoModel));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<ProjetoModel>> buscar(@PathVariable Long id){
        Optional<ProjetoModel> projeto = projetoService.buscar(id);

        if(projeto == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(projeto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ProjetoModel> deletar(@PathVariable Long id) {
        projetoService.excluir(id);

        return ResponseEntity.noContent().build();
    }
}
