import java.util.LinkedList;

/**
 * Class to store integers
 * 
 * @author Kevin Carr
 * @version 1.0.0
 * @since CSC6301 Week 4
 */
public class SimpleDataStore implements DataStore{

    private LinkedList<Integer> data;

    /**
     * Constructs an empty DataStore
     */
    public SimpleDataStore() {
        this.data = new LinkedList<Integer>();
    }

    /**
     * Add data to the DataStore
     * @param n integer to add
     */
    public void add(int n) {
        this.data.add(n);
    }

    /**
     * Orders data from smallest to largest
     */
    public void sort() {
        this.data.sort(null);
    }

    /**
     * Provides data as a linked list
     * 
     * @return a Linked List of Integers
     */
    public LinkedList<Integer> get_data() {
        return this.data;
    }
    
}
