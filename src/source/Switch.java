
package source;

/**
 * @author andre
 * 
 * Invoker class: Switch
 */

import java.util.List;
import java.util.ArrayList;

public class Switch {
    
    private List<Command> commandHistory = new ArrayList<Command>();
    
    public Switch() {    
    }
    
    public void storeAndExecute(Command cmd) {
        this.commandHistory.add(cmd);   
        cmd.execute();
    }
    
}
