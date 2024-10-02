import java.util.Scanner;

/**
 * Class to request data from user
 * <br><br>
 * Use request() to prompt user for information in console<br>
 * Use getLastProvided() to retrieve information last provided by user<br>
 * Use isDone() to check if user has terminated requests<br>
 * 
 * @author Kevin Carr
 * @version 1.0.0
 * @since CSC6301 Week 4
 */
public class ConsoleDataRequester implements DataRequester{

    private Scanner scanner;
    private Integer lastProvided;
    private boolean done;

    /**
     * Creates a data requester
     */
    public ConsoleDataRequester() {
        this.scanner = new Scanner(System.in);
        this.lastProvided = null;
        this.done = false;
    }

    /**
     * Prompt user for input
     */
    public void request() {
        if (isDone()){
            return;
        }

        System.out.println("Enter an integer or type end to finish: ");

        if (scanner.hasNextInt()) {
            // add provided integer
            lastProvided = scanner.nextInt();
        } else {
            // check if end command provided set done if applicable
            String s = scanner.next();
            if (s.equals("end")) {
                done = true;
                scanner.close();
            } else {
                lastProvided = null;
            }
        }
    }

    /**
     * Retrieve last provided information from user <br>
     * If user has not been prompted, provided erroneous data, or has indicated they are done 
     * this will return null
     * @return Integer or null
     */
    public Integer getLastProvided() {
        if (done) {
            return null;
        } else {
            return this.lastProvided;
        }
    }

    /**
     * Check if user has specified they are done providing information
     * @return boolean <br> true if user has specified they are done else false
     */
    public boolean isDone() {
        return this.done;
    }
}
