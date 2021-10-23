package com.almi.mascomponentes;

public class Jugador {

    private byte bEdad;
    private String sPosicion;
    private String sMedia;
    private double dPrecio;
    private int iImagen;


    public Jugador(int iImagen){
        this.bEdad = 0;
        this.sPosicion = "";
        this.sMedia = "";
        this.dPrecio = 0.0;
        this.iImagen = iImagen;
    }

    public Jugador(byte bEdad, String sPosicion, String sMedia, double dprecio, int iImagen) {
        this.bEdad = bEdad;
        this.sPosicion = sPosicion;
        this.sMedia = sMedia;
        this.dPrecio = dprecio;
        this.iImagen = iImagen;
    }

    public byte getbEdad() {
        return bEdad;
    }

    public void setbEdad(byte bEdad) {
        this.bEdad = bEdad;
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
                "bEdad=" + bEdad +
                ", sPosicion='" + sPosicion + '\'' +
                ", sMedia='" + sMedia + '\'' +
                ", dPrecio=" + dPrecio +
                '}';
    }
}
