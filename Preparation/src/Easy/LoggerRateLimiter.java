package Easy;
//359
import java.util.*;

public class LoggerRateLimiter {
private HashMap<String, Integer> messagePrintTime = new HashMap<String, Integer>();
    
    
    
    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
        If this method returns false, the message will not be printed.
        The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(messagePrintTime.containsKey(message)) {
            int time = messagePrintTime.get(message);
            //System.out.println(message + " " + time + " " + timestamp);
            if(timestamp - time >= 10) {
                messagePrintTime.put(message, timestamp);
                return true;
            } else {
                return false;
            }
        } else {
            messagePrintTime.put(message, timestamp);
            return true;
        }
    }
}
