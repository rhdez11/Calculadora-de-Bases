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
public class Base5 extends Operacion<Integer>{
    public Base5() {
        super();
    }
    
    @Override
    public void realizarOperacion() {
        int valor1 = BaseXtoBase10(this.operando1, 5);
        int valor2 = BaseXtoBase10(this.operando2, 5);
        switch(this.operador){
            case '+':
                this.resultado = Base10toBaseX((valor1 + valor2), 5);
                break;
            case '-':
                this.resultado = Base10toBaseX((valor1 - valor2), 5);
                break;
            case '*':
                this.resultado = Base10toBaseX((valor1 * valor2), 5);
                break;
        }
    }
    
}
