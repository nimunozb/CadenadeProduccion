/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martinejardgaard;

import java.util.Scanner;

/**
 *
 * @author Horacio
 */
public class Consumer {
    private String nombre;
    private int identificacion;

    public Consumer() {
    }

    public Consumer(String nombre, int identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }
    
    public String decidir(){
        Scanner makedecition=new Scanner(System.in);
        System.out.println("Señor: "+this.nombre+" desea comprar este articulo.(yes/no)");
        String k=makedecition.next();
       return k;
    }
}
