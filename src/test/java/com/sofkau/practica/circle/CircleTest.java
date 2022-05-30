package com.sofkau.practica.circle;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CircleTest extends TestCase {
    @Test
    public void test_area_result(){
        Assert.assertEquals(Math.PI,Circle.calculateArea(1),0);
    }

}