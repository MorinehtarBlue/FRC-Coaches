package org.usfirst.frc.team1518.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team1518.robot.commands.ExampleCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
    public JoystickButton y;
    public JoystickButton b;
    public JoystickButton a;
    public JoystickButton lb;  // JDH - remapped buttons 2/4/16
    public JoystickButton rb;  // JDH - remapped buttons 2/4/16
    public Joystick gamepad;
    public JoystickButton trigger;
    public JoystickButton reverse;
    public Joystick leftJoystick;
    public Joystick rightJoystick;
    
    
    public OI() {

        rightJoystick = new Joystick(1);
        
        leftJoystick = new Joystick(0);
        
        trigger = new JoystickButton(leftJoystick, 1);
        // trigger.whileHeld(new Acquire());  // JDH - remapped buttons 2/4/16
        gamepad = new Joystick(2);
        
        a = new JoystickButton(gamepad, 1);
        //a.whileHeld(new LaunchLow());
        // a.whileHeld(new LiftFangs());  // JDH - remapped buttons 2/4/16
        b = new JoystickButton(gamepad, 2);
        // b.whileHeld(new LaunchLow());  // JDH - remapped buttons 2/4/16
        y = new JoystickButton(gamepad, 4);
        //y.whileHeld(new LaunchHigh());
        lb = new JoystickButton(gamepad, 5);  // JDH - remapped buttons 2/4/16
        //lb.whileHeld(new LiftFangs());
        rb = new JoystickButton(gamepad, 6);  // JDH - remapped buttons 2/4/16
        //rb.whileHeld(new Acquire());
        
    }
    
    public Joystick getGamepad() {
        return gamepad;
    }

    public Joystick getLeftJoystick() {
        return leftJoystick;
    }

    public Joystick getRightJoystick() {
        return rightJoystick;
    }

}
