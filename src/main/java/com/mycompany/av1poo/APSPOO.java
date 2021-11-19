/*
 * APS AV 2
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
public class APSPOO {
    public static void main(String[] args) {
        System.out.println("APS - POO");
        
        //Simula cadastro de cliente
        Cliente cliente01 = new Cliente(1111,"Rua do Leandro", "Leandro Ferreira", "leandro@email.com", "22223333", 35); 
        
        //Simula cadasto de funcionario
        Funcionario funcionario1 = new Funcionario(2222, "João Paulo", "joaopaulo@funcionario", "(21)3333-7777", 40);
        
        //Simula cadastro de forncedor
        Fornecedor fornecedor01 = new Fornecedor(2222, "Ferramentas & Companhia", "ferramentas@email.com", "(52)5555-4444");
        Fornecedor fornecedor02 = new Fornecedor(3333, "Papelaria & Companhia", "papelaria@email.com", "(22)8888-2222");
        
        //Simula cadastro de produto        
        Produto produto01 = new Produto(2222, "Alicate", fornecedor01, 22.50f);
        Produto produto02 = new Produto(2323, "Chave de Fenda", fornecedor01, 14.75f);
        Produto produto03 = new Produto(3333, "Papel Glossy", fornecedor02, 5.30f);
        
        //Simula cadastro de pedido
        Pedido pedido01 = new Pedido("JKHL456LB", cliente01, funcionario1);
        
        pedido01.adcionarItem(produto01, 2);
        pedido01.adcionarItem(produto02, 1);
        pedido01.adcionarItem(produto03, 4);
        
        pedido01.listarItems();
        
        pedido01.removerItem(2);
        
        pedido01.listarItems();                
        
        System.out.println(funcionario1.atenderPedido(pedido01));

        System.out.println(pedido01.finalizarPedido());
        
        System.out.println(pedido01.enviarPedido());
        
        
        
        
    }
    
}
 