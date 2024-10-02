/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c3;

/**
 *
 * @author viti
 */
public class C3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        for (int i = 10; i > 0; i--) {
            System.out.println("i: " + i);
        }
        System.out.println("FELIZ ANIO NUEVO");
        for (;;){
        }
         */

 /*
        int i=10;
        while (i > 0) {            
            System.out.println("i= " + i);
            i--;
        }
        System.out.println("FELIZ ANIO NUEVO");
        
         */
 /*
        System.out.print("Sin salto de linea");
        System.out.print("Sin salto de linea");
        System.out.print("Sin salto de linea");
        
        System.out.println("Con salto de linea");
        System.out.println("Con salto de linea");
        System.out.println("Con salto de linea");
        
         */
 /*  
        for (int i = 0; i < 50; i++) {
            if (i == 10 || i == 20 || i == 30 || i == 40 || i == 50) {
                System.out.println("");
            }
            System.out.print("@");
        }
         */
 /*
        int variable=0;
        do {
            System.out.println("Variable =" + variable++);
        }while (variable < 10);
         */
 /*
        int i = 0;
        int j = 0;

        System.out.println("i++: " + i++);
        System.out.println("i: " + i);
        System.out.println("++j: " + ++j);
 */
        
        
        String resultado = "****************************\n";
        resultado += " MI PROFESOR SI ME ENSEÑO A DEBUGEAR";
        resultado = resultado + "\n****************************";
        String bucles ="";
        int cantidadTotal=0;
        for (int i = 0; i < 5; i++) {
            bucles += "inicio i =" + i +"\n";
            for (int j = 0; j < 7; j++) {
                cantidadTotal++;
                System.out.println("cantidadTotal="+cantidadTotal);
            }
            bucles += "fin i =" + i +"\n";
        }

        System.out.println("cantidad = " + cantidadTotal);
        System.out.println("bucles = " + bucles);
        
         
    }

}
