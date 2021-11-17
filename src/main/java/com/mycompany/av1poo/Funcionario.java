/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.av1poo;

import java.util.Date;

/**
 *
 * @author Locatech
 */
public class Funcionario extends Pessoa {
    private int IDFuncionario;

    public Funcionario(int IDFuncionario, String nome, String email, String telefone, int idade) {
        super(nome, email, telefone, idade);
        this.IDFuncionario = IDFuncionario;
    }
    
    public int getIDFuncionario() {
        return IDFuncionario;
    }

    public void setIDFuncionario(int IDFuncionario) {
        this.IDFuncionario = IDFuncionario;
    }

    public String atenderPedido(Pedido pedido) {
        return "Pedido " + pedido.getIDPedido() + " sendo atendido pelo funcionario " + this.getNome();
    }
    
    
    
    
}
