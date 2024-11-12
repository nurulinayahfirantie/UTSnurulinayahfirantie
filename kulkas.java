/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utskulkas;

/**
 *
 * @author LAB SOFTWARE ITBI
 */
public class kulkas {
    String Merk;
    String Warna;
    int Model;
    
    public kulkas (String Merk, String Warna, int Model){
    this.Merk=Merk;
    this.Warna=Warna;
    this.Model=Model;
    
    }
    
    
    void tampilkanInformasiKulkas(){
    System.out.println("Merek :"+Merk);
    System.out.println("Warna :"+Warna);
    System.out.println("Model Pintu:"+Model);

    }   
}
