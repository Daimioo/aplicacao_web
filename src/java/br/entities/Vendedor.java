/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.entities;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author rafael
 */
public class Vendedor {
    private String matricula;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String cidade;
    private String estado;
    private String pais;
    private String rua;
    private String numero;
    private String bairro;
    private String cep;
    private Date created_at;
    private Date updated_at;

    public Vendedor() {
    }
    
    public String getmatricula() {
        return matricula;
    }

    public void setmatricula(String matricula) throws Exception {
        if(matricula.isEmpty()){
            throw new Exception("informe uma matricula");
        } else if(matricula.length() > 6){
            throw new Exception("Informe uma matricula válida");
        }
        else {
            this.matricula = matricula;
        }
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if(nome.isEmpty()){
            throw new Exception("informe um nome");
        } else if(nome.length() > 50){
            throw new Exception("Informe um nome de  no maximo 50 characteres");
        }
        else {
            this.nome = nome;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws Exception {
        if (cpf.isEmpty()) {
            throw new Exception("informe um cpf");
        } else if (cpf.length() > 11) {
            throw new Exception("Informe um cpf válido");
        } else {
            this.cpf = cpf;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception {
        if (email.isEmpty()) {
            throw new Exception("informe um email");
        } else if (email.length() > 80) {
            throw new Exception("Informe um email de  no maximo 80 characteres");
        } else {
            this.email = email;
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) throws Exception {
        if (telefone.isEmpty()) {
            throw new Exception("informe um telefone");
        } else if (telefone.length() > 11) {
            throw new Exception("Informe número de telefone válido");
        } else {
            this.telefone = telefone;
        }
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) throws Exception {
        if (cidade.isEmpty()) {
            throw new Exception("informe uma cidade");
        } else if (cidade.length() > 250) {
            throw new Exception("Informe nome válido para á cidade");
        } else {
            this.cidade = cidade;
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) throws Exception {
        if (estado.isEmpty()) {
            throw new Exception("informe um estado");
        } else if (estado.length() > 250) {
            throw new Exception("Informe nome válido para o estado");
        } else {
            this.estado = estado;
        }
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) throws Exception {
        if (pais.isEmpty()) {
            throw new Exception("informe um país");
        } else if (pais.length() > 4) {
            throw new Exception("Informe nome válido para o país");
        } else {
            this.pais = pais;
        }
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) throws Exception {
        if (rua.isEmpty()) {
            throw new Exception("informe uma rua");
        } else if (rua.length() > 250) {
            throw new Exception("Informe nome válido para a rua");
        } else {
            this.rua = rua;
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) throws Exception {
        if (numero.isEmpty()) {
            throw new Exception("informe um numero");
        } else if (numero.length() > 4) {
            throw new Exception("Informe numero válido");
        } else {
            this.numero = numero;
        }
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) throws Exception {
        if (bairro.isEmpty()) {
            throw new Exception("informe um bairro");
        } else if (bairro.length() > 250) {
            throw new Exception("Informe um bairro válido");
        } else {
            this.bairro = bairro;
        }
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) throws Exception {
        if (cep.isEmpty()) {
            throw new Exception("informe um cep");
        } else if (cep.length() > 8) {
            throw new Exception("Informe um cep válido");
        } else {
            this.cep = cep;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }
}
