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
public class LivingThing extends Human {
    
    @Override
    public void walk(String nama){
        System.out.println(nama + " sedang berjalan");
    }
    public void breath(String nama){
        System.out.println(nama + " Bernafas");
    }
    public void eat(String nama){
        System.out.println(nama + " Makan");
    }
}
