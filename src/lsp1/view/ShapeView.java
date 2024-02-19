package lsp1.view;

import lsp1.shape.Rectangle;
import lsp1.shape.Shape;

public class ShapeView {
    private final Shape shape;

    public ShapeView(Shape shape) {
        this.shape = shape;
    }

    public void showArea() {
        System.out.printf("Area of shape equal: %s\n", shape.getArea());
    }
}
