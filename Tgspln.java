/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgspln;

import java.util.Scanner;

class inputan { 
    String n;
    String a;
    int t;
    char b;
    int Byr   ;
    int kembali;
}
public class Tgspln {
    public static void main(String[] args) {
    inputan x= new inputan();
    Scanner input= new Scanner(System.in);
    System.out.println("Pembayaran PLN");
    System.out.print("n:");
    x.n=input.nextLine();
    System.out.print("a:");
    x.a=input.nextLine();
    System.out.print("Tipe Rumah:");
    x.t=input.nextInt();
    
    switch(x.t) {
        case 36:
            System.out.print("Blok:");
            x.b=input.next().charAt(0);
            if(x.b=='A'){ int A= 500000;
            System.out.println("Nama:"+x.n);
            System.out.println("Alamat:"+x.a);
            System.out.println("Harga Bayar: Rp.500.000");
            System.out.print("Bayar:");
            x.Byr=input.nextInt();
            x.kembali=x.Byr-A;
            System.out.println("Kembalian:"+x.kembali);
            }
            else if(x.b=='B'){int B=300000;
                    System.out.println("Nama:"+x.n);
                    System.out.println("Alamat:"+x.a);
                    System.out.println("Harga Bayar: Rp.600.000");
                    System.out.print("Bayar:");
                    x.Byr=input.nextInt();
                    x.kembali=x.Byr-B;
                    System.out.println("Kembalian:"+x.kembali);
            }
        break;
        default:System.out.println("Tidak ada pilihan");
            
                    
            
            
            }
            }
        
    }
        
    
    
    
    

