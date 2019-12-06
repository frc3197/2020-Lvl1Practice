/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.subsystems.DriveTrain;

public class Drive extends Command {
  public Drive() {
// If someone tries to use the Drive command without a driveTrain it will stop them from using it.
requires(Robot.driveTrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {

    // When a true is stored in buttonDrive the motorValue is set to .9
      if((OI.buttonDrive()) == true)
      {
        DriveTrain.MiddleWheelSparkMax.set(RobotMap.driveValue);
      }
   // Else it will store a 0 effectively stopping it.
      else
        DriveTrain.MiddleWheelSparkMax.set(RobotMap.driveValueReset);
    }



  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    //When the code is turned off it will reset it to zero.
   DriveTrain.MiddleWheelSparkMax.set(0);

  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
