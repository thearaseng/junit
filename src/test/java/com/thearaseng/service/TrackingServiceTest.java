package com.thearaseng.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrackingServiceTest {

    @Test
    public void newTrackingServiceTotalIsZero() {

        TrackingService trackingService = new TrackingService();
        assertEquals("Tracking Service Total should be 0", 0, trackingService.getTotal());

    }

}
