/*
 Program: Demonstration of Event Handling
 Author : MCA Student
*/

import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  

public class EventHandlingDemo extends JFrame implements ActionListener, KeyListener, MouseListener, WindowListener {

    JButton button;

    // Constructor
    EventHandlingDemo() {
        setTitle("Event Handling Demo");
        setSize(500, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ---------- Button (ActionEvent) ----------
        button = new JButton("Click Me");
        button.addActionListener(this);  // Register ActionListener
        add(button);

        // ---------- TextField (KeyEvent) ----------
        JTextField textField = new JTextField(20);
        textField.addKeyListener(this);  // Register KeyListener
        add(new JLabel("Type something:"));
        add(textField);

        // ---------- Panel (MouseEvent) ----------
        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setPreferredSize(new Dimension(200, 100));
        panel.addMouseListener(this);    // Register MouseListener
        add(new JLabel("Click inside panel:"));
        add(panel);

        // ---------- WindowEvent ----------
        addWindowListener(this);         // Register WindowListener

        setVisible(true);
    }

    // --------- ActionEvent ---------
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            JOptionPane.showMessageDialog(this, "Button clicked!", "Action Event", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // --------- KeyEvent ---------
    public void keyTyped(KeyEvent e) {
        System.out.println("Key Typed: " + e.getKeyChar());
    }
    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed: " + e.getKeyChar());
    }
    public void keyReleased(KeyEvent e) {
        System.out.println("Key Released: " + e.getKeyChar());
    }

    // --------- MouseEvent ---------
    public void mouseClicked(MouseEvent e) {
        JOptionPane.showMessageDialog(this, "Mouse clicked at (" + e.getX() + "," + e.getY() + ")", "Mouse Event", JOptionPane.INFORMATION_MESSAGE);
    }
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    // --------- WindowEvent ---------
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }
    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");
    }
    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
    }
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}

    // Main method
    public static void main(String[] args) {
        new EventHandlingDemo();
    }
}
