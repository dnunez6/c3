/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casointegradosan;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author compr
 */
public class CasoIntegradoSan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner= new Scanner (System.in);
        int numProductos=scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Ingrese la cantidad de productos que hay en la tienda");
        
        Tienda tienda = new Tienda(numProductos);
        tienda.MostrasVentasXproducto();
        tienda.MostrarProductoMayorVendido();
        tienda.DiaMasVentas();
        
        scanner.close();
    }
    
}
