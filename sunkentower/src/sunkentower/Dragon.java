
package sunkentower;


public class Dragon extends Creature {
    
    public int fireBreath;
    
    public Dragon(int fireBreath) {
        super(200);
        this.fireBreath = fireBreath;
    }
    
    public int getFireBreath() {
        return fireBreath;
    }
    
    public void roar() {
        System.out.println("The dragon roars!!!!");
    }
    
    public void flying() {
        System.out.println("The terrible dragon has taken flight!");
    }
    
    
    
}
