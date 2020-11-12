package com.minr;

public class Baterai {
    private float kuatArus, hambatan;
    public Baterai() {
        System.out.println("=====Hukum ohm=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar " +
                "\nakan berbanding lurus dengan beda potensial " +
                "\npada ujung-ujung kawat penghantar tersebut " +
                "\nasalkan suhu kawat dijaga konstan.");
    }

    public Baterai(float kuatArus, float hambatan){
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }

    public float hitungTegangan(){
        return this.kuatArus * this.hambatan;
    }
}
