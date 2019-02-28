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
public class Transporte {
    
    Fecha fecha=new Fecha();
    
    
   public void llevarfarmertomanufacturer(Farmer parcela,Manufacturer fabrica,String materiaallevar){
       if (materiaallevar.equals("harina")) {
            fabrica.materiasproducidas.add(parcela.harina);
       }else{
           fabrica.materiasproducidas.add(parcela.leche);
       }
   
       System.out.println("se ha llevado correctamente la "+materiaallevar+" a "+fabrica.nombre+" de la finca "+parcela.nombre);
   
   }

public void llevarfacturertodistribution(Manufacturer fabrica,DistributionCenter bodega,int hora,int dia,int mes,int anno){
  
    this.fecha.horamilitar=hora;
    this.fecha.dia=dia;
    this.fecha.anno=anno;
    this.fecha.mes=mes;
    
    for (int i = 0; i <fabrica.productos.size(); i++) {
        fabrica.productos.get(i).traza.add(hora);
          fabrica.productos.get(i).traza.add(dia);
             fabrica.productos.get(i).traza.add(mes);
            fabrica.productos.get(i).traza.add(anno);
    }
    
   // fabrica.productos=bodega.productos;
   bodega.setProductos(fabrica.getProductos());
   System.out.println("se ha llevado correctamente los productos a "+bodega.nombre+" de la manufacturadora "+fabrica.nombre);
    
}

public void llevardistributiontoretail(DistributionCenter bodega,Retail tienda,int hora,int dia,int mes,int anno){
  
    this.fecha.horamilitar=hora;
    this.fecha.dia=dia;
    this.fecha.anno=anno;
      this.fecha.mes=mes;
    
    for (int i = 0; i <bodega.productos.size(); i++) {
        bodega.productos.get(i).traza.add(hora);
          bodega.productos.get(i).traza.add(dia);
           bodega.productos.get(i).traza.add(mes);
            bodega.productos.get(i).traza.add(anno);
    }
    
   // bodega.productos=tienda.productos;
    tienda.setProductos(bodega.getProductos());
   System.out.println("se ha llevado correctamente los productos a "+tienda.nombre+" del centro de distribucion "+bodega.nombre);
   
    
}
















}
