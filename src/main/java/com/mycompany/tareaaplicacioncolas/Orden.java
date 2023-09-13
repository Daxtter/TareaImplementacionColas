/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareaaplicacioncolas;

/**
 *
 * @author nunez
 */
public class Orden {
    String nombreCLinete;
    int cantidadDeProductor;

    public Orden(String nombreCLinete, int cantidadDeProductor) {
        this.nombreCLinete = nombreCLinete;
        this.cantidadDeProductor = cantidadDeProductor;
    }

    @Override
    public String toString() {
        return "Orden{" + "Cliente: " + nombreCLinete + ", Cantida de producto :" + cantidadDeProductor + '}';
    }
    
}
