// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

public class Elevator extends SubsystemBase {


  private WPI_TalonFX elevatorMotor = new WPI_TalonFX(Constants.Elevator.elevator_motor);


  public Elevator() {
    elevatorMotor.setNeutralMode(NeutralMode.Brake);


  }
  public void moveElevator(double speed){
    // True for up, False for down
    elevatorMotor.set(speed);

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
