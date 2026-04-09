/*
 * 
 */
package com.mycompany.praktikum09042026;

/**
 *
 * @author Rahmi Aulia
 */
import java.util.Scanner;
public class PersegiPanjangEnkapsulasi {
    
     private int panjang;
     private int lebar;
     private static int jumlahObjek = 0;
    
    PersegiPanjangEnkapsulasi (){
       jumlahObjek++; 
    }
    
    PersegiPanjangEnkapsulasi(int p, int l){
    panjang = p;
    lebar = l;
    jumlahObjek++;
    }
     
    public int getPanjang(){
        return panjang;
    }
    
    public void setPanjang(int panjang){
        this.panjang = panjang;
    }
    
     public int getLebar(){
        return lebar;
    }
    
    public void setLebar(int lebar){
        this.lebar = lebar;
    }
    
    public static int getjumlahObjek(){
        return jumlahObjek;
    }
    
    public int getLuas(){
        return (panjang*lebar);
    }

    public int getKel(){
        return(2*(panjang*lebar));
    }
           
               
    public void TampilData(){
    System.out.println("Panjang persegi panjang =" +panjang);
    System.out.println("Lebar persegi panjang =" +lebar);
    System.out.println("luas persegi Panjang =" +getLuas());
    System.out.println("Keliling = " +getKel());    
    }
}
