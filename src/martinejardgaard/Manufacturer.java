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
public class Manufacturer extends Farmer{

    
    ArrayList<Producto>productos=new ArrayList();
    Producto producto=new Producto("panlargavida");
    Producto producto2=new Producto("comePan");
    
    
    public Manufacturer() {
    }

    public Manufacturer(String nombre, String descripcion) {
        super(nombre, descripcion);
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

   
    
    
    @Override
    public ArrayList<MateriasPrimas> getMateriasproducidas() {
        return materiasproducidas;
    }

    public void setMateriasproducidas(ArrayList<MateriasPrimas> materiasproducidas) {
        this.materiasproducidas = materiasproducidas;
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
    
     public void manufacturar(Producto producto){
         producto.setMateriasrequeridas(this.materiasproducidas);
         for (int i = 0; i < productos.size(); i++) {
             productos.get(i).traza.add(this.nombre);
         }
         
         productos.add(producto);
         for (int i = 0; i <productos.size(); i++) {
             for (int j = 0; j < materiasproducidas.size(); j++) {
                 productos.get(i).traza.add(this.materiasproducidas.get(j).finca);
                 productos.get(i).traza.add(this.materiasproducidas.get(j).nombre);
                 productos.get(i).traza.add(this.materiasproducidas.get(j).cantidad);
                  productos.get(i).traza.add(this.nombre);
         }}
         
    
     }
    
    
}
