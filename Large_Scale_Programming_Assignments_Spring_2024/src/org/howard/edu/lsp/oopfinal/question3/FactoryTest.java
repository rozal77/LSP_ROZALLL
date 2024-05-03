package org.howard.edu.lsp.oopfinal.question3;

import org.junit.Test;
import static org.junit.Assert.*;

public class FactoryTest {
    @Test
    public void testCreateCircle() {
        Shape circle = Factory.createShape("circle");
        assertNotNull(circle);
        assertTrue(circle instanceof Circle);
    }

    @Test
    public void testCreateRectangle() {
        Shape rectangle = Factory.createShape("rectangle");
        assertNotNull(rectangle);
        assertTrue(rectangle instanceof Rectangle);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidShapeType() {
        @SuppressWarnings("unused")
		Shape invalidShape = Factory.createShape("triangle");
    }
}
