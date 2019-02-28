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
public class Farmer extends MartineJardGaard{

    protected ArrayList<MateriasPrimas> materiasproducidas=new ArrayList();
    Leche leche=new Leche(this.nombre,"Leche",2);
        Harina harina=new Harina(this.nombre,"harina",3);
    public Farmer() {
          
    }

    public Farmer(String nombre, String descripcion) {
        super(nombre, descripcion);
        
    }

    public ArrayList getMateriasproducidas() {
        return materiasproducidas;
    }

    public void setMateriasproducidas(int posicion, String materiaprima,int cantidad) {
        this.materiasproducidas.get(posicion).nombre=materiaprima;
        this.materiasproducidas.get(posicion).cantidad=cantidad;
        
    }

    public Leche getLeche() {
        return leche;
    }

    public void setLeche(Leche leche) {
        this.leche = leche;
    }

    public Harina getHarina() {
        return harina;
    }

    public void setHarina(Harina harina) {
        this.harina = harina;
    }

   
    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
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

    public void recolectar(int cantidad,MateriasPrimas materia){
    
        for (int i = 0; i <cantidad; i++) {
            this.materiasproducidas.add(materia);
        }
        
        
        
}











}
