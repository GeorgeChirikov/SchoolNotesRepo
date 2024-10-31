package org.example;

public class CornerPrinterVisitor implements ShapeVisitor {
    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Rectangle");
    }

    @Override
    public void visit(Line line) {
        System.out.println("Line");
    }

    @Override
    public void visit(Triangle triangle) {
        System.out.println("Triangle");
    }
}
