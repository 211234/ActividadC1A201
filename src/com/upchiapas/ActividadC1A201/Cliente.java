package com.upchiapas.ActividadC1A201;

public class Cliente {

  private String Nombre;
  private String Direccion;

  public String getNombre() {
    return Nombre;
  }

  public void setNombre(String nombre) {
    this.Nombre = nombre;
  }

  public Cliente(String direccion) {
    this.Direccion = direccion;
  }

  public Cliente() {}

  public String getDireccion() {
    return Direccion;
  }

  public void setDireccion(String Direccion) {
    this.Direccion = Direccion;
  }

  @Override
  public String toString() {
    return (
      "Cliente{" +
      "Nombre='" +
      Nombre +
      '\'' +
      ", Direccion='" +
      Direccion +
      '\'' +
      '}'
    );
  }
}
