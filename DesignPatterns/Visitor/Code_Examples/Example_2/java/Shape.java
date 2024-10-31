package org.example;

public interface Shape {
    void accept(ShapeVisitor visitor);
    String getName();
}
