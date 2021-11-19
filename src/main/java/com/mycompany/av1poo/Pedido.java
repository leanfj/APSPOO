/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.av1poo;

import java.util.ArrayList;
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
public class Pedido {
    private String IDPedido;
    private Date dataCriacao;
    private Cliente cliente;
    private Funcionario funcionario;
    private float valorTotal;
    private ArrayList<DetalhesPedido> itens;

    public Pedido(String IDPedido, Cliente cliente, Funcionario funcionario) {
        this.IDPedido = IDPedido;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.dataCriacao = new Date();
        this.itens = new ArrayList();
    }

    public String getIDPedido() {
        return IDPedido;
    }

    public void setIDPedido(String IDPedido) {
        this.IDPedido = IDPedido;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ArrayList<DetalhesPedido> getItens() {
        return itens;
    }

    public void setItens(ArrayList<DetalhesPedido> itens) {
        this.itens = itens;
    }
    
    public void adcionarItem(Produto produto, int quantidade) {
        DetalhesPedido item = new DetalhesPedido(this, produto, quantidade);
        this.itens.add(item);
        this.calculaValorTotal();

    }
    
    public void removerItem(int numeroItem) {
        this.itens.remove(numeroItem);
        this.calculaValorTotal();

    }
    
    public void listarItems() {
        System.out.println("\n Pedido " + this.getIDPedido());
        for (int i = 0; i < itens.size(); i++) {
            System.out.printf("\n Item - %d - %s \n", i, itens.get(i));
        }
        System.out.println("\n Valor Total - " + this.getValorTotal());
    }
    
    
    public void calculaValorTotal() {
        this.setValorTotal(0);
        
        for (DetalhesPedido Itens : getItens()){
            this.setValorTotal(this.getValorTotal() + Itens.getSubTotal());
        }   
    }
    
    public String finalizarPedido() {
        return "\n Pedido " + this.getIDPedido() + "\n atendido por " +this.funcionario.getNome() + "\n finalizado no valor de " + this.getValorTotal() + " !";
    }
    
    public String enviarPedido() {
        return "\n Pedido " + this.getIDPedido() + "\n sendo enviado para " + this.cliente.getNome() + "\n no endereço " + this.cliente.getEndEntrega() + "  !";
    }
    
}
