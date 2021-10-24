package senyawahidrokarbon;
public class Senyawa {
    private String namaSenyawa;
    private String bentuk;
    private String sifat;
    private Unsur[] unsur = new Unsur[2];

    Senyawa(String nama, String bentuk, String sifat, Unsur uns1, Unsur uns2){
    this.unsur[0] = uns1;
    this.unsur[1] = uns2;
    
    this.namaSenyawa = nama;
    this.bentuk = bentuk;
    this.sifat = sifat;
    }
    
    public String getNamaSenyawa(){
        return namaSenyawa;
    }
    public String getBentuk(){
        return bentuk;
    }
    public String getSifat(){
        return sifat;
    }
    public void printSenyawa(){
        System.out.println("Nama Senyawa: "+this.namaSenyawa);
        System.out.println("Bentuk: "+this.bentuk);
        System.out.println("Sifat: "+this.sifat);
        System.out.println("Terbentuk dari unsur: "+unsur[0].getNamaUnsur()+" dan "+unsur[1].getNamaUnsur());
        System.out.println(" ");
    }

}
