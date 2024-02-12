package clases;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int area(){
        return length * width;
    }

    public int perimeter(){
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "clases.Rectangle{" +
                "length= " + length +
                ", width= " + width +
                ", area= " + area() +
                ", perimeter= " + perimeter() +
                '}';
    }
}
