/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.entities;

import java.util.Date;

/**
 *
 * @author rafael
 */
public class Produto {
    private String nome;
    private String descricao;
    private Double valor;
    private int tipo;
    private boolean is_ativo;
    private Date created_at;
    private Date updated_at;

    public Produto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if(nome.isEmpty()){
            throw new Exception("Informe um nome");
        }else if(nome.length() > 50){
            throw new Exception("Informe um nome válido");
        }else{
            this.nome = nome;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) throws Exception {
        if(descricao.isEmpty()){
            throw new Exception("Informe um descricão");
        }else if(descricao.length() > 50){
            throw new Exception("Informe um descricão válida");
        }else{
            this.descricao = descricao;
        }
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) throws Exception {
        if(valor <= 0){
            throw new Exception("Informe um valor válido");
        }else{
            this.valor = valor;
        }
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public boolean isIs_ativo() {
        return is_ativo;
    }

    public void setIs_ativo(boolean is_ativo) {
        this.is_ativo = is_ativo;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
    
    
}
