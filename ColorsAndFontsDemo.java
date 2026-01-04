/*
 Program: Demonstration of Colors and Fonts in Java
 Author : MCA Student
*/

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;  

// Main class extending JFrame
public class ColorsAndFontsDemo extends JFrame {

    // Constructor to set up the frame
    ColorsAndFontsDemo() {
        setTitle("Colors and Fonts Demo");   // Frame title
        setSize(500, 300);                   // Frame size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);                    // Show frame
    }

    // Override paint() method to draw text with colors and fonts
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Set Font and Color for first text
        g.setFont(new Font("Serif", Font.PLAIN, 20)); // Serif font, normal style, size 20
        g.setColor(Color.RED);                        // Red color
        g.drawString("This is RED in Serif (Plain)", 50, 100);

        // Second text with Bold
        g.setFont(new Font("SansSerif", Font.BOLD, 24)); // SansSerif, bold, size 24
        g.setColor(Color.BLUE);                          // Blue color
        g.drawString("This is BLUE in SansSerif (Bold)", 50, 150);

        // Third text with Italic
        g.setFont(new Font("Monospaced", Font.ITALIC, 22)); // Monospaced, italic
        g.setColor(Color.GREEN);                            // Green color
        g.drawString("This is GREEN in Monospaced (Italic)", 50, 200);

        // Fourth text with Bold + Italic
        g.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 26));
        g.setColor(Color.MAGENTA);  
        g.drawString("This is MAGENTA in Dialog (Bold+Italic)", 50, 250);
    }

    // Main method
    public static void main(String[] args) {
        new ColorsAndFontsDemo(); // Create frame object
    }
}
