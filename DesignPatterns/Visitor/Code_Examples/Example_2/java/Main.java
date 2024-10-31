package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(10, 20));
        shapes.add(new Line());
        shapes.add(new Triangle(10, 20));

        AreaCalculatorVisitor areaCalculatorVisitor = new AreaCalculatorVisitor();

        for (int i = 0; i < shapes.size(); i++) {
            shapes.get(i).accept(areaCalculatorVisitor);
            System.out.println(shapes.get(i).getName() + " area: " + areaCalculatorVisitor.getArea());

        }


    }
}