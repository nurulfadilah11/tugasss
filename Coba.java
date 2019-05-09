/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;
class Mahasiswa {
    int nrp;
    String nama;
    
    public void setnrp(int nrp)
    {
        this.nrp=nrp;
    }
    public void setnama(String nama)
    {
        this.nama=nama;
    }
    public int getnrp()
    {
        return nrp;
    }
    public String getnama()
    {
        return nama;
    }
    
}
public class Coba {

    public static void main(String[] args) {
    Mahasiswa mhs=new Mahasiswa();
    mhs.setnrp(7201);
    mhs.setnama("Muhammad Ali");
    System.out.println("Nama Mahasiswa"+mhs.getnama()+"NRP"+mhs.getnrp());
    
    }
    
}
