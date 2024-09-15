import org.code.neighborhood.*;

/**
 * The NeighborhoodRunner class runs the entire program to paint 
 * a background and a heart using the MuralPainter and HeartPainter classes.
 */
public class NeighborhoodRunner {
    public static void main(String[] args) {

        // Create an instance of MuralPainter to paint the black background
        MuralPainter backgroundPainter = new MuralPainter();
        backgroundPainter.paintBackground("black", 16); // Paints the background

        // Create an instance of HeartPainter to paint the red heart
        HeartPainter heartPainter = new HeartPainter();
        heartPainter.startPosition();  // Moves the painter to the starting position for the heart
        heartPainter.paintHeart("red");  // Paints a red heart
    }
}