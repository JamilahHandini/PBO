public class Square extends Rectangle{

// Constructors (overloaded)
/** Constructs a Square instance with default value for side */
public Square() { // 1st (default) constructor
    super();
}
/** Constructs a Square instance with the given side*/
public Square(double side) { // 2nd constructor
    super(side,side);
}
/** Constructs a Circle instance with the given radius, filled and default color */
public Square(double side,boolean filled, String color) { // 3nd constructor
    super(side,side,filled,color);
}


public void setSide(double side){
    super.setWidth(side);
    super.setLength(side);
}
public double getSide(){
    return super.getWidth();
}

@Override
public void setWidth(double side) {
super.setLength(side);
}

@Override
public void setLength(double side) {
super.setWidth(side);
}

@Override
public String toString() { 
return "A Square with side= " + super.getLength() + " which is a subclass of " + super.toString();
}
@Override
public double getArea(){
    return super.getLength()*super.getWidth();
}
@Override
public double getPerimeter(){
    return 4*super.getLength();
}

}
