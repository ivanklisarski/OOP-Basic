package Polymorphism.Shapes;



public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {

        this.setRadius(radius);
       this.calculateArea();
       this.calculatePerimeter();
    }

    public final double getRadius() {
        return radius;
    }

    private void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    protected void calculatePerimeter() {
          setPerimeter(2*(Math.PI*radius));
    }

    @Override
    protected void calculateArea() {
               setArea(Math.PI*radius*radius);
    }
}
