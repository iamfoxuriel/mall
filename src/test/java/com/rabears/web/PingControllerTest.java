package com.rabears.web;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PingControllerTest {

    PingController controller;

    @Before
    public void setup() {
        controller = new PingController();
    }


    @Test
    public void ping() {
        Assert.assertEquals("It works!", controller.ping());
    }
}