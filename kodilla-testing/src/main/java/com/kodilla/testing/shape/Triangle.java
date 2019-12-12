package com.kodilla.testing.shape;

import java.util.Objects;

class Triangle implements Shape {

        private static String name = "Triangle";
        private double lengthA;
        private double lengthH;

        public Triangle(double lengthA, double lengthH) {
            this.lengthA = lengthA;
            this.lengthH = lengthH;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.lengthA, lengthA) == 0 &&
                Double.compare(triangle.lengthH, lengthH) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lengthA, lengthH);
    }

    public String getShapeName() {
        return name;
    }

    public double getField() {
        return (lengthA * lengthH)/2;
    }
}

