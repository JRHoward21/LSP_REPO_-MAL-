package org.howard.edu.lsp.finalexam.question3;

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Triangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}
