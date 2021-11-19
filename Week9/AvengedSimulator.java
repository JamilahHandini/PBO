

package Week9;
import java.util.*;

public class AvengedSimulator {
    public static void main(String[] args){
        
        List <SuperHero> list = new ArrayList<SuperHero>();
        Power p1 = new Strength();
        Power p2 = new LaserEye();
        Power p3 = new Flying();
        
        
        SuperHero h1 = new FlyingDutchMan(36556, "Tatenari");
        h1.addPower(p3);
        h1.addPower(p2);
        
        SuperHero h2 = new ManRay(553, "Gyoubu Masataka Oniwa");
        h2.addPower(p2);
        h2.addPower(p1);

        SuperHero h3 = new DirtyBubble(666, "Arnastria");
        h3.addPower(p1);
        h3.addPower(p3);
        
        SuperHero h4 = new FlyingDutchMan(225, "Shirai");
        h4.addPower(p3);
        h4.addPower(p2);
        
        SuperHero h5 = new ManRay(0, "Gennichiro");
        h5.addPower(p2);
        h5.addPower(p1);
        
        list.add(h1);
        list.add(h2);
        list.add(h3);
        list.add(h4);
        list.add(h5);
        
        Collections.sort(list);
        
        for(SuperHero hero : list){
            System.out.println("=======================================");
            hero.identity();
            hero.showPowers();
            System.out.println("=======================================");
        }

        



        /*
        System.out.println("It's " + super.getName() + ", the ManRay!" 
        + "It has the power level of " + super.getPowerLevel());
        System.out.println(".....HEED ME.....");
        System.out.println("FOR MY NAAAAAAAME IS " + ((super.getName()).toUpperCase()));
        */





    }
}
