import org.code.neighborhood.*;

/**
 * The MuralPainter class extends PainterPlus and provides methods to
 * paint a mural, including filling a background with color and painting straight lines.
 */
public class MuralPainter extends PainterPlus {

    /**
     * Paints the background of the mural by filling the grid with a specified color.
     * It paints in rows, switching directions as it reaches the end of each row.
     */
  
    public void paintBackground(String color, int size) {
        while (canMove("south")) {
            paintLine(color, size);  // Paints a line with the specified color and size
            turnToWest();  // Changes direction to move west

            if (canMove("south")) {
                paintLine(color, size);  // Paints another line if there is space to move south
                turnToEast();  // Changes direction to move east
            }
        }

        // Once the southern row is reached, finish the background
        paintLine(color, size);
        turnAround();
        moveToCorner();  // Moves the painter to the top-left corner
    }

    /**
     * Paints a single straight line of the given color for the specified number of spaces.
     *
     * @param color  The color to paint the line.
     * @param spaces The number of spaces to paint in a row.
     */
    public void paintLine(String color, int spaces) {
        setPaint(spaces);  // Sets the amount of paint for the line

        while (hasPaint()) {
            paint(color);  // Paints the current spot
            if (canMove()) {
                move();  // Moves forward if possible
            }
        }
    }

    /**
     * Turns the painter to the west and prepares it to paint in that direction.
     */
    public void turnToWest() {
        if (isFacingEast()) {
            turnRight();  // Turn to face west
            move();  // Move one step forward
            turnRight();  // Turn to face the correct direction
        }
    }

    /**
     * Turns the painter to the east and prepares it to paint in that direction.
     */
    public void turnToEast() {
        if (isFacingWest()) {
            turnLeft();  // Turn to face east
            move();  // Move one step forward
            turnLeft();  // Turn to face the correct direction
        }
    }

    /**
     * Turns the painter around 180 degrees.
     */
    public void turnAround() {
        turnLeft();
        turnLeft();
    }

    /**
     * Moves the painter to the corner of the grid (top-left position).
     */
    public void moveToCorner() {
        while (canMove()) {
            move();  // Moves to the edge of the grid
        }

        turnRight();  // Turns right to face north or west

        while (canMove()) {
            move();  // Moves along the edge
        }
    }
}
