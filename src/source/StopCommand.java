
package source;

/**
 *
 * @author andre
 * 
 * Concrete Command for turning OFF the AirConditoner
 */
public class StopCommand implements Command {
    
    private AirConditioner theAirConditioner;
    
    public StopCommand(AirConditioner airConditoner) {
        this.theAirConditioner = airConditoner;
    }
    
    public void execute() {
        theAirConditioner.stop();
    }
}
