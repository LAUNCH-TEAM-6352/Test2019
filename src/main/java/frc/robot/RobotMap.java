/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap
{
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;

	// The following deal with the Limelight vision processing camera:
	public static String limelightTableKey = "limelight-johnrk";
	public static String limelightXPositionKey = "tx";
	public static String limelightYPositionKey = "ty";
	public static String limelightAreaKey = "ta";
	public static String limelightCamModeKey = "camMode";
	public static String limelightLedModeKey = "ledMode";

	// The following deal with CAN devices:
	public static int testTalonSrxDeviceId = 9;

	// The following define Digital IO channels:
	public static int linearActuatorExtendLimitSwitchChannel = 9;
	public static int linearActuatorRetractLimitSwitchChannel = 8;
}
