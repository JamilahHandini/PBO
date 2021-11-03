
public class Rectangle extends Shape {
    
    private double width;
    private double length;

// Constructors (overloaded)
/** Constructs a Rectangle instance with default value for width and length */
public Rectangle() { // 1st (default) constructor
width=1.0;
length=1.0;
}
/** Constructs a Circle instance with the given radius*/
public Rectangle(double w, double l) { // 2nd constructor
width=w;
length=l;
}
/** Constructs a Circle instance with the given radius, filled and default color */
public Rectangle(double w, double l,boolean filled, String color) { // 3nd constructor
super(filled,color);
width=w;
length=l;
}

public void setWidth(double width){
    this.width=width;
}
public double getWidth(){
    return width;
}
public void setLength(double length){
    this.length=length;
}
public double getLength(){
    return length;
}

public double getArea(){
    return width*length;
}

public double getPerimeter(){
    return 2*(width*length);
}
@Override
public String toString() { 
return "A Rectangle with width= " + width+ " and length= " + length + " which is a subclass of " + super.toString();
}

}
