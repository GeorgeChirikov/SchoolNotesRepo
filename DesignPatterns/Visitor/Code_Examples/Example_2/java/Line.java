package org.example;

public class Line implements Shape {
    private final String name = "Line";

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }
}
