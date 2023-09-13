/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareaaplicacioncolas;

/**
 *
 * @author nunez
 * @param <T>
 */public class Cola<T> {
    T[] cola;
    int inicio;
    int fin;

    public Cola(int MAX) {
        this.cola =(T[]) new Object[MAX];
        this.inicio = -1;
        this.fin = -1;
    }
    public void insertarDato(T dato)
    {
        
        if(fin <cola.length)
        {
            fin++;
            cola[fin] = dato;
            if(fin ==1)
            {
                inicio = 0;
            }
            
        }
        else
        {
            System.out.println("Desbordamiento");
        }
        
    }
    public T eliminadrDato()
    {
        T dato = null;
        if(inicio!=-1)
        {
            dato = cola[inicio];
            cola[inicio] = null;
            if(inicio == fin)
            {
                inicio = -1;
                fin =-1;
            }
            else{
            inicio++;
            }
            
        }
        else{
        
            System.out.println("Subdesbordamiento");
        }
        return dato;
        
    }
    public T verPrimero()
    {
        T aux  = null ;
        
        if(inicio !=-1)
        {
            aux = cola[inicio];
        
        }
        return aux;
    }
    public boolean estaVacio()
    {
        return fin == -1;
    
    }
    public boolean estaLleno()
    {
        return fin==cola.length;
    }
    
    
}

