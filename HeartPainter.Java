import org.code.neighborhood.*;

/**
 * The HeartPainter class is responsible for painting a heart design
 * on the mural using inherited methods from MuralPainter.
 */
public class HeartPainter extends MuralPainter {

    /**
     * Constructor for the HeartPainter class.
     * Inherits behavior from MuralPainter.
     */
    public HeartPainter() {
        // Inherit from MuralPainter
    }

    /**
     * Moves the painter to the starting position of where the heart will be drawn.
     * The starting position is near the center of the grid.
     */
    public void startPosition() {
        // Move to the approximate center of the grid
        move();
        move();  // Move down to center the heart vertically
        move();
        move();
        turnRight();
        move();  // Move right to center horizontally
        move();
        move();
        turnLeft();
    }

    /**
     * Paints the heart using a series of paintLine calls.
     * This method draws the heart starting from the top.
     *
     * The color of the heart is red.
     */
    public void paintHeart(String mainColor) {
        // First row of the heart (widest top part)
        paintLine(mainColor, 2);  // Tip of the heart
        move();
        move();  
        move();
        move();
        paintLine(mainColor, 2); 
        move();
        turnRight();
        move();
        move();
        paintLine(mainColor, 4); 
        turnRight();
        move();
        turnRight();
        paintLine(mainColor, 6);
        turnLeft();
        move();
        turnLeft();
        paintLine(mainColor, 8);
        turnRight();
        move();
        turnRight();
        paintLine(mainColor, 8);
        turnLeft();
        move();
        turnLeft();
        move(); 
        paintLine(mainColor, 9);
        turnRight();
        move();
        turnRight();  
        paintLine(mainColor, 9);
        turnLeft();
        move();
        turnLeft();    
        move(); 
        paintLine(mainColor, 9);
        turnRight();  
        move();
        turnRight();  
        move();
        move();
        paintLine(mainColor, 9);

        // Moving down for the lower half of the heart
        turnLeft();
        move();
        turnLeft();
        move(); 
        paintLine(mainColor, 8);
        turnRight();
        move();
        turnRight(); 
        move();
        move();
        paintLine(mainColor, 7);
        turnLeft();
        move();
        turnLeft();
        move();
        paintLine(mainColor, 6);
        turnRight();
        move();
        turnRight(); 
        move();
        move();
        paintLine(mainColor, 4);
        turnRight();
        move();
        move();
        turnRight();
        move();
        paintLine("LightSalmon", 3);
        turnLeft();
        move();
        turnLeft();
        move();
        move();
        paintLine("LightSalmon", 2);
    }
}
