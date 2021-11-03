public class Circle extends Shape {
    
        private double radius;

// Constructors (overloaded)
/** Constructs a Circle instance with default value for radius */
public Circle() { // 1st (default) constructor
radius=1.0;
}
/** Constructs a Circle instance with the given radius*/
public Circle(double rd) { // 2nd constructor
radius=rd;
}
/** Constructs a Circle instance with the given radius, filled and default color */
public Circle(double r,boolean filled, String color) { // 3nd constructor
super(filled,color);
radius=r;
}
public void setRadius(double radius){
    this.radius=radius;
}
public double getRadius(){
    return radius;
}
public double getArea(){
    return radius*radius*Math.PI;
}
public double getPerimeter(){
    return 2*radius*Math.PI;
}
@Override
public String toString() { 
return "A Circle with radius= " +radius+ " which is a subclass of " + super.toString();
}

}
