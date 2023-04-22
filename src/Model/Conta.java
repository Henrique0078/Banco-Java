/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author UNIP
 */
public class Conta {
    private String nome;
    private double saldo;

    public void sacar(double saque){
        if (this.saldo > saque){
            this.saldo = (this.saldo) - saque;
            System.out.println("Saque de R$" + saque + " efetuado.");
            System.out.println("Saldo atual: R$" + this.saldo + "\n");
        }
    }
    
    public void depositar(double deposito){
        this.saldo = this.saldo + deposito;
        System.out.println("Deposito de R$" + deposito + " efetuado.");
        System.out.println("Saldo atual: R$" + this.saldo + "\n");
    }
    
    public void transferir(Conta conta, double transferencia){
        if (this.saldo >= transferencia){
            this.saldo = (this.saldo - transferencia);
            conta.saldo = (conta.saldo + transferencia);
            System.out.println(this.nome + " efetuou uma transferencia de R$" + transferencia + " para " + conta.nome);
            System.out.println("Saldo atual de " +this.nome + ": R$" + this.saldo + "\n");
        }
        else{
            System.out.println(this.nome + " tem saldo de R$" + this.saldo + " que e insuficiente para fazer a transferencia de R$" + transferencia + "\n");
        }
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
         
    public void taxa(){
        
    }
}
