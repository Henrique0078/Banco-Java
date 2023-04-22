/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ContaCorrente;
import Model.ContaPoupanca;




/**
 *
 * @author UNIP
 */
public class Principal {
    public static void main(String[] args) {
        
        ContaCorrente Henrique = new ContaCorrente();
        Henrique.setSaldo(1000);
        Henrique.setNome("Henrique");
        Henrique.setNumero(2);
        Henrique.setAgencia(1);
        Henrique.setTipo("Corrente");
        Henrique.ContaC();

        Henrique.depositar(500);
        
        System.out.println("----------------------------------------------------------------");
        
        ContaCorrente Thayna = new ContaCorrente();
        Thayna.setNome("Thayna");
        Thayna.setSaldo(1000);
        Thayna.setNumero(3);
        Thayna.setAgencia(1);
        Thayna.setTipo("Corrente");
        Thayna.ContaC();
        
        Henrique.transferir(Thayna, 250);
        
        System.out.println("----------------------------------------------------------------");
        
        ContaCorrente Irineu = new ContaCorrente();
        Irineu.setAgencia(1);
        Irineu.setNumero(1);
        Irineu.setNome("Irineu");
        Irineu.setSaldo(510);
        Irineu.setTipo("Corrente");
        Irineu.ContaC();
        Irineu.taxa();
        Irineu.ContaC();
        
        Irineu.transferir(Henrique, 500);
        
        System.out.println("----------------------------------------------------------------");
        
        ContaPoupanca John = new ContaPoupanca();
        John.setAgencia(1);
        John.setNumero(4);
        John.setNome("John");
        John.setSaldo(500);
        John.setTipo("Poupanca");
        John.ContaC();
        John.taxa();
        John.ContaC();
     
    }
    
}
