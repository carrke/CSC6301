/**
 * Abstract class for application execution. Application should repeatedly ask user for integer information 
 * and print out a sorted list of that information when completed.
 * <br><br>
 * run(): Run the application
 * 
 * @author Kevin Carr
 * @version 1.0.0
 * @since CSC6301 Week 4
 */
public abstract class App {

    protected DataStore dataStore;
    protected DataRequester dataRequester;
    /**
     * Method to run application once prepared, should be implemented by concrete subclasses
     */
    public abstract void run();
}
