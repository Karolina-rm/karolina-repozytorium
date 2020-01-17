package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int numbers[]= {2,4,6,8,10,1,3,5,7,11};
        double expectedAverage = 5.7;
        //When
        double average = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(expectedAverage, average, 0.001);
    }
}
