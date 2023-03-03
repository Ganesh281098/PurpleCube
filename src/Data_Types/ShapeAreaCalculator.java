package Data_Types;

public class ShapeAreaCalculator {
    
    
    public double calculateArea(double length, double width) {
        return length * width;
    }
    
    
    public double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
    
   
    public double calculateArea(double base, double height, String shape) {
        if (shape.equals("triangle")) {
            return 0.5 * base * height;
        } else {
            throw new IllegalArgumentException("Invalid shape type");
        }
    }
    
}
