/*
 Program: Demonstration of Dialog Boxes and Menus
 Author : MCA Student
 
*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;  

public class DialogAndMenuDemo extends JFrame implements ActionListener {

    JMenuItem exitItem, aboutItem;

    // Constructor
    DialogAndMenuDemo() {
        setTitle("Dialog Box and Menu Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ---------- Menu Bar ----------
        JMenuBar menuBar = new JMenuBar();

        // File menu
        JMenu fileMenu = new JMenu("File");
        exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(this); // Add event
        fileMenu.add(exitItem);

        // Help menu
        JMenu helpMenu = new JMenu("Help");
        aboutItem = new JMenuItem("About");
        aboutItem.addActionListener(this); // Add event
        helpMenu.add(aboutItem);

        // Add menus to menu bar
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        // ---------- Dialog Boxes ----------
        // Message Dialog
        JOptionPane.showMessageDialog(this, "Welcome to Dialog & Menu Demo", "Message", JOptionPane.INFORMATION_MESSAGE);

        // Input Dialog
        String name = JOptionPane.showInputDialog(this, "Enter your name:");
        JOptionPane.showMessageDialog(this, "Hello, " + name + "!", "Greetings", JOptionPane.INFORMATION_MESSAGE);

        // Confirm Dialog
        int response = JOptionPane.showConfirmDialog(this, "Do you like Java?", "Question", JOptionPane.YES_NO_OPTION);
        if(response == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Great! Keep learning.", "Info", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No worries! Explore other languages.", "Info", JOptionPane.INFORMATION_MESSAGE);
        }

        setVisible(true);
    }

    // Handle menu item clicks
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == exitItem) {
            System.exit(0); // Close application
        }
        if(e.getSource() == aboutItem) {
            JOptionPane.showMessageDialog(this, "Dialog & Menu Demo\nAuthor: MCA Student", "About", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Main method
    public static void main(String[] args) {
        new DialogAndMenuDemo();
    }
}
