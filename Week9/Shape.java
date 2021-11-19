
package Week9;

abstract public class Shape {
    
    String shapeName;
    
    public Shape(String s){
        shapeName = s;
    }
    
    abstract double area();
    
    public String toString(){
        return shapeName;
    }
}
