/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
 class Siswa {
     int nrp;
     public void setNrp(int i) {
         nrp=i;
         
     }
 }
public class Test {
    public static void main(String[] args) {
     Siswa anak=new Siswa();
     anak.setNrp(5);
     System.out.println(anak.nrp);
    } 
    
}
