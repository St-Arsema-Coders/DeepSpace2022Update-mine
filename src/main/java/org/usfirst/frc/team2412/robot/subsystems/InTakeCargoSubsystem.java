package org.usfirst.frc.team2412.robot.subsystems;

import org.usfirst.frc.team2412.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class InTakeCargoSubsystem extends Subsystem{

	// RESEARCH TALONSRX CAPABILITIES AND EDUCATE THE TEAM
	private WPI_VictorSPX CargoMotor1 = RobotMap.cargoMotor1;
	@Override
	protected void initDefaultCommand() {
		//Ari is Awesome!`
		//Ari is actually going to program something
	
		
	}
	
	// CHANGE MOTOR SPEED TO CONSTANTS (DAN IS AWESOMER)
	public void InTakeCargo() {CargoMotor1.set(-0.5);}
	public void OutputCargo() {CargoMotor1.set(0.5);}
}
