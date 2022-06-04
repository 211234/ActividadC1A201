package com.upchiapas.ActividadC1A201;

import java.util.ArrayList;

public class Pedido {

  public void generarPedido(ArrayList<Pizza> lista) {
    int totalPagar = 0;
    if(lista.size()>0){
        for(int i =0; i<lista.size();i++){
            if (lista.get(i).getTamaño() == 1) 
            lista.get(i).setPrecio(99);
            else if (lista.get(i).getTamaño() == 2) 
            lista.get(i).setPrecio(120); 
            else
            lista.get(i).setPrecio(150);
    
            totalPagar+=lista.get(i).getPrecio();
        }

        System.out.println("Su pedido es:");

        for(int i =0; i<lista.size();i++){
            System.out.println("__________________");
    
            System.out.println("Pizza´s" +lista.get(i).getEspecialidad());
            if (lista.get(i).getTamaño() == 1) System.out.println(
              "De Tamaño Pequeña"
            ); else if (lista.get(i).getTamaño() == 2) System.out.println(
              "De Tamaño Mediana"
            ); else System.out.println("De Tamaño Grande");
           System.out.println("__________________");
        }
        // for (Pizza pizza : lista) {
        //  System.out.println("__________________");
    
        //   System.out.println("Pizza´s" + pizza.getEspecialidad());
        //   if (pizza.getTamaño() == 1) System.out.println(
        //     "De Tamaño Pequelña"
        //   ); else if (pizza.getTamaño() == 2) System.out.println(
        //     "De Tamaño Mediana"
        //   ); else System.out.println("De Tamaño Grande");
        //  System.out.println("_________________");
        // }
    
        System.out.println("Su total a Pagar es $" + totalPagar);

    }else{
        System.out.println("Usted no a Agredado ni una Pizza a su Pedido");
    }

    // for (Pizza pizza : lista) {
    //   if (pizza.getTamaño() == 1) pizza.setPrecio(99); else if (
    //     pizza.getTamaño() == 2
    //   ) pizza.setPrecio(120); else pizza.setPrecio(150);

    //   totalPagar+=pizza.getPrecio();
    // }

    
   
    
  }
}
