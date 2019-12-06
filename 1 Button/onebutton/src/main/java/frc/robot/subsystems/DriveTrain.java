/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap.CANSparkMaxID;

/**
 * Add your docs here.
 *
 * @param
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

 // Creates a sparkMax motor object.
  public static CANSparkMax MiddleWheelSparkMax = new CANSparkMax(CANSparkMaxID.kMotor1.id, MotorType.kBrushless);



  @Override
  public void initDefaultCommand() {
    // This makes it so the DriveTrain class runs the Drive command on Default.
      setDefaultCommand(new Drive(this));

    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());




  }

}
