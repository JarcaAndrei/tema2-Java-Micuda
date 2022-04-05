package com.pattern.facade;

public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void chooseCircle(){
        circle.objectPicker();
    }
    public void chooseRectangle(){
        rectangle.objectPicker();
    }
    public void chooseSquare(){
        square.objectPicker();
    }
}