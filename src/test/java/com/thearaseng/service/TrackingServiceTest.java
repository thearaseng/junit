package com.thearaseng.service;

import com.thearaseng.exception.InvalidGoalException;
import com.thearaseng.service.category.GoodTestCategory;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

@Category(GoodTestCategory.class)
public class TrackingServiceTest {

    private TrackingService trackingService;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }

    @Before
    public void setUp() {
        trackingService = new TrackingService();
    }

    @Test
    public void newTrackingServiceTotalIsZero() {

        assertEquals("Tracking Service Total should be 0", 0, trackingService.getTotal());

    }

    @Test
    public void addingProteinThenTotalIncreaseByThatAmount() {

        trackingService.addProtein(10);
        assertEquals("Total should be increased by 10", 10, trackingService.getTotal());

    }

    @Test(expected = InvalidGoalException.class)
    public void goalIsSetToLessThanZeroExceptionIsThrown() throws InvalidGoalException {
        trackingService.setGoal(-1);
    }

}
