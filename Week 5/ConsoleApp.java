
/**
 * Class to execute process to request information from user, sort it, and provide output
 * 
 * @author Kevin Carr
 * @version 1.0.0
 * @since CSC6301 Week 4
 */
public class ConsoleApp extends App{

    /**
     * Constructor to prepare app for execution using a default SimpleDataStore
     */
    public ConsoleApp() {
        this.dataStore = new SimpleDataStore();
        this.dataRequester = new ConsoleDataRequester();
    }

    /**
     * Constructor to prepare app for execution using a custom/specific DataStore
     * 
     * @param dataStore specific DataStore implementation to utilize
     */
    public ConsoleApp(DataStore dataStore) {
        this.dataStore = dataStore;
        this.dataRequester = new ConsoleDataRequester();
    }

    /**
     * Run the application
     */
    public void run() {
        // Entry message
        System.out.println();
        System.out.println("This program sorts provided numbers");
        
        Integer n;

        // repeatedly ask user for input
        while (!dataRequester.isDone()) {
            dataRequester.request();
            n = dataRequester.getLastProvided();
            if (n != null) {
                dataStore.add(n);
            }
        }

        // print provided data
        System.out.println();
        System.out.println("Provided data: " + dataStore.get_data());
        
        // sort list
        System.out.println("Sorting data...");
        dataStore.sort();

        // print sorted list
        System.out.println("Sorted data: " + dataStore.get_data());

        // Exit program
        System.out.println();
        System.out.println("Goodbye");
    }
    
}
