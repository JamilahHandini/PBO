
public class Shape {
    
    private String color;
    private boolean filled;

// Constructors (overloaded)
/** Constructs a Shape instance with default value for filled and color */
public Shape() { // 1st (default) constructor
color = "green";
filled=true;
}
/** Constructs a Shape instance with the given filled and default color */
public Shape(boolean f, String c) { // 2nd constructor
color = c;
filled=f;
}

public void setColor(String color){
    this.color=color;
}
public String getColor(){
    return color;
}
public boolean isFilled(){
    return filled;
}
public void setFilled(boolean filled){
    this.filled=filled;
}

public String toString() {
    if(filled==true){
        return "A Shape with color of " + this.color + " and filled";
    }else{
        return "A Shape with color of " + this.color + " and filled";
    }
  }

}
