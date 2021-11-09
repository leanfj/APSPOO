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
 * 
 * Leandro Ferreira - 2020101253
 * Theo Melo - 
 * Gabriel Frazão - 
 * Lucas Coutinho - 
 * Marco - 
 */
public class Cliente {
    private int IDClinte;
    private String nome;
    private String email;
    private String telefone;
    private String endEntrega;
    private int idade;
    private boolean ativo;
    private Date dataCadastro;

    public Cliente(int IDClinte, String nome, String email, String telefone, String endEntrega, int idade) {
        this.IDClinte = IDClinte;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endEntrega = endEntrega;
        this.idade = idade;
        this.ativo = true;
        this.dataCadastro = new Date();
    }    

    public int getIDClinte() {
        return IDClinte;
    }

    public void setIDClinte(int IDClinte) {
        this.IDClinte = IDClinte;
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

    public String getEndEntrega() {
        return endEntrega;
    }

    public void setEndEntrega(String endEntrega) {
        this.endEntrega = endEntrega;
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
    
    public String realizarPedido(Pedido pedido) {
        return "\n Pedido " + pedido.getIDPedido() + "\n realizado por " + this.nome + ", \n para ser entregue no endereço " + this.endEntrega + ", \n problemas entrar em contato com o número " + this.telefone;
    }
    
    public void alterarEnderecoEntrega(String novoEndereco) {
        this.setEndEntrega(novoEndereco);
    }
    
    public String pagarPedido(Pedido pedido) {
        return "\n Obrigado, " + this.nome + ", por realizar o pagamento do pedido " + pedido.getIDPedido() + " no valor de " + pedido.getValorTotal() + "!";
    }
}
