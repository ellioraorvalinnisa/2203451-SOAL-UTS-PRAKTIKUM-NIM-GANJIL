/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ellioraorvalinnisa_2203451.main;

/**
 *
 * @author Elliora Orva Linnisa
 */
public class Main {

    public static void main(String[] args) {
    /* inisialisasi objek limasSegiEmpat 1 */
        LimasSegiEmpat limasSegiEmpat1 = new LimasSegiEmpat();
        System.out.println("Limas segi empat dengan luas alas :  " + limasSegiEmpat1.luasAlas + " luas selubung limas :  " + limasSegiEmpat1.luasSelubungLimas + " dan tinggi : " + limasSegiEmpat1.tinggi + ". Luasnya :  " + limasSegiEmpat1.getLuas()+ ", sedangkan volumenya : " +limasSegiEmpat1.getVolume());
    
        /* inisialisasi objek limasSegiEmpat 2 */
        LimasSegiEmpat limasSegiEmpat2 = new LimasSegiEmpat(30,40,50);
        System.out.println("Limas segi empat dengan luas alas :  " + limasSegiEmpat2.luasAlas + " luas selubung limas :  " + limasSegiEmpat2.luasSelubungLimas + " dan tinggi : " + limasSegiEmpat2.tinggi + ". Luasnya : " + limasSegiEmpat2.getLuas()+ ", sedangkan volumenya : " +limasSegiEmpat2.getVolume());
    
    
        /* inisialisasi objek limasSegiEmpat 3 */
        LimasSegiEmpat limasSegiEmpat3 = new LimasSegiEmpat();
        /* modifikasi nilai atribut ke atributnya langsung */
        //segitiga3.alas = 25;
        //segitiga3.tinggi = 35;
        //segitiga3.sisi = 45;
        /* modifikasi nilai atribut melalui method setLuasAlas, setLuasSelubung, dan setTinggi*/
        limasSegiEmpat3.setLuasAlas(25);
        limasSegiEmpat3.setLuasSelubung(35);
        limasSegiEmpat3.setTinggi(45);
        System.out.println("Limas segi empat dengan luas alas :  " + limasSegiEmpat3.luasAlas + " luas selubung limas :  " + limasSegiEmpat3.luasSelubungLimas + " dan tinggi : " + limasSegiEmpat3.tinggi + ". Luasnya : " + limasSegiEmpat3.getLuas()+ ", sedangkan volumenya : " +limasSegiEmpat3.getVolume());;;
    }
}
