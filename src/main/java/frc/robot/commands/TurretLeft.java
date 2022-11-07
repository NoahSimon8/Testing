// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.Constants;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.Turret;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class TurretLeft extends CommandBase {

  
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final Turret turret;

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */




  public TurretLeft(Turret turret) {
    this.turret = turret;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(turret);
  }


  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
      turret.moveTurret(0);
  }


  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    turret.moveTurret(Constants.Turret.turret_speed);

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    turret.moveTurret(0);

  }


  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
