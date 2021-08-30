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
public class Base2 extends Operacion<Integer>{

    public Base2() {
        super();
    }
    
    @Override
    public void realizarOperacion() {
        int valor1 = BaseXtoBase10(this.operando1, 2);
        int valor2 = BaseXtoBase10(this.operando2, 2);
        int res =0;
        switch(operador){
            case '+':
                this.resultado = Base10toBaseX((valor1 + valor2), 2);
                break;
            case '-':
                this.resultado = Base10toBaseX((valor1 - valor2), 2);
                break;
            case '*':
                this.resultado = Base10toBaseX((valor1 * valor2), 2);
                break;
        }
    }
}
