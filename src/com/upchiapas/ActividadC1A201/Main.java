package com.upchiapas.ActividadC1A201;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    ArrayList<Pizza> listPizza = new ArrayList<>();

    Pizza pizza = new Pizza();
    Cliente cliente = new Cliente();
    Scanner teclado = new Scanner(System.in);
    byte opcion;
    System.out.println("Pizzeria UPChiapas");
    System.out.println("Por favor Registrese");
    System.out.println("Nombre: ");
    String nombre = teclado.nextLine();
    cliente.setNombre(nombre);
    System.out.println("Direccion: ");
    String Direccion = teclado.nextLine();
    cliente.setDireccion(Direccion);
    boolean bandera=true;

    do {
      System.out.println("Menu");
      System.out.println("1. Pizza Hawaina");
      System.out.println("2. Peperoni");
      System.out.println("3. Mexicana");
      System.out.println("4. Pagar");
      System.out.println("5. Salir");
      opcion = teclado.nextByte();
      teclado.nextLine();
      int Tamano;
      switch (opcion) {
        case 1:
          pizza.setEspecialidad("Hawaina");
          System.out.println("Tipo de Tamaño: ");
          System.out.println("1. Chico");
          System.out.println("2. Mediano");
          System.out.println("3. Grande");
          Tamano = teclado.nextByte();
          pizza.setTamaño(Tamano);
          listPizza = pizza.addPizza();

          break;
        case 2:
          pizza.setEspecialidad("Peperoni");
          System.out.println("Tipo de Tamaño: ");
          System.out.println("1. Chico");
          System.out.println("2. Mediano");
          System.out.println("3. Grande");
          Tamano = teclado.nextInt();
          pizza.setTamaño(Tamano);
          listPizza = pizza.addPizza();

          break;
        case 3:
          pizza.setEspecialidad("Mexicana");
          System.out.println("Tipo de Tamaño: ");
          System.out.println("1. Chico");
          System.out.println("2. Mediano");
          System.out.println("3. Grande");
          Tamano = teclado.nextInt();
          pizza.setTamaño(Tamano);
          listPizza = pizza.addPizza();
          //teclado.nextLine();

          break;
        case 4:
          Pedido pedido = new Pedido();
          pedido.generarPedido(listPizza);
          System.out.println("Gracias por su Pedido: " + cliente.getNombre());
          System.out.println("Direccion del Cliente: " + cliente.getDireccion());
          System.out.println("_____________________________________");
          System.out.println("Desea Seguir Comprando 1.-Si,2.-No");
          int continuar=teclado.nextInt();
          if(continuar==2){
              System.out.println("Gracias Por Visitarnos Vuelva Pronto");
              bandera=false;
          }
            

          break;
        case 5:
            System.out.println("Gracias Por Visitarnos Vuelva Pronto");
            bandera=false;
          System.exit(1);
          break;
      }
      
    } while (bandera);
  }
}
