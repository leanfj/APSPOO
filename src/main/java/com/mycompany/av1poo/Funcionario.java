/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.av1poo;

/**
 *
 * @author 
 *  Gabriel De Sousa Frazao – 2020101238
    Leandro Ferreira de Jesus – 2020101253
    Lucas De Vasconcellos Da Silva Coutinho – 2018101893
    Marcus Vinícius Ferreira de Oliveira - 2020100058
    Theo Vinicius Torres Da Luz Fernandes Melo – 2020100735
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
        return "\n Pedido " + pedido.getIDPedido() + " sendo atendido pelo funcionario " + this.getNome();
    }
    
    
    
    
}
