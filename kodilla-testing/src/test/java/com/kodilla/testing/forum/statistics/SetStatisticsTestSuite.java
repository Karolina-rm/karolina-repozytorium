package com.kodilla.testing.forum.statistics;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SetStatisticsTestSuite {

    private SetStatistics setStatistics;
    private Statistics statisticsMock;

    @Before
    public void beforeCheck() {
        statisticsMock = mock(Statistics.class);
        ArrayList<String> listOfUsers = new ArrayList<String>();

        when(statisticsMock.postsCount()).thenReturn(3);
        when(statisticsMock.commentsCount()).thenReturn(3);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
    }

    @Test
    public void testPostsEqualToZero() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        SetStatistics setStatistics = new SetStatistics();
        setStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, setStatistics.getQuantityOfUsers(), 1.0);

    }
}
