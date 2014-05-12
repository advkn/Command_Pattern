
package source;

/**
 *
 * @author andre
 * 
 * Concrete Command for turning on the AirConditoner
 */
public class StartCommand implements Command {
    
    private AirConditioner theAirConditioner;
    
    public StartCommand(AirConditioner airConditoner) {
        this.theAirConditioner = airConditoner;
    }
    
    public void execute() {
        theAirConditioner.start();
    }
}
