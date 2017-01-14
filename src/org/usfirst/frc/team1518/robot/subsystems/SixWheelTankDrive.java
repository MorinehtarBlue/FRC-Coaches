package org.usfirst.frc.team1518.robot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

//Base definition for a six wheel tank drive using four motors
//PWM used for TalonSRX motor controllers
//See SixWheelCAN.java for CAN bus configuration

public class SixWheelTankDrive extends Subsystem {
	
    private final TalonSRX rearLeftDrive = new TalonSRX(0);
    private final TalonSRX rearRightDrive = new TalonSRX(1);
    private final TalonSRX frontLeftDrive = new TalonSRX(2);
    private final TalonSRX frontRightDrive = new TalonSRX(3);
    public static RobotDrive drive;       


	public SixWheelTankDrive() {
		// TODO Auto-generated constructor stub
    	super();
    	drive = new RobotDrive(frontLeftDrive, rearLeftDrive, frontRightDrive, rearRightDrive);

	}
    public void drive(double leftJoystick, double rightJoystick) {
    	drive.tankDrive(leftJoystick, rightJoystick);
    }

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
        // setDefaultCommand(new Drive());

	}

}
