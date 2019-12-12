package com.kodilla.testing.collection;

import java.util.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;


public class CollectionTestSuite {

    private static OddNumbersExterminator exterminator = new OddNumbersExterminator();

    @Before
    public void before() {
        System.out.println("Test Case: starting");
    }

    @After
    public void after() {
        System.out.println("Test Case: ending");
    }


    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        //When
        ArrayList<Integer> mainList = exterminator.exterminate(emptyList);
        //Then
        Assert.assertEquals(emptyList, mainList);


    }


    @Test
    public void testOddNumbersExterminatorNormalList() {

        ArrayList<Integer> normalList = new ArrayList<Integer>();
        normalList.add(2);
        normalList.add(4);
        normalList.add(6);
        normalList.add(1);
        normalList.add(3);
        normalList.add(5);

        ArrayList<Integer> evenList = new ArrayList<>();
        evenList.add(2);
        evenList.add(4);
        evenList.add(6);

        //When
        ArrayList<Integer> mainList = exterminator.exterminate(normalList);
        //Then
        Assert.assertEquals(evenList, mainList);

    }
}
