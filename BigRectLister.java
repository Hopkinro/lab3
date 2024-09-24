import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectLister {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        // Add rectangles with varying perimeters
        rectangles.add(new Rectangle(1, 1)); // Perimeter = 8
        rectangles.add(new Rectangle(2, 2)); // Perimeter = 8
        rectangles.add(new Rectangle(3, 5)); // Perimeter = 16
        rectangles.add(new Rectangle(4, 3)); // Perimeter = 14
        rectangles.add(new Rectangle(1, 5)); // Perimeter = 12
        rectangles.add(new Rectangle(0, 0)); // Perimeter = 0
        rectangles.add(new Rectangle(5, 5)); // Perimeter = 20
        rectangles.add(new Rectangle(2, 1)); // Perimeter = 6
        rectangles.add(new Rectangle(3, 3)); // Perimeter = 12
        rectangles.add(new Rectangle(1, 4)); // Perimeter = 10

        BigRectangleFillter filter = new BigRectangleFillter();

        System.out.println("Rectangles with perimeter > 10:");
        for (Rectangle rect : rectangles) {
            if (filter.accept(rect)) {
                System.out.println("Rectangle: " + rect + " | Perimeter: " + (2 * (rect.width + rect.height)));
            }
        }
    }
}
