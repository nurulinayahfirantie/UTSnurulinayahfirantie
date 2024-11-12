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
public class UtsKulkas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        kulkas kulkas1= new kulkas("Polytron", "Merah", 1);
       
        System.out.println("==Data Kulkas==");
        kulkas1.tampilkanInformasiKulkas();
    
    }
    
}
