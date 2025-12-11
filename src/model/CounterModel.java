package model;

/**
 * MODEL - This class represents the data/business logic of our application.
 * 
 * In MVC pattern:
 * - Model holds the application's data and business logic
 * - It doesn't know about the View or Controller
 * - It can notify observers when data changes (using listeners/observers)
 * 
 * This simple model just holds a counter value.
 */
public class CounterModel {
    private int count;
    
    /**
     * Constructor - initializes the counter to 0
     */
    public CounterModel() {
        this.count = 0;
    }
    
    /**
     * Gets the current count value
     * @return the current count
     */
    public int getCount() {
        return count;
    }
    
    /**
     * Increments the counter by 1
     */
    public void increment() {
        count++;
    }
    
    /**
     * Decrements the counter by 1
     */
    public void decrement() {
        count--;
    }
    
    /**
     * Resets the counter to 0
     */
    public void reset() {
        count = 0;
    }
    
    /**
     * Sets the count to a specific value
     * @param value the new count value
     */
    public void setCount(int value) {
        this.count = value;
    }
}

