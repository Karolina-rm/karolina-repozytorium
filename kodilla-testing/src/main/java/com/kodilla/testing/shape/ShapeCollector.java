package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {


    private ArrayList<Shape> figures = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        return figures.add(shape);

    }

    public boolean removeFigure(Shape shape) {
        return figures.remove(shape);
    }

    public Shape getFigure(int n) {
        //nie wiem jak ?
        return figures.get(n);
    }

    public void showFigure(){
        System.out.println(figures.toString());
    }

}
