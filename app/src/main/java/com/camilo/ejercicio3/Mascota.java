package com.camilo.ejercicio3;

public class Mascota {
    private int idMascota;
    private String nombreMascota;
    private int fotoMascota;
    private String NoLikes;

    public Mascota(int idMascota, String nombreMascota, int fotoMascota, String noLikes) {
        this.idMascota = idMascota;
        this.nombreMascota = nombreMascota;
        this.fotoMascota = fotoMascota;
        this.NoLikes = noLikes;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public int getFotoMascota() {
        return fotoMascota;
    }

    public void setFotoMascota(int fotoMascota) {
        this.fotoMascota = fotoMascota;
    }

    public String getNoLikes() {
        return NoLikes;
    }

    public void setNoLikes(String noLikes) {
        NoLikes = noLikes;
    }

    public void addLikes(){
        int NoLikesIncrement;
        NoLikesIncrement = Integer.parseInt(NoLikes);
        NoLikesIncrement++;
        this.NoLikes = String.valueOf(NoLikesIncrement);
    }

}

