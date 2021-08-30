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
public class Calculadora {
    private Operacion operacion;
    
    public Operacion getCalculadoraBase(int base){
        switch(base){
            case 2:
                operacion = new Base2();
                break;
            case 3:
                operacion = new Base3();
                break;
            case 4:
                operacion = new Base4();
                break;
            case 5:
                operacion = new Base5();
                break;    
            /*case 6:
                operacion = new Base6();
                break;
            case 7:
                operacion = new Base7();
                break;    
            case 8:
                operacion = new Base8();
                break;
            case 9:
                operacion = new Base9();
                break; 
`           */
            case 10:
                operacion = new Base10();
                break;
            case 16:
                operacion = new Base16();
                break;    
        }
        
        return operacion;
    }
}
