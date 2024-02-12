import abstrac.Shape;
import clases.Circle;
import clases.RectangleExtend;

public class ShapeRunner {
    public static void main(String[] args) {
        Shape[] shapes = {new RectangleExtend("Rectangle",5,10)
                , new Circle("Circle",5)};
        for(Shape shape : shapes){
            shape.displayInfo();
        }
    }
}
