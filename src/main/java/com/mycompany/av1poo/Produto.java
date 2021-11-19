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
public class Produto {
    private int IDProduto;
    private String nome;
    private Fornecedor fornecedor;
    private float custoUnitario;

    public Produto(int IDProduto, String nome, Fornecedor fornecedor, float custoUnitario) {
        this.IDProduto = IDProduto;
        this.nome = nome;
        this.fornecedor = fornecedor;
        this.custoUnitario = custoUnitario;
    }

    public int getIDProduto() {
        return IDProduto;
    }

    public void setIDProduto(int IDProduto) {
        this.IDProduto = IDProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public float getCustoUnitario() {
        return custoUnitario;
    }

    public void setCustoUnitario(float custoUnitario) {
        this.custoUnitario = custoUnitario;
    }
    
    
    
}
