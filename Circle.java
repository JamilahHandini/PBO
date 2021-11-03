<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PBO;

/**
* The Circle class models a circle with a radius and color.
*/
public class Circle { // Save as "Circle.java"
// private instance variable, not accessible from outside this class
private double radius;
private String color; // ADDED: variable String color is already here


// Constructors (overloaded)
/** Constructs a Circle instance with default value for radius and color */
public Circle() { // 1st (default) constructor
radius = 1.0;
color = "red";
}
/** Constructs a Circle instance with the given radius and default color */
public Circle(double r) { // 2nd constructor
radius = r;
color = "red";
}

//ADDED
/** Constructs a Circle instance with the given radius and given color */
public Circle(double r,String c) { // 2nd constructor
radius = r;
color = c;
}

/** Returns the radius */
public double getRadius() {
return radius;
}

//ADED setter for Color
public void setColor(String color){
    this.color=color;
}

//ADED getter for Color
public String getColor(){
    return color;
}

/** Returns the area of this Circle instance */
public double getArea() {
return radius*radius*Math.PI;
}
/** Return a self-descriptive string of this instance in the form of
Circle[radius=?,color=?] */
public String toString() {
return "Circle[radius=" + radius + " color=" + color + "]";
}


}
=======
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
>>>>>>> 60aa0edac4d21191e8eeced8e6fbdcaa70efccc1
