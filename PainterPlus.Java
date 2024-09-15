import org.code.neighborhood.*;

/**
 * The PainterPlus class extends the Painter class by adding 
 * additional utility methods such as turning, taking paint, and painting efficiently.
 */
public class PainterPlus extends Painter {

    /**
     * Turns the painter to the right by executing three left turns.
     */
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    /**
     * Collects all paint from the bucket when the painter is on a paint bucket.
     */
    public void takeAllPaint() {
        while (isOnBucket()) {
            takePaint();
        }
    }

    /**
     * Moves the painter forward until it can no longer move (to the edge of the grid).
     */
    public void moveFast() {
        while (canMove()) {
            move();
        }
    }

    /**
     * Paints in a straight line until the painter runs out of paint.
     * The painter moves forward and paints the grid white until empty.
     */
    public void paintToEmpty() {
        while (hasPaint()) {
            paint("white");  // Paints the current spot white
            if (canMove()) {  // Moves forward if there's space
                move();
            }
        }
    }
}
