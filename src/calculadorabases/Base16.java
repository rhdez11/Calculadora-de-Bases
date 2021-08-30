/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorabases;

/**
 *
 * @author ricar
 */
public class Base16 extends Operacion<String>{

    public Base16() {
        super();
    }

    @Override
    public void realizarOperacion() {
        int valor1 = Integer.parseInt(this.operando1, 16);
        int valor2 = Integer.parseInt(this.operando2, 16);
        int res =0;
        switch(this.operador){
            case '+':
                this.resultado = Integer.toHexString((valor1+valor2)).toUpperCase();
                break;
            case '-':
                this.resultado = Integer.toHexString((valor1-valor2)).toUpperCase();
                break;
            case '*':
                this.resultado = Integer.toHexString((valor1*valor2)).toUpperCase();
                break;
        }
    }
    
}
