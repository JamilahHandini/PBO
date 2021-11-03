
public class Test {
    public static void main (String[] args) {

Shape s1 = new Shape();
System.out.println("Shape:"
+"color: " + s1.getColor()
+ s1.toString());

Circle c1 = new Circle(10.0);
System.out.println("Circle:"
+ " radius=" + c1.getRadius()
+ " area=" + c1.getArea()
+ " Perimeter=" + c1.getPerimeter()
+ c1.toString());

Rectangle r1 = new Rectangle(4.0,3.0);
System.out.println("Rectangle:"
+ " width=" + r1.getWidth()
+ " length=" + r1.getLength()
+ " Area=" + r1.getArea()
+ " Perimeter=" + c1.getPerimeter()
+ r1.toString());

Square sq1 = new Square(4.0);
System.out.println("Square:"
+ " side=" + sq1.getSide()
+ " Area=" + r1.getArea()
+ " Perimeter=" + c1.getPerimeter()
+ sq1.toString());

}
}

