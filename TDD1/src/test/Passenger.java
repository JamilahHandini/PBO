package test;

public class Passenger {
	private String name;
    private boolean vip;

    public Passenger(String name, boolean vip) {    //consrtuctor class passenger 
        this.name = name;                           //mengisi data nama dan status vip
        this.vip = vip;
    }
    
    public String getName() { //getter name
        return name;
    }

    public boolean isVip() { //getter vip
    return vip;
    }
}
