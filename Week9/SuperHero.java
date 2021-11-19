
package Week9;
import java.util.*;

public abstract class SuperHero implements Comparable<SuperHero>{
    private int powerLevel;
    private String name;
    List <Power> powerList = new ArrayList<Power>();

    abstract int getPowerLevel();
    abstract String getName();

    public void addPower(Power power){
        powerList.add(power);
    }
    abstract void identity(); 

    public void showPowers(){
        System.out.println("TIME TO SHOW YOU MY POWERS");
        for(Power a:powerList){
            a.doPower();
        }
    }
    public int compareTo(SuperHero h){
        if (this.powerLevel > h.getPowerLevel()) {
            return 1;
        } else {
            return this.powerLevel < this.getPowerLevel() ? -1 : 0;
        }
    }

}
     
