// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;


public class Turret extends SubsystemBase {
  
  private WPI_TalonFX turretMotor = new WPI_TalonFX(Constants.Turret.turret_motor);


  public Turret() {
    // turret is brake mode
    turretMotor.setNeutralMode(NeutralMode.Brake);

  }

  public void moveTurret(double speed){
    // set motor speed
    turretMotor.set(speed);
      
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
