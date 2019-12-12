package com.kodilla.testing.shape;

import java.util.Objects;

class Square implements Shape {

    private static String name = "Square";
    private double lengthA;

    public Square(double lengthA) {
        this.lengthA = lengthA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.lengthA, lengthA) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lengthA);
    }

    public String getShapeName() {

        return name;
    }

    public double getField() {

        return Math.pow(lengthA, 2);
    }
}
