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
public class Banco extends Conta {
    private int agencia;
    private int numero;
    private String tipo;

    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getAgencia(){
        return agencia;
    }
    
    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public boolean setNumero(int numero){
        if (numero > 0) {
            this.numero = numero;
            return true;
        }
        else{
            return false;
        }
    }
    
    public void ContaC(){
        System.out.println(this.getAgencia() + "-" + this.getNumero() + " : " + this.getNome() + ", " + this.getTipo());
        System.out.println("Saldo atual: R%" + this.getSaldo() + "\n");
    }
}
