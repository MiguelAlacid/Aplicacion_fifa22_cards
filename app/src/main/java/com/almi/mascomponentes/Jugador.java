package com.almi.mascomponentes;

public class Jugador {

    private int iEdad;
    private String sPosicion;
    private String sMedia;
    private double dPrecio;
    private int iImagen;


    public Jugador(int iImagen){
        this.iEdad = 0;
        this.sPosicion = "";
        this.sMedia = "";
        this.dPrecio = 0.0;
        this.iImagen = iImagen;
    }

    public Jugador(int iEdad, String sPosicion, String sMedia, double dprecio, int iImagen) {
        this.iEdad = iEdad;
        this.sPosicion = sPosicion;
        this.sMedia = sMedia;
        this.dPrecio = dprecio;
        this.iImagen = iImagen;
    }

    public int getiEdad() {
        return iEdad;
    }

    public void setiEdad(int iEdad) {
        this.iEdad = iEdad;
    }

    public String getsPosicion() {
        return sPosicion;
    }

    public void setsPosicion(String sPosicion) {
        this.sPosicion = sPosicion;
    }

    public String getsMedia() {
        return sMedia;
    }

    public void setsMedia(String sMedia) {
        this.sMedia = sMedia;
    }

    public double getdPrecio() {
        return dPrecio;
    }

    public void setdPrecio(double dprecio) {
        dPrecio = dprecio;
    }

    public int getiImagen() {
        return iImagen;
    }

    public void setiImagen(int iImagen) {
        this.iImagen = iImagen;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "iEdad=" + iEdad +
                ", sPosicion='" + sPosicion + '\'' +
                ", sMedia='" + sMedia + '\'' +
                ", dPrecio=" + dPrecio +
                '}';
    }
}
