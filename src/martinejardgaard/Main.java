/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martinejardgaard;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Horacio
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        MartineJardGaard martinejard=new MartineJardGaard();
        
       martinejard.cargar();
       
        Farmer X =new Farmer("FincaDoñaJuana","muy Hermosa");
        Farmer Y =new Farmer("Fincacarmelita","Elabora buenos Productos");
        Manufacturer W=new Manufacturer("fabricTodohacer","No daña el medio ambiente");
        DistributionCenter D=new DistributionCenter("SuperEntrega","Muy rapido a la hora de entregar");
        Retail R=new Retail("superMarket","muy aseado, siempre buenos precios");
        Transporte T=new Transporte();
        Consumer C=new Consumer("Fabian Andres",1234);
        
        T.llevarfarmertomanufacturer(Y, W,"harina");
        T.llevarfarmertomanufacturer(X, W,"leche");
        W.manufacturar(W.producto);
        T.llevarfacturertodistribution(W, D, 10, 6,2, 2019);
        D.distribuir();
        T.llevardistributiontoretail(D, R, 20, 15,2, 2019);
        R.enlistar();
        
        W.manufacturar(W.producto2);
        T.llevarfacturertodistribution(W, D, 10, 7,8, 2019);
        D.distribuir();
        T.llevardistributiontoretail(D, R, 20, 15,8, 2019);
        R.enlistar();
        
        
        
        martinejard.guardaralgo(R.getProductos().get(0).traza);
      
       martinejard.organizar();
    
        
         Scanner sc = new Scanner(System.in);
          while (true){
         
        System.out.println("Bienvenido a superMarket");
        System.out.println("Que desea Hacer?");
        System.out.println("1 ver los productos");
        System.out.println("2 ver informacion de los productos");
            System.out.println("3 Salir");
        int a =sc.nextInt();
        
                switch(a){
            
            case 1:
                System.out.println();
                System.out.println();
                     
                System.out.println("Por el momento solo ofrecemos Pan de la mejor calidad");
                System.out.println("estamos trabajando para darte la mejor variedad en tus productos");
                
                System.out.println();
                System.out.println("");
                break;
            case 2:  R.obternertraza();
                    R.Vender(C); break;
            case 3:System.exit(0);break;
             
               
               
                
               }
       
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    }
}
