// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.commands.LowerShoot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

public class DriveTrain extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */

  private WPI_TalonFX rightFrontMotor = new WPI_TalonFX(Constants.DriveTrain.right_front);
  private WPI_TalonFX leftFrontMotor = new WPI_TalonFX(Constants.DriveTrain.left_front);
  private WPI_TalonFX rightBackMotor = new WPI_TalonFX(Constants.DriveTrain.right_back);
  private WPI_TalonFX leftBackMotor = new WPI_TalonFX(Constants.DriveTrain.left_back);

  private MotorControllerGroup leftMotors = new MotorControllerGroup(leftFrontMotor, leftBackMotor);
  private MotorControllerGroup rightMotors = new MotorControllerGroup(rightFrontMotor, rightBackMotor);



  public DriveTrain() {
        rightMotors.setInverted(true);


  }

  public void tankDrive(double left_speed, double right_speed){
      leftMotors.set(left_speed);
      rightMotors.set(right_speed);
    //   setDefaultCommand(x);

  }





  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
