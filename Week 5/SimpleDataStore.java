import java.lang.Integer;
import java.util.Stack;

/**
 * Class to store integers
 * 
 * @author Kevin Carr
 * @version 1.0.0
 * @since CSC6301 Week 5
 */
public class SimpleDataStore implements DataStore{

    private Stack<Integer> data;

    /**
     * Constructs an empty DataStore
     */
    public SimpleDataStore() {
        this.data = new Stack<Integer>();
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
     * Provides data as a Stack
     * 
     * @return Stack of Integers
     */
    public Stack<Integer> get_data() {
        return this.data;
    }
    
}
