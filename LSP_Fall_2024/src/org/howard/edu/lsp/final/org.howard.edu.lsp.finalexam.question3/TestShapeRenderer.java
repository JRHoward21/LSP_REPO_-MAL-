package org.howard.edu.lsp.finalexam.question3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestShapeRenderer {

    @Test
    void testCircle() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.getShape("circle");
        assertNotNull(shape);
        assertTrue(shape instanceof Circle);
    }

    @Test
    void testRectangle() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.getShape("rectangle");
        assertNotNull(shape);
        assertTrue(shape instanceof Rectangle);
    }

    @Test
    void testTriangle() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.getShape("triangle");
        assertNotNull(shape);
        assertTrue(shape instanceof Triangle);
    }

    @Test
    void testUnknownShape() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.getShape("hexagon");
        assertNull(shape);
    }

    @Test
    void testSingletonInstance() {
        ShapeFactory factory1 = ShapeFactory.getInstance();
        ShapeFactory factory2 = ShapeFactory.getInstance();
        assertSame(factory1, factory2); // Both references should point to the same instance
    }
}
