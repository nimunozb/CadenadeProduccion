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
public class Producto {
    ArrayList<MateriasPrimas> materiasrequeridas=new ArrayList();
    ArrayList traza=new ArrayList();
    protected int codigoVenta;
    protected int precio;
    protected String lote;
    protected String nombre;

    public Producto() {
    }

    public Producto(String nombre) {
        this.nombre = nombre;
    }

   
    

    public Producto(int codigoVenta, int precio, String lote) {
        this.codigoVenta = codigoVenta;
        this.precio = precio;
        this.lote = lote;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public Producto(String lote, String nombre) {
        this.lote = lote;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public Producto(int codigoVenta, int precio) {
        this.codigoVenta = codigoVenta;
        this.precio = precio;
    }

    public int getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(int codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    

    public ArrayList<MateriasPrimas> getMateriasrequeridas() {
        return materiasrequeridas;
    }

    public void setMateriasrequeridas(ArrayList<MateriasPrimas> materiasrequeridas) {
        this.materiasrequeridas = materiasrequeridas;
    }

   

    public ArrayList getTraza() {
        return traza;
    }

    public void setTraza(ArrayList traza) {
        this.traza = traza;
    }
    
    public void mostrartraza(){}
    
    
    
}
