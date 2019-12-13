package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.when;

public class SetStatisticsTestSuite {

    private static SetStatistics setStatistics = new SetStatistics();
    private Statistics statisticsMock;

    @Test
    public void postsEqualToZero() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        SetStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, setStatistics.calculateAverageCommentsPerPost(), 1.0);

    }
}
