package javapoz20.patterns.composite;

public class CompositeSample {
    public static void main(String[] args) {
        Composite circle = new Circle();
        Composite square = new Square();
        Composite triangle = new Triangle();
//        circle.draw();
//        square.draw();
//        triangle.draw();
        Shape customShape = new Shape();
        customShape.add(circle);
        customShape.add(square);
//        customShape.draw();
        Shape biggerShape = new Shape();
        biggerShape.add(customShape);
        biggerShape.add(customShape);
        biggerShape.add(customShape);
        biggerShape.draw();

    }
}
