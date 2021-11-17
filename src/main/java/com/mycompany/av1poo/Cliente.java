/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.av1poo;

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
public class Cliente extends Pessoa {
    private int IDClinte;
    private String endEntrega;

    public Cliente(int IDClinte, String endEntrega, String nome, String email, String telefone, int idade) {
        super(nome, email, telefone, idade);
        this.IDClinte = IDClinte;
        this.endEntrega = endEntrega;
    }

    public int getIDClinte() {
        return IDClinte;
    }

    public void setIDClinte(int IDClinte) {
        this.IDClinte = IDClinte;
    }

    public String getEndEntrega() {
        return endEntrega;
    }

    public void setEndEntrega(String endEntrega) {
        this.endEntrega = endEntrega;
    }

    public String realizarPedido(Pedido pedido) {
        return "\n Pedido " + pedido.getIDPedido() + "\n realizado por " + this.getNome() + ", \n para ser entregue no endereço " + this.endEntrega + ", \n problemas entrar em contato com o número " + this.getTelefone();
    }
    
    public void alterarEnderecoEntrega(String novoEndereco) {
        this.setEndEntrega(novoEndereco);
    }
    
    public String pagarPedido(Pedido pedido) {
        return "\n Obrigado, " + this.getNome() + ", por realizar o pagamento do pedido " + pedido.getIDPedido() + " no valor de " + pedido.getValorTotal() + "!";
    }
}
