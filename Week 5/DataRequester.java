/**
 * Interface for classes that request Integer inputs from user
 * <br><br>
 * request() should request data from user / caller<br>
 * getLastProvided() should return the last provided valid input from user<br>
 * isDone() should indicate if user has stopped input process
 * 
 * @author Kevin Carr
 * @version 1.0.0
 * @since CSC6301 Week 4
 */
public interface DataRequester {
    
    /**
     * Request data from user / caller
     */
    public void request();
    /**
     * Return the last valid input provided from user/caller
     * @return Integer
     */
    public Integer getLastProvided();
    /**
     * Indicate if user/caller has stopped input process
     * @return boolean
     */
    public boolean isDone();
}
