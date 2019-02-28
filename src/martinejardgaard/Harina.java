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
public class Harina extends MateriasPrimas{

    public Harina() {
    }

    public Harina(String nombre) {
        super(nombre);
    }
    

    public Harina(String nombre, int cantidad) {
        super(nombre, cantidad);
    }

    public Harina(String finca, String nombre, int cantidad) {
        super(finca, nombre, cantidad);
    }

    public String getFinca() {
        return finca;
    }

    public void setFinca(String finca) {
        this.finca = finca;
    }

    

   

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getCantidad() {
        return cantidad;
    }

    @Override
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
    
    
}
