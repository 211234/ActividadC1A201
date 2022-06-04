package com.upchiapas.ActividadC1A201;

public class Tienda {
    public String nombreTienda;
    public String Direccion;
    public String Duenos;
    public Tienda(String nombreTienda, String direccion, String duenos) {
        this.nombreTienda = nombreTienda;
        Direccion = direccion;
        Duenos = duenos;
    }

    public Tienda() {
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getDuenos() {
        return Duenos;
    }

    public void setDuenos(String duenos) {
        Duenos = duenos;
    }

    

}
