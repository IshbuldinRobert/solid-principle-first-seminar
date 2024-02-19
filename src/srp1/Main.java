package srp1;

import srp1.draw.*;
import srp1.figure.*;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        System.out.printf("Square area: %d \n", square.getArea());
        Drawer sd = new SquareDrawer();
        sd.draw(square.getSide());
        // System.out.println(square.getPoints());
    }
}
