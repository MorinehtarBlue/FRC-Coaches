package org.usfirst.frc.team1518.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

//Base configuration for Mechanum drive configuration using four independent motors
//PWM for TalonSRX controllers used - See MechDrvCAN.java for CAN bus configuration

public class MechanumDrive extends Subsystem{
    private final TalonSRX rearLeftDrive = new TalonSRX(0);
    private final TalonSRX rearRightDrive = new TalonSRX(1);
    private final TalonSRX frontLeftDrive = new TalonSRX(2);
    private final TalonSRX frontRightDrive = new TalonSRX(3);
    public static RobotDrive drive;       

	public MechanumDrive() {
		// TODO Auto-generated constructor stub
    	drive = new RobotDrive(frontLeftDrive, rearLeftDrive, frontRightDrive, rearRightDrive);
	}
    public void drive(Joystick mainStick) {
    	drive.mecanumDrive_Cartesian(mainStick.getX(), mainStick.getY(), mainStick.getZ(), 0);

    }

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
