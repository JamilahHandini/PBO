
package oop;
public class ConvertDataType {
    static short methodeOne(long l){
        int i = (int) l;
        System.out.println("Int "+i);
        return (short) i;
    }
    public static void main(String[] args){
        double d = 10.25;
        System.out.println("Double "+d);
        float f = (float) d;
        System.out.println("Float "+f);
        byte b = (byte) methodeOne((long) f);
        System.out.println(b);
    }
}
