import model.CounterModel;
import view.CounterView;
import service.CounterController;
import javax.swing.SwingUtilities;

/**
 * Main class - Entry point of the application
 * 
 * Key Swing Concept:
 * - SwingUtilities.invokeLater(): Ensures Swing components are created on the
 *   Event Dispatch Thread (EDT). This is required for thread safety in Swing.
 *   All GUI operations must happen on the EDT.
 */
public class Main {
    public static void main(String[] args) {
        // Swing applications must run on the Event Dispatch Thread (EDT)
        // invokeLater schedules the code to run on the EDT
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
    /**
     * Creates and displays the GUI following MVC pattern:
     * 1. Create the Model (data)
     * 2. Create the View (UI)
     * 3. Create the Controller (connects Model and View)
     * 4. Make the View visible
     */
    private static void createAndShowGUI() {
        // Step 1: Create the Model - holds our application data
        CounterModel model = new CounterModel();
        
        // Step 2: Create the View - the user interface
        CounterView view = new CounterView();
        
        // Step 3: Create the Controller - connects Model and View
        // The controller sets up event listeners and coordinates everything
        CounterController controller = new CounterController(model, view);
        
        // Step 4: Make the view visible
        view.setVisible(true);
    }
}
