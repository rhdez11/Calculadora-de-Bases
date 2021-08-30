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
public class Base4 extends Operacion<Integer>{
    public Base4() {
        super();
    }
    
    @Override
    public void realizarOperacion() {
        int valor1 = BaseXtoBase10(operando1, 4);
        int valor2 = BaseXtoBase10(operando2, 4);
        int res =0;
        switch(operador){
            case '+':
                this.resultado = Base10toBaseX((valor1 + valor2), 4);
                break;
            case '-':
                this.resultado = Base10toBaseX((valor1 - valor2), 4);
                break;
            case '*':
                this.resultado = Base10toBaseX((valor1 * valor2), 4);
                break;
        }
    }
}
