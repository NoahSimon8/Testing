// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;


public class Shintake extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */

  private WPI_TalonFX frontMotor = new WPI_TalonFX(Constants.Shintake.front_shintake_motor);
  private WPI_TalonFX backMotor = new WPI_TalonFX(Constants.Shintake.back_shooter_motor);

  private MotorControllerGroup shintakeMotorGroup = new MotorControllerGroup(frontMotor, backMotor);



  public Shintake() {
    frontMotor.setInverted(true);
    frontMotor.setNeutralMode(NeutralMode.Brake);
    backMotor.setNeutralMode(NeutralMode.Brake);


  }
// should this be one or two methods for up and down?
  public void moveShintake(double speed){
    shintakeMotorGroup.set(speed);

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
