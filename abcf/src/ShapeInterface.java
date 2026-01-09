interface Shape {
    public void getArea();
}

class Circle implements Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    public void getArea() {
        double pi = 3.14;
        System.out.println(Math.round(radius * pi * 10.0) / 10.0);
    }
}

class Rectangle implements Shape {
    double length;
    double breadth;
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public void getArea(){
        System.out.println(breadth * length);
    }
}

public class ShapeInterface {
    public static void main(String[] args) {
        Circle myCircleShape = new Circle(5);
        myCircleShape.getArea();
        Rectangle myRectangleShape = new Rectangle(3,5);
        myRectangleShape.getArea();
    }
}
