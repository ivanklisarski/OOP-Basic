package Polymorphism.Shapes;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(Double height, Double width) {
        this.setHeight(height); this.setWidth(width);
        this.calculatePerimeter(); this.calculateArea(); }

    public double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    private void setWidth(double width) {
        this.width = width;
    }

    @Override
    protected void calculatePerimeter() {
        setPerimeter(this.height * 2 + this.width * 2);

}

    @Override
    protected void calculateArea() {
        setArea(this.height * this.width);
    }
}
