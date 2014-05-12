
package source;

/**
 *
 * @author andre
 * 
 * Client class
 */
public class PressSwitch {
    
    public static void main(String[] args) {
        
        AirConditioner myAC = new AirConditioner();
        Command switchOn = new StartCommand(myAC);
        Command switchOff = new StopCommand(myAC);
        
        Switch mySwitch = new Switch();
        
        try {
            if(args[0].equalsIgnoreCase("ON")) {
                mySwitch.storeAndExecute(switchOn);
                System.exit(0);
            }
            
            if(args[0].equalsIgnoreCase("OFF")) {
                mySwitch.storeAndExecute(switchOff);
                System.exit(0);
            }
            
            System.out.println("Argument \"ON\" or \"OFF\" is required.");
        }
        catch(Exception e) {
            System.out.println("Arguments required");
        }
        
        //Call the main() method from PressSwitch class
        String[] arguments = new String[] {"Off"};
        PressSwitch.main(arguments);
        
    }
    
}
