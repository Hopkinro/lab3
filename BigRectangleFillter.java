import java.awt.Rectangle;

interface Fillter {
    boolean accept(Rectangle rect);
}

class BigRectangleFillter implements Fillter {
    @Override
    public boolean accept(Rectangle rect) {
        // Calculate perimeter and check if it's greater than 10
        return (rect.getWidth() + rect.getHeight()) * 2 > 10;
    }
}

