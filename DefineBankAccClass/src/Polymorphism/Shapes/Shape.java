package Polymorphism.Shapes;

public abstract class Shape {
    private Double area;
    private Double perimeter;

    public Shape() {
    }

    protected void setArea(double area) {

        this.area = area;
    }

    protected void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public Double getArea() {
        return this.area;
    }

    public Double getPerimeter() {
        return this.perimeter;
    }
    protected abstract void calculatePerimeter();
    protected abstract void calculateArea();
}
