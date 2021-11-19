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
public class DetalhesPedido {
    
    private Pedido pedido;
    private Produto produto;
    private int quantidade;
    private float subTotal;

    public DetalhesPedido(Pedido pedido, Produto produto, int quantidade) {
        this.pedido = pedido;
        this.produto = produto;
        this.quantidade = quantidade;
        this.subTotal = this.calculaPreco();
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }
    
    private float calculaPreco () {
       return this.getProduto().getCustoUnitario() * this.getQuantidade();
    }

    @Override
    public String toString() {
        return "\n { Produto = " + produto.getNome() +  ",\n Fornecedor = " + produto.getFornecedor().getNome() + ",\n Preço unitario = " + produto.getCustoUnitario() + ",\n Quantidade = " + quantidade + ",\n SubTotal = " + subTotal + '}';
    }
    
    
    
    
    
}
