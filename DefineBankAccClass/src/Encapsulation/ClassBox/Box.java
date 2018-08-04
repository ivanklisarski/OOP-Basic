package Encapsulation.ClassBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
         setLength(length);
        setWidth(width);
         setHeight(height);
    }

    double surfaceArea(double length, double height, double width) {
        return 2 * (length * width) + 2 * (length * height) + 2 * (width * height);
    }

    double LatheralSurfaceArea() {
        return 2d * this.length * height + 2d * this.width * this.height;


    }

    double Volume(double length, double height, double width) {
        return length * width * height;
    }

    private void setLength(double length) {

        if(length <= 0){
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }

        this.length = length;
    }

    private void setWidth(double width) {
        if(width <= 0){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    private void setHeight(double height) {
        if(height <= 0){
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }
}
