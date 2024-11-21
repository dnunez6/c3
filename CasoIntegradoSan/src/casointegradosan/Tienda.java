/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casointegradosan;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author compr
 */
public class Tienda {
    private String []productos;
    private int [][]ventas;
    public String[] dias={"Lunes","Martes","Miercoles", "Jueves" , "Viernes", "Sabado", "Domingo"};
    
    public Tienda (int numProductos){
        productos=new String [numProductos];
        ventas = new int [7][numProductos];
        ingresarProductos();
        generarVentas();
        
        
        
    }
    private void ingresarProductos(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese los nombres de los productos");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Productos"+(i+1)+":");
            productos[i]=scanner.nextLine();
            
            
        }
        
        
    }
    private void generarVentas(){
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < productos.length; j++) {
                ventas [i][j]= random.nextInt(10);
                
            }
            
        }
        System.out.println("\nLas ventas generadas fueron de:\n");
        
    }
    public void MostrasVentasXproducto(){
        System.out.println("Ventas totales por producto");
        for (int i = 0; i < productos.length; i++) {
            int total=0;
            for (int j = 0; j < 7; j++) {
                total+= ventas [i][j];
                
            }
            System.out.println("*"+productos[i]+"total: "+total+"unidades");
            
            
            
        }
        System.out.println();
    }
    public void DiaMasVentas(){
        int Maxventas =1;
        int diaI =-1;
        for (int i = 0; i < 7; i++) {
            int totalDia=0;
            for (int j = 0; j < productos.length; j++) {
                totalDia+=ventas[i][j];
                
                
                
            }
            if (totalDia>Maxventas){
                Maxventas=totalDia;
                diaI=i;
            }
                    
            
        }
        System.out.println("El dia con mas ventas fue "+dias[diaI]+" con un total de ventas de "+Maxventas+" por unidad \n");
        
    }
    public void MostrarProductoMayorVendido(){
        int MaxVenta =0;
        int productoI=-1;
        for (int j = 0; j < productos.length; j++) {
            int total=0;
            for (int i = 0; i < 7; i++) {
                total+=ventas[i][j];
                
            }
            if(total>MaxVenta){
                MaxVenta=total;
                productoI=j;
            }
            
        }
        System.out.println("el producto mas vendido fue "+productos[productoI]+"con un maximo de ventas de "+MaxVenta+".");
        
    }
    
}
