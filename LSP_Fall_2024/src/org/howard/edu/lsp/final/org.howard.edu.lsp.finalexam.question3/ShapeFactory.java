package org.howard.edu.lsp.finalexam.question3;

class ShapeFactory {
    private static ShapeFactory instance;

    private ShapeFactory() {
        // Private constructor to enforce singleton
    }

    public static ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }

    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("triangle")) {
            return new Triangle();
        }
        return null; // Return null for unsupported shape types
    }
}
