
package Week9;
import java.util.*;
public class DirtyBubble extends SuperHero{
    private int powerLevel;
    private String name;
    List <Power> powerList = new ArrayList<Power>();

    public DirtyBubble(int powerLevel, String name){
        this.powerLevel=powerLevel;
        this.name=name;
    }

    public int getPowerLevel(){
        return powerLevel;
    }
    public String getName(){
        return name;
    }
    public void addPower(Power power){
        super.addPower(power);
    }
    public void identity(){
        System.out.println("It's " + this.name + ", the DirtyBubble!" 
        + "It has the power level of " + this.powerLevel);
        System.out.println(".....HEED ME.....");
        System.out.println("FOR MY NAAAAAAAME IS " + ((this.name).toUpperCase()));
    }
    public void showPowers(){
        super.showPowers();
    }
    
    public int compareTo(SuperHero h) {
        return super.compareTo(h);
    }
}
