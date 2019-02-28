/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martinejardgaard;

/**
 *
 * @author Horacio
 */
public class Leche extends MateriasPrimas{

    public Leche() {
    }

    public Leche(String nombre) {
        super(nombre);
    }
   
    public Leche(String nombre, int cantidad) {
        super(nombre, cantidad);
    }

    public Leche(String finca, String nombre, int cantidad) {
        super(finca, nombre, cantidad);
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
