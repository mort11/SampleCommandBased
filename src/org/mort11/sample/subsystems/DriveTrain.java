package org.mort11.sample.subsystems;

import org.mort11.sample.RobotMap;
import org.mort11.sample.commands.JoystickDrive;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {

	public static final double DT_LEFT_FORWARD = 1;
	public static final double DT_RIGHT_FORWARD = 1;

	private SpeedController left;
	private SpeedController right;

	public DriveTrain(SpeedController left, SpeedController right) {
		this.left = left;
		this.right = right;
	}

	public DriveTrain() {
		this(RobotMap.dtLeft, RobotMap.dtRight);
	}

	public void setLeft(double speed) {
		left.set(DT_LEFT_FORWARD * speed);
	}

	public void setRight(double speed) {
		right.set(DT_RIGHT_FORWARD * speed);
	}

	public void initDefaultCommand() {
		setDefaultCommand(new JoystickDrive());
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
