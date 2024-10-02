import java.util.LinkedList;

/**
 * Interface for integer data storage object <br><br>
 * add() to add int data to DataStore <br>
 * sort() to sort data from lowest to highest <br>
 * get_data() to provide data as a LinkedList
 * 
 * @author Kevin Carr
 * @version 1.0.0
 * @since CSC6301 Week 4
 */
public interface DataStore {
    /**
     * Add int/integer to DataStore
     * @param n int to add
     */
    public void add(int n);
    /**
     * Ensure stored data is sorted
     */
    public void sort();
    /**
     * Provide stored data to requester
     * @return a Linked List of Integers
     */
    public LinkedList<Integer> get_data();
}
