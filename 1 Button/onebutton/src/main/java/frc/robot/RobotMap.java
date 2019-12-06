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
 *
 */
public class RobotMap
{
  //enumerates CANSparkMaxID's so we can use the motors in a driveTrain.
  public static enum CANSparkMaxID {
    kMotor1(1, "Motor1");

    public final int id;
    public final String name;

// Constructor for the CANSparkMaxID's.
    private CANSparkMaxID(int id, String name) {
      this.id = id;
      this.name = name;
    }
  }


public static final double driveValue = .9;;
// We set the driveValue as a constant so it doesn't change.

public static final double driveValueReset = 0;
// We set the driveValueReset as a constant so it doesn't change.







}
