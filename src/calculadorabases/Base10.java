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
public class Base10 extends Operacion<Integer>{

    public Base10() {
        super();
    }

    @Override
    public void realizarOperacion() {
        switch(this.operador){
            case '+':
                this.resultado = this.operando1 + this.operando2;
                break;
            case '-':
                this.resultado = this.operando1 - this.operando2;
                break;
            case '*':
                this.resultado = this.operando1 * this.operando2;
                break;
        }
    }
}
