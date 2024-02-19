package lsp1;

import lsp1.shape.Rectangle;
import lsp1.shape.Shape;
import lsp1.shape.Square;
import lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        square.setSide(4);
        System.out.printf("In a square side: %s\n", square.getSide());
        ShapeView view = new ShapeView(square);
        view.showArea();
    }
}
