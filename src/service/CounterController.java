package service;

import model.CounterModel;
import view.CounterView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * CONTROLLER - This class coordinates between the Model and View.
 * 
 * In MVC pattern:
 * - Controller handles user input from the View
 * - Controller updates the Model based on user actions
 * - Controller updates the View to reflect changes in the Model
 * - Controller contains the "glue" logic that connects Model and View
 * 
 * Key Concepts:
 * - ActionListener: Interface for handling button clicks and other actions
 * - Event-driven programming: Code runs in response to user events (clicks, etc.)
 */
public class CounterController {
    private CounterModel model;  // Reference to the Model
    private CounterView view;    // Reference to the View
    
    /**
     * Constructor - sets up the controller and connects Model and View
     * 
     * @param model the data model
     * @param view the user interface
     */
    public CounterController(CounterModel model, CounterView view) {
        this.model = model;
        this.view = view;
        
        // Set up event listeners - this connects user actions to our code
        setupEventListeners();
        
        // Initialize the view with the current model state
        updateView();
    }
    
    /**
     * Sets up action listeners for all buttons.
     * When a button is clicked, the corresponding actionPerformed method is called.
     */
    private void setupEventListeners() {
        // Increment button listener
        view.getIncrementButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // When increment button is clicked:
                model.increment();  // 1. Update the model
                updateView();       // 2. Update the view to show the change
            }
        });
        
        // Decrement button listener
        view.getDecrementButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // When decrement button is clicked:
                model.decrement();  // 1. Update the model
                updateView();       // 2. Update the view to show the change
            }
        });
        
        // Reset button listener
        view.getResetButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // When reset button is clicked:
                model.reset();      // 1. Update the model
                updateView();       // 2. Update the view to show the change
            }
        });
    }
    
    /**
     * Updates the view to reflect the current state of the model.
     * This is called whenever the model changes.
     */
    private void updateView() {
        int currentCount = model.getCount();
        view.updateCountDisplay(currentCount);
    }
}

