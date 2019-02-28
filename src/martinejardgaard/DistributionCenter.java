/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martinejardgaard;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Horacio
 */
public class DistributionCenter extends Manufacturer{

    public DistributionCenter() {
    }

    public DistributionCenter(String nombre, String descripcion) {
        super(nombre, descripcion);
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

   

   
    @Override
    public Direccion getDireccion() {
        return direccion;
    }

    @Override
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
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
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    public void distribuir(){
        
        for (int i = 0; i <productos.size(); i++) {
        productos.get(i).traza.add(this.nombre);
        }
       }
    
 }
