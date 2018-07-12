package com.thearaseng.service;

import com.thearaseng.service.category.BadTestCategory;
import com.thearaseng.service.category.GoodTestCategory;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;
public class HelloWorldTest {

    @Test
    @Category({
            GoodTestCategory.class,
            BadTestCategory.class
    })
    public void shouldSayHelloWorld() {
        assertEquals("Should say 'Hello World'", "Hello World", "Hello World");
    }

}
