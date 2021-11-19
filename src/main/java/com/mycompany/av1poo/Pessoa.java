/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.av1poo;

import java.util.Date;

/**
 *
 * @author 
 *  Gabriel De Sousa Frazao – 2020101238
    Leandro Ferreira de Jesus – 2020101253
    Lucas De Vasconcellos Da Silva Coutinho – 2018101893
    Marcus Vinícius Ferreira de Oliveira - 2020100058
    Theo Vinicius Torres Da Luz Fernandes Melo – 2020100735
 */
public class Pessoa {
    private String nome;
    private String email;
    private String telefone;
    private int idade;
    private boolean ativo;
    private Date dataCadastro;

    public Pessoa(String nome, String email, String telefone, int idade) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.idade = idade;
        this.ativo = true;
        this.dataCadastro = new Date();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    
    
    
    
    
}
