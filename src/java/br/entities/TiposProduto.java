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
public class TiposProduto {
    private String descricao;
    private Date created_at;
    private Date updated_at;

    public TiposProduto() {
    }

    public TiposProduto(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) throws Exception {
        if(descricao.isEmpty()){
            throw new Exception("informe uma descrição");
        }else if(descricao.length() > 250){
            throw new Exception("informe uma descrição válida");
        }else{
            this.descricao = descricao;
        }
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
