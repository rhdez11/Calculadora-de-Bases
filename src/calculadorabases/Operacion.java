/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorabases;

/**
 *
 * @author Ricardo Alberto Hernandez Aguila
 */
public abstract class Operacion<T> implements OperacionInterface{

    protected T operando1;
    protected T operando2;
    protected char operador;
    protected T resultado;
    
    public Operacion() {   
    }
    
    public T getOperando1() {
        return operando1;
    }

    public void setOperando1(T operando1) {
        this.operando1 = operando1;
    }

    public T getOperando2() {
        return operando2;
    }

    public void setOperando2(T operando2) {
        this.operando2 = operando2;
    }

    public char getOperador() {
        return operador;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }
    
    public T getResultado() {
        return resultado;
    }
    
    public void setAll(T operando1, T operando2, char operador){
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.operador =  operador;
    }
    
    protected int BaseXtoBase10(int numero, int base){
        int base10 = 0;
        int contador =0;
        int mod =0;
        do{
            mod = numero % 10; 
            numero /= 10;
            base10+= mod * (Math.pow(base,contador));
            contador++;
        }while(numero!=0);
        return base10;    
    }  
    
    protected int Base10toBaseX(int numero, int base){
        String basex = "";
        int mod =0;
        do{
            mod = numero % base; 
            numero /= base;
            basex= String.valueOf(mod) + basex;
        }while(numero!=0);
        return Integer.parseInt(basex); 
    }
    
    @Override
    public String ImprimirOperacion() {
        return this.operando1+" "+this.operador+" "+this.operando2+" = ";
    }    
}
      