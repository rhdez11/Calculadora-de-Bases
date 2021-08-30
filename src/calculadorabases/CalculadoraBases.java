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
public class CalculadoraBases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //numero esperado base 10 = 956
        System.out.println("Base2");
        System.out.println(1110111100+" base2 = "+BaseXtoBase10(1110111100, 2)+" base10");
        System.out.println(956+" base10 = "+Base10toBaseX(956, 2)+" base2");
        System.out.println("Base3");
        System.out.println(1022102+" base3 = "+BaseXtoBase10(1022102, 3)+" base10");
        System.out.println(956+" base10 = "+Base10toBaseX(956, 3)+" base3");
        System.out.println("Base4");
        System.out.println(32330+" base4 = "+BaseXtoBase10(32330, 4)+" base10");
        System.out.println(956+" base10 = "+Base10toBaseX(956, 4)+" base4");
        System.out.println("Base5");
        System.out.println(12311 +" base5 = "+BaseXtoBase10(12311 , 5)+" base10");
        System.out.println(956+" base10 = "+Base10toBaseX(956, 5)+" base5");
        System.out.println("Base6");
        System.out.println(4232 +" base6 = "+BaseXtoBase10(4232 , 6)+" base10");
        System.out.println(956+" base10 = "+Base10toBaseX(956, 6)+" base6");
        System.out.println("Base7");
        System.out.println(2534+" base7 = "+BaseXtoBase10(2534, 7)+" base10");
        System.out.println(956+" base10 = "+Base10toBaseX(956, 7)+" base7");
        System.out.println("Base8");
        System.out.println(1674 +" base8 = "+BaseXtoBase10(1674 , 8)+" base10");
        System.out.println(956+" base10 = "+Base10toBaseX(956, 8)+" base8");
        System.out.println("Base9");
        System.out.println(1272 +" base9 = "+BaseXtoBase10(1272 , 9)+" base10");
        System.out.println(956+" base10 = "+Base10toBaseX(956, 9)+" base9");
        System.out.println("Base16");
        System.out.println("3BC" +" base16 = "+Integer.parseInt("3BC", 16)+" base10");
        System.out.println(956 +" base10 = "+Integer.toHexString(956).toUpperCase()+" base16");

        Calculadora calculadora =  new Calculadora();
        Operacion operacion;
        System.out.println("Probando clases");
        System.out.println("Base2");
        operacion = calculadora.getCalculadoraBase(2);
        operacion.setAll(101, 110, '+');
        operacion.realizarOperacion();
        System.out.println(operacion.ImprimirOperacion()+ operacion.getResultado());   

        System.out.println("Base3");
        operacion = calculadora.getCalculadoraBase(3);
        operacion.setAll(12, 21, '*');
        operacion.realizarOperacion();
        System.out.println(operacion.ImprimirOperacion()+ operacion.getResultado());   

        System.out.println("Base4");           
        operacion = calculadora.getCalculadoraBase(4);
        operacion.setAll(212, 31, '-');
        operacion.realizarOperacion();
        System.out.println(operacion.ImprimirOperacion()+ operacion.getResultado());   

        System.out.println("Base5");           
        operacion = calculadora.getCalculadoraBase(5);
        operacion.setAll(421, 23, '*');
        operacion.realizarOperacion();
        System.out.println(operacion.ImprimirOperacion()+ operacion.getResultado());    

        System.out.println("Base10");           
        operacion = calculadora.getCalculadoraBase(10);
        operacion.setAll(10, 11, '+');
        operacion.realizarOperacion();
        System.out.println(operacion.ImprimirOperacion()+ operacion.getResultado());     

        System.out.println("Base16");
        operacion = calculadora.getCalculadoraBase(16);
        operacion.setAll("ABC", "DEF", '+');
        operacion.realizarOperacion();
        System.out.println(operacion.ImprimirOperacion()+ operacion.getResultado());      
    }
	
    public static int BaseXtoBase10(int numero, int base){
        int base10 = 0;
        int contador =0;
        int mod =0;
        do{
            mod = numero % 10; 
            numero /= 10;
            base10+= mod * (Math.pow(base,contador));
            //System.out.println(base10 + " "+ mod+" "+numero);
            contador++;
        }while(numero!=0);

        return base10;    
    }    
    
    public static int Base10toBaseX(int numero, int base){
        String basex = "";
        int mod =0;
        do{
            mod = numero % base; 
            numero /= base;
            basex= String.valueOf(mod) + basex;
        }while(numero!=0);
        return Integer.parseInt(basex); 
    }
}
