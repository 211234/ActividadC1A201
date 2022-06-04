package com.upchiapas.ActividadC1A201;

import java.util.ArrayList;

public class Pizza {

  private String Especialidad;
  private int Tamano;
  private int Precio;

  public String getEspecialidad() {
    return Especialidad;
  }

  public void setEspecialidad(String especialidad) {
    Especialidad = especialidad;
  }

  public Pizza(String especialidad, int tamaño, int precio) {
    Especialidad = especialidad;
    Tamano = tamaño;
    Precio = precio;
  }

  public Pizza() {}

  public int getTamaño() {
    return Tamano;
  }

  public void setTamaño(int tamaño) {
    Tamano = tamaño;
  }

  public int getPrecio() {
    return Precio;
  }

  public void setPrecio(int precio) {
    Precio = precio;
  }

  public Pizza[] getLista() {
    return lista;
  }

  public void setLista(Pizza[] lista) {
    this.lista = lista;
  }

  ArrayList<Pizza> listPizza = new ArrayList<>();

  Pizza[] lista;

  Pizza[] addPizza(Pizza[] lista) {
    this.lista = lista;
    return lista;
  }

  public ArrayList<Pizza> addPizza() {
    String Especialidad = getEspecialidad();
    int Tamaño = getTamaño();
    int Precio = getPrecio();

    Pizza pizza = new Pizza(Especialidad, Tamaño, Precio);

    listPizza.add(pizza);
   
    return listPizza;
  }
}
