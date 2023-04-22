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
public class ContaPoupanca extends Banco {
    private int aniversario;
    
    public int getAniversario(){
        return aniversario;
    }
    
    public void setAniversario(int aniversario){
        this.aniversario = aniversario;
    }
    
    @Override
    public void taxa(){
        super.taxa();
        setSaldo(getSaldo() *  1.06);
    }
}
