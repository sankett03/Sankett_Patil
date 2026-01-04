/*
Program: Demonstration of 2D Shapes on Frame
MCA Student
*/

// For Graphics
import java.awt.Color;
import java.awt.Graphics;

// For JFrame
import javax.swing.JFrame;

// Main class extending JFrame
public class ShapesOnFrame extends JFrame {

    // Constructor to set up the frame
    ShapesOnFrame() {
        setTitle("2D Shapes Demo");   // Title of frame
        setSize(500, 400);            // Width x Height
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);             // Make frame visible
    }

    // Override paint() method to draw shapes
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Set drawing color
        g.setColor(Color.BLUE);

        // Draw Line
        g.drawLine(50, 80, 200, 80);

        // Draw Rectangle
        g.setColor(Color.RED);
        g.drawRect(50, 100, 150, 80);

        // Draw Filled Rectangle
        g.setColor(Color.ORANGE);
        g.fillRect(220, 100, 150, 80);

        // Draw Oval (Circle-like)
        g.setColor(Color.BLACK);
        g.drawOval(50, 200, 100, 100);

        // Draw Filled Oval
        g.setColor(Color.MAGENTA);
        g.fillOval(200, 200, 100, 100);

        // Draw Round Rectangle
        g.setColor(Color.CYAN);
        g.drawRoundRect(320, 200, 120, 80, 30, 30);
    }

    // Main method
    public static void main(String[] args) {
        new ShapesOnFrame();  // Create frame object
    }
}