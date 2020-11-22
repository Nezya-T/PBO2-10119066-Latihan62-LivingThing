/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10119066.latihan62.livingthing;

/**
 *
 * @author Neyza-T
 */
public class Human {
    private String nama;
    
    public String getNama(){  
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void walk(String nama){
       System.out.println(nama + "sedang berjalan"); 
    }
}
