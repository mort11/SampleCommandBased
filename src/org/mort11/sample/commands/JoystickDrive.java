package org.mort11.sample.commands;

import org.mort11.sample.OI;
import org.mort11.sample.Robot;
import org.mort11.sample.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class JoystickDrive extends Command {
	
	private DriveTrain driveTrain = Robot.driveTrain;
	private OI oi  = Robot.oi;
	
    public JoystickDrive() {
    	requires(driveTrain);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	driveTrain.setLeft(oi.getLeftY());
    	driveTrain.setRight(oi.getRightY());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
