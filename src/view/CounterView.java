package view;

import javax.swing.*;
import java.awt.*;

/**
 * VIEW - This class represents the user interface (UI) of our application.
 * 
 * In MVC pattern:
 * - View displays data from the Model to the user
 * - View contains all the Swing GUI components (buttons, labels, etc.)
 * - View doesn't contain business logic - it just displays and receives user input
 * - View can notify the Controller when user interacts (via action listeners)
 * 
 * Key Swing Concepts:
 * - JFrame: The main window container
 * - JPanel: A container for organizing components
 * - JLabel: Displays text/images
 * - JButton: A clickable button
 * - Layout Managers: Control how components are arranged (FlowLayout, BorderLayout, etc.)
 * - Event Listeners: Handle user interactions (ActionListener for button clicks)
 */
public class CounterView extends JFrame {
    // Swing Components - these are the UI elements
    private JLabel countLabel;        // Displays the current count
    private JButton incrementButton;  // Button to increase count
    private JButton decrementButton;  // Button to decrease count
    private JButton resetButton;      // Button to reset count
    
    /**
     * Constructor - sets up the GUI
     */
    public CounterView() {
        // Set up the main window
        setTitle("Counter Application - MVC Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null); // Centers the window on screen
        
        // Create the main panel to hold our components
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout()); // BorderLayout divides space into 5 regions
        
        // Create a panel for the count display (center)
        JPanel displayPanel = new JPanel();
        displayPanel.setLayout(new FlowLayout());
        countLabel = new JLabel("Count: 0");
        countLabel.setFont(new Font("Arial", Font.BOLD, 24)); // Make it big and bold
        displayPanel.add(countLabel);
        
        // Create a panel for the buttons (bottom)
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout()); // FlowLayout arranges components in a row
        
        // Create and add buttons
        incrementButton = new JButton("Increment (+)");
        decrementButton = new JButton("Decrement (-)");
        resetButton = new JButton("Reset");
        
        buttonPanel.add(incrementButton);
        buttonPanel.add(decrementButton);
        buttonPanel.add(resetButton);
        
        // Add panels to the main panel
        mainPanel.add(displayPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        
        // Add main panel to the frame
        add(mainPanel);
    }
    
    /**
     * Updates the count display in the view
     * This method is called by the controller when the model changes
     * 
     * @param count the new count value to display
     */
    public void updateCountDisplay(int count) {
        countLabel.setText("Count: " + count);
    }
    
    // Getter methods for buttons - Controller needs these to add action listeners
    public JButton getIncrementButton() {
        return incrementButton;
    }
    
    public JButton getDecrementButton() {
        return decrementButton;
    }
    
    public JButton getResetButton() {
        return resetButton;
    }
}

