/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ellioraorvalinnisa_2203451.main;

/**
 *
 * @author Elliora Orva Linnisa
 */

/* atribut dari suatu class */
public class LimasSegiEmpat {
  double luasAlas; 
  double luasSelubungLimas; 
  double tinggi; 
 
/* konstruktor dengan nilai default luasAlas, luasSelubungLimas, dan tinggi adalah 1, non argumen */
  LimasSegiEmpat (){
      luasAlas = 1;
      luasSelubungLimas = 1;
      tinggi = 1;
  }

  /* konstruktor dengan nilai luasAlas, luasSelubungLimas, dan tinggi spesifik */
    LimasSegiEmpat (double luasAlasBaru, double luasSelubungLimasBaru, double tinggiBaru){
      luasAlas = luasAlasBaru;
      luasSelubungLimas = luasSelubungLimasBaru;
      tinggi = tinggiBaru;
  }
    
/* method dari suatu class */

/* menghitung luas limas segi emapat */
  double getLuas (){
      return luasAlas + luasSelubungLimas; 
  }
  
 /* menghitung volume limas segi emapat  */
  double getVolume (){
      return 0.33 * luasAlas * tinggi;
  }
 
 /* menset nilai Luas Alas limas segi emapat  */
  void setLuasAlas (double luasAlasBaru){
      luasAlas = luasAlasBaru;
  }

 /* menset nilai Luas Selubung limas segi emapat  */
  void setLuasSelubung (double luasSelubungLimasBaru){
      luasSelubungLimas = luasSelubungLimasBaru;
  }

/* menset nilai tinggi limas segi emapat */
  void setTinggi (double tinggiBaru){
      tinggi = tinggiBaru;
  }
 
}
