package clases;

import abstrac.Shape;

public class RectangleExtend extends Shape {
    private double length;
    private double width;
    public RectangleExtend(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }
    @Override
    public double calculateArea() {
        return length * width;
    }
}
