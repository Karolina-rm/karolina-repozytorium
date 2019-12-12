package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(5);
        //When
        shapeCollector.addFigure(shape);
        //Then
        Assert.assertEquals(1, shapeCollector.getFigures().size());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(2)
        //When
        shapeCollector.addFigure(shape);
        boolean result = shapeCollector.removeFigure(shape);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getFigure().size());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Triangle(2.5, 3.5);
        //When
        shapeCollector.addFigure(shape);
        Shape result = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(shape, result);

    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(8);
        //When
        shapeCollector.addFigure(shape);
        ArrayList<Shape> newList = new ArrayList<Shape>();
        newList.add(shape);
        //Then
        Assert.assertEquals(newList.toString(), shapeCollector.toString());


    }





}
