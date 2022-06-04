package com.upchiapas.ActividadC1A201;

public class CatalgoPiezza {
   public String Tamaño;

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String tamaño) {
        this.Tamaño = tamaño;
    }

    public CatalgoPiezza(String tamaño) {
        Tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "CatalgoPiezza{" +
                "Tamaño='" + Tamaño + '\'' +
                '}';
    }
}
