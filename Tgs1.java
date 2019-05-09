/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgs1;

import java.util.Scanner;

class luaslingkaran { 
    double luas;
    int jarijari;
    void cetak() { 
        System.out.println("Luas lingkaran="+luas);
    }
}
class volumekubus { 
    int s;
    int vol;
    void cetak1 () { 
        System.out.println("Volume kubus="+vol);
    }
}

public class Tgs1 {
    public static void main(String[] args) {
        luaslingkaran l=new luaslingkaran();
        volumekubus v= new volumekubus ();
        Scanner input= new Scanner(System.in);
        System.out.println("Mneghitung luas lingkaran");
        System.out.println("Masukkan jari-jari:");
        l.jarijari= input.nextInt();
        System.out.println();
        System.out.println("Menghitung volume kubus");
        System.out.print("Masukkan sisi:");
        v.s= input.nextInt();
        
        l.luas=3.14*(l.jarijari*l.jarijari);
        v.vol=v.s*v.s*v.s;
        
        System.out.println();
        l.cetak();
        v.cetak1 ();
     
    }
    
}
