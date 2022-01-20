package buoi2;

import java.nio.channels.NonWritableChannelException;

public class ShapeMain {
    public static void main(String[] args) {
        Square square = new Square("NHAC XUAN REMIX");
        square.rotate();

        Circle circle = new Circle("CON YEN DUA THOI");
        circle.rotate();

        Triangle triangle = new Triangle("MUNG TET DEN");
        triangle.rotate();



    }
    
}
