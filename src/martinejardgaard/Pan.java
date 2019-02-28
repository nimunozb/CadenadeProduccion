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
public class Pan extends Producto{

    public Pan() {
    }

    public Pan(int codigoVenta, int precio, String lote) {
        super(codigoVenta, precio, lote);
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public Pan(int codigoVenta, int precio) {
        super(codigoVenta, precio);
    }

    @Override
    public int getCodigoVenta() {
        return codigoVenta;
    }

    @Override
    public void setCodigoVenta(int codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(int precio) {
        this.precio = precio;
    }

   

    
    @Override
    public ArrayList<MateriasPrimas> getMateriasrequeridas() {
        return materiasrequeridas;
    }

    public void setMateriasrequeridas(ArrayList<MateriasPrimas> materiasrequeridas) {
        this.materiasrequeridas = materiasrequeridas;
    }

    @Override
    public ArrayList getTraza() {
        return traza;
    }

    @Override
    public void setTraza(ArrayList traza) {
        this.traza = traza;
    }

    
   
    
    
    
    
    
    
    
}
