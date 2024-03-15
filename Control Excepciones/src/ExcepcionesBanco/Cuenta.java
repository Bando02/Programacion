/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExcepcionesBanco;

/**
 *
 * @author Medac
 */
public class Cuenta {
    
    protected String nombre;
    protected int numero;
    protected double saldo;
    
    
    public Cuenta(String nombre, int numero, double saldo) throws SaldoInsuficienteException{
        
        if (saldo < 0){
            throw new SaldoInsuficienteException("Saldo inicial negativo");
        }
        
        this.nombre = nombre;
        this.numero = numero;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    public void movimiento(double valor) throws SaldoInsuficienteException{
        if(saldo + valor < 0){
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
         saldo = + valor;

    }
    
    
}
