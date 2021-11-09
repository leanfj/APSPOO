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
public class APSPOO {
    public static void main(String[] args) {
        System.out.println("APS - POO");
        
        Cliente cliente01 = new Cliente(1111, "Leandro Ferreira", "leandro@email.com", "(21)2222-5555", "Rua do Leandro, 2563", 35);        
        
        Fornecedor fornecedor01 = new Fornecedor(2222, "Ferramentas & Companhia", "ferramentas@email.com", "(52)5555-4444");
        Fornecedor fornecedor02 = new Fornecedor(3333, "Papelaria & Companhia", "papelaria@email.com", "(22)8888-2222");
        
        Produto produto01 = new Produto(2222, "Alicate", fornecedor01, 22.50f);
        Produto produto02 = new Produto(2323, "Chave de Fenda", fornecedor01, 14.75f);
        Produto produto03 = new Produto(3333, "Papel Glossy", fornecedor02, 5.30f);
        
        Pedido pedido01 = new Pedido("JKHL456LB", cliente01);
        
        pedido01.adcionarItem(produto01, 2);
        pedido01.adcionarItem(produto02, 1);
        pedido01.adcionarItem(produto03, 4);
        
        pedido01.listarItems();
        
        pedido01.removerItem(2);
        
        pedido01.listarItems();                
        
        System.out.println(pedido01.finalizarPedido());
        System.out.println(pedido01.enviarPedido());
        
        
        
    }
    
}
 