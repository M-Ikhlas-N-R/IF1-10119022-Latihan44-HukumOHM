package com.minr;
/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : program untuk mengetahui tegangan listrik
 *
 */
public class Main {
    public static void main(String[] args) {
        Baterai baterai1 = new Baterai();
        Baterai baterai2 = new Baterai(3.0f,12.0f);
        System.out.format("\nKuat Arus : %.1f ampere", baterai2.getKuatArus());
        System.out.format("\nHambatan : %.1f ohm", baterai2.getHambatan());
        System.out.format("\nHasil Tegangan : %.1f volt", baterai2.hitungTegangan());
    }


}
