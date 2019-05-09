/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;
class Siswa {
    int nrp;
    String nama;
    
    public void setNrp(int i){ 
        nrp=i;
    }
    public void setNama(String i) { 
        nama=i;
    }
    }
public class Test2 {
    public static void main(String args[]) {
     Siswa anak= new Siswa ();
     anak.setNrp(5);
     anak.setNama("Budi");
     System.out.println(anak.nrp);
     System.out.println(anak.nama);
    }
    
}
