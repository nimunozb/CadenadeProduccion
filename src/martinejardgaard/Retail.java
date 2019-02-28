/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martinejardgaard;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Horacio
 */
public class Retail extends DistributionCenter{

    public Retail() {
    }

    public Retail(String nombre, String descripcion) {
        super(nombre, descripcion);
    }

    @Override
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    @Override
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
    
    public void enlistar(){
        
        for (int i = 0; i < productos.size(); i++) {
            productos.get(i).setCodigoVenta(2*productos.size()*(i+2));
            productos.get(i).setPrecio(productos.size()+1+1+5*(i+2));
            productos.get(i).traza.add(this.nombre);
            productos.get(i).traza.add(productos.get(i).getCodigoVenta());
            productos.get(i).traza.add(productos.get(i).getPrecio());
        }
        }
    public void obternertraza(int a){
    
        for (int i = 0; i < this.productos.size(); i++) {
            for (int j = 0; j < this.productos.get(i).traza.size(); j++) {
                System.out.println(  this.productos.get(i).traza.get(j));
            }
        }
    
    
    }
    
    public void obternertraza(){
      
        for (int i = 0; i <this.productos.size(); i++) {
            
            System.out.println();  
            System.out.println();
            
            System.out.println(this.productos.get(i).getNombre());
            System.out.println("");
            
            System.out.println("hecha con "+this.productos.get(i).traza.get(2)+" de "+this.productos.get(i).traza.get(1)
                         +" ,esta fue cosechada en "+this.productos.get(i).traza.get(0));
              
            System.out.println("hecha con "+this.productos.get(i).traza.get(6)+" de "+this.productos.get(i).traza.get(5)
                         +" ,esta fue cosechada en "+this.productos.get(i).traza.get(4));
            
                 System.out.println("Este pan fue producido en la fabrica "+this.productos.get(i).traza.get(7));
                 
                 System.out.println("fue llevada a "+this.productos.get(i).traza.get(12)+" a las "+this.productos.get(i).traza.get(8)+" horas, del dia "+
                         this.productos.get(i).traza.get(9)+" ,del mes "+this.productos.get(i).traza.get(10)+" ,del año "+this.productos.get(i).traza.get(11));
                 
                 System.out.println("fue llevada a "+this.productos.get(i).traza.get(17)+" a las "+this.productos.get(i).traza.get(13)+" horas, del dia "+
                         this.productos.get(i).traza.get(14)+" ,del mes "+this.productos.get(i).traza.get(15)+" ,del año "+this.productos.get(i).traza.get(16));
                 System.out.println("con cun codigo de venta "+this.productos.get(i).traza.get(18));
                 System.out.println("con un precio de "+this.productos.get(i).traza.get(19));
                 
                 System.out.println("");
                 System.out.println("");
        }}
       
   
public void Vender(Consumer cliente){
    Scanner sc = new Scanner(System.in);
    System.out.println("desea seleccionar el articulo mencionado en la primara ocacion o el segundo");
    int a= sc.nextInt();
     String b= cliente.decidir();
    

if (b.equals("yes")){
    System.out.println("");
    System.out.println("Muchas gracias por tu compra, sigue visitando nuestra sucursal, tu sucursal");
    System.out.println("");
    
    
}else{
    
    System.out.println("");
    System.out.println("Te podriamos seguir ofreciondo mas productos, estamos para servirte");
    System.out.println("");
    
}
}








}
    
    

