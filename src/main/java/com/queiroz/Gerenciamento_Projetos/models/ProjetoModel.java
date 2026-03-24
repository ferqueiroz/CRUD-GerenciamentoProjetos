package com.queiroz.Gerenciamento_Projetos.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "Projeto")
@Table(name = "tb_projeto")
public class ProjetoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRJ_ID")
    private Long id;
    @Column(name = "PRJ_NOME")
    private String nome;
    @Column(name = "PRJ_DATAINICIO")
    private LocalDate dataInicio;
    @Column(name = "PRJ_DATAFIM")
    private LocalDate dataFim;

    public ProjetoModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }
}
