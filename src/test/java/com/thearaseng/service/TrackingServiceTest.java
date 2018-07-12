package com.thearaseng.service;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrackingServiceTest {

    private TrackingService trackingService;

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass() {
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

}
