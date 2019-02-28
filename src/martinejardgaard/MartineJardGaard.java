/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martinejardgaard;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import java.lang.Integer;

/**
 *
 * @author Horacio
 */
public class MartineJardGaard {
public ArrayList memoriadinamica=new ArrayList();
    File archivo = new File("traza.txt");
    Direccion direccion=new Direccion();
     protected String nombre;
     protected  String descripcion;

    public MartineJardGaard() {
          if(archivo.exists()){
            System.out.println("ready to use");}
    }

    public MartineJardGaard(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
          if(archivo.exists()){
            System.out.println("ready to use");}
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    public int numerodatos() throws FileNotFoundException{
     Scanner b =new Scanner(archivo);
       int contador=0;
         while(b.hasNext()){
             String word=b.next();
                     contador++;}
                return contador;}

    
    public void cargar() throws FileNotFoundException{
         Scanner lectura =new Scanner(archivo);
       
          for (int i = 0; i < numerodatos(); i++) {
              if(lectura.hasNextInt()){
                 int numero=lectura.nextInt();
                   this.memoriadinamica.add(numero);}
                      else{ 
                        String word=lectura.next();
                         this.memoriadinamica.add(word);
             }}
     }
    
    public ArrayList buscar(String nombre) throws FileNotFoundException{
         ArrayList sumap= new ArrayList();
         cargar();
         int k=memoriadinamica.indexOf(nombre);
         for (int i = k; i <k+5;i++) {
               
                    sumap.add(memoriadinamica.get(i));
    
            
        }
        return sumap;
    }
    
    
   public void guardarmomento() throws FileNotFoundException{
       PrintStream bibliotecario=new PrintStream(archivo);
       cargar();
       for (int i = 0; i < memoriadinamica.size(); i++) {
           bibliotecario.print(memoriadinamica.get(i)+" ");
       }
   }
  public void guardaralgo(ArrayList local) throws FileNotFoundException{
       PrintStream bibliotecario=new PrintStream(archivo);
       Scanner lectura =new Scanner(archivo);
       cargar();
       if(memoriadinamica.equals(local)){
       
       
       }else{
      for (int i = 0; i <local.size(); i++) {
           memoriadinamica.add(local.get(i));}
       guardarmomento();
       System.out.println("se ha guardado correctamente");
   }}

public void organizar() throws FileNotFoundException{
    PrintStream bibliotecario=new PrintStream(archivo);
       Scanner lectura =new Scanner(archivo);
     cargar();
      for (int i = 0; i < memoriadinamica.size(); i++) {
          if (i%20==0&&i!=0) {
               bibliotecario.println(memoriadinamica.get(i)+" ");
          }else{
                 bibliotecario.print(memoriadinamica.get(i)+" ");
       }
    
    
    
}
}   
  
   
    
}
