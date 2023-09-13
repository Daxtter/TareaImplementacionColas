/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareaaplicacioncolas;

/**
 *
 * @author nunez
 */
public class Compañia {
    Cola<Orden> ordenes;
    
    
    public Compañia()
    {
        ordenes = new Cola<>(10);
    
    }
    public void insertarOrden(Orden dato)
    {
        ordenes.insertarDato(dato);
    }
    public void procesarOrdenes()
    {
        
        if(ordenes.verPrimero() != null){
            System.out.println("Orden procesada de "+ ordenes.eliminadrDato());
            procesarOrdenes();
        }
    }
    public int getCantidadOrdenes()
    {
        Cola<Orden> aux = new Cola<>(10);
        int i = 0;
        
        do{
        aux.insertarDato(ordenes.eliminadrDato());
        i++;
        }while(ordenes.verPrimero()!=null);
        for (int j = 0; j < i; j++) {
            ordenes.insertarDato(aux.eliminadrDato());
            
        }
    return i;
    }
}
