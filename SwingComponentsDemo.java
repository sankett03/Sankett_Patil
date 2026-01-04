/*
 Program: Demonstration of various Swing components
 Author : MCA Student

 ***Explanation of Components***

JLabel → Displays text ("Enter your name:").

JTextField → Single-line input.

JButton → A button labeled "Submit".

JCheckBox → Multiple options (Java, Python).

JRadioButton + ButtonGroup → One option must be selected (Male, Female).

JComboBox → Drop-down menu (BCA, MCA, MBA, MSc).

JTextArea → Multi-line input.

JScrollPane → Adds scrollbars to text area.
*/

// Layout managers
import java.awt.FlowLayout;

// Import Swing classes
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingComponentsDemo extends JFrame {

    // Constructor
    SwingComponentsDemo() {
        // Set frame properties
        setTitle("Swing Components Demo");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());  // Simple layout manager

        // JLabel
        JLabel label = new JLabel("Enter your name:");

        // JTextField
        JTextField textField = new JTextField(15);

        // JButton
        JButton button = new JButton("Submit");

        // JCheckBox
        JCheckBox check1 = new JCheckBox("Java");
        JCheckBox check2 = new JCheckBox("Python");

        // JRadioButton + ButtonGroup
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        // JComboBox
        String courses[] = {"BCA", "MCA", "MBA", "MSc", "IMCA","BBA"};
        JComboBox<String> comboBox = new JComboBox<>(courses);

        // JTextArea
        JTextArea textArea = new JTextArea(5, 20);

        // JScrollPane for text area
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Add components to frame
        add(label);
        add(textField);
        add(button);
        add(new JLabel("Select Skills:"));
        add(check1);
        add(check2);
        add(new JLabel("Select Gender:"));
        add(male);
        add(female);
        add(new JLabel("Select Course:"));
        add(comboBox);
        add(new JLabel("Comments:"));
        add(scrollPane);

        setVisible(true);
    }

    // Main method
    public static void main(String[] args) {
        new SwingComponentsDemo(); // Create frame object
    }
}


