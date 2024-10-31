package org.example;

public class AreaCalculatorVisitor implements ShapeVisitor {

    private double area;

    @Override
    public void visit(Rectangle rectangle) {
        area = rectangle.getWidth() * rectangle.getHeight();
    }

    @Override
    public void visit(Line line) {
        area = 0;
    }

    @Override
    public void visit(Triangle triangle) {
        double base = triangle.getBase();
        double height = triangle.getHeight();
        area = 0.5 * base * height;

    }

    public double getArea() {
        return area;
    }
}
