/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareaaplicacioncolas;

/**
 *
 * @author nunez
 */
public class TareaAplicacionColas {

    public static void main(String[] args) {
        Compañia com = new Compañia();
        Orden[] ordenes =  new Orden[4];
        ordenes[0] = new Orden("Jose alberto", 5);
        ordenes[1] = new Orden("Pedro francisco", 12);
        ordenes[2] = new Orden("Ernesto Jose", 9);
        ordenes[3] = new Orden("Manuel Perez", 8);
        com.insertarOrden(ordenes[0]);
        com.insertarOrden(ordenes[1]);
        com.insertarOrden(ordenes[2]);
        com.insertarOrden(ordenes[3]);
        for (int i = 0; i < ordenes.length; i++) {
            System.out.println("Numero "+(i+1)+" en entrar es "+ordenes[i]);
            
        }
        System.out.println("****************************************************************************");
        System.out.println("La cantidad de de ordenes a procesar es de "+com.getCantidadOrdenes());
        System.out.println("****************************************************************************");
        com.procesarOrdenes();
        System.out.println("****************************************************************************");
                
                }
}
