/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

/** 
* 
* @author 3197-Hexhounds 
*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
  WPI_TalonFX leftMotor1 = new WPI_TalonFX(2);
  WPI_TalonFX leftMotor2 = new WPI_TalonFX(3);
  WPI_TalonFX rightMotor1 = new WPI_TalonFX(0);
  WPI_TalonFX rightMotor2 = new WPI_TalonFX(1);

  SpeedControllerGroup leftMotor = new SpeedControllerGroup(leftMotor1, leftMotor2);
  SpeedControllerGroup rightMotor = new SpeedControllerGroup(rightMotor1, rightMotor2);

  DifferentialDrive drive = new DifferentialDrive(leftMotor, rightMotor);

  /**
   * Creates a new DriveTrain.
   */
  public DriveTrain() {
    leftMotor1.setSafetyEnabled(false);
    leftMotor2.setSafetyEnabled(false);
    rightMotor1.setSafetyEnabled(false);
    rightMotor2.setSafetyEnabled(false);
    leftMotor1.configOpenloopRamp(.05);
    leftMotor2.configOpenloopRamp(.05);
    rightMotor1.configOpenloopRamp(.05);
    rightMotor2.configOpenloopRamp(.05);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  /**
   * @param l
   * @param r
   */
  public void tankDrive(double l, double r) {
    drive.tankDrive(l, r);

  }
}
