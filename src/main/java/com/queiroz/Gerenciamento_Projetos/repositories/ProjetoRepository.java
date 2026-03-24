package com.queiroz.Gerenciamento_Projetos.repositories;

import com.queiroz.Gerenciamento_Projetos.models.ProjetoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<ProjetoModel, Long> {

}
