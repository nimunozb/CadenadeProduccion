/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martinejardgaard;

import java.util.ArrayList;

/**
 *
 * @author Horacio
 */
public class MateriasPrimas {
    protected String finca;
    protected String nombre;
    protected int cantidad;

    public MateriasPrimas() {
    }

    public MateriasPrimas(String nombre) {
        this.nombre = nombre;
    }
    

    public MateriasPrimas(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getFinca() {
        return finca;
    }

    public void setFinca(String finca) {
        this.finca = finca;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public MateriasPrimas(String finca, String nombre, int cantidad) {
        this.finca = finca;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    
    
    
    
    
}
