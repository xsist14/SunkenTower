/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sunkentower;


public class Sunkentower {
    
    public Sunkentower() {
        
    }

    public static void main(String[] args) {
        Player bilbo = new Player();
        Dragon smaug = new Dragon(30);
        System.out.println("Bilbo has a health level of " + bilbo.getHealthPoints());
        System.out.println("Smaug has health of " + smaug.getHealthPoints() + 
                " and does fire damage of " + smaug.getFireBreath());
        System.out.println("Uh-Oh!");
        smaug.flying();
        smaug.roar();
    }
    
}
