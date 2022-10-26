
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
public class Shooter extends SubsystemBase {


  private MotorController leftShooterMotor = new MotorController(){

    @Override
    public void set(double speed) {
      // TODO Auto-generated method stub
    }

    @Override
    public double get() {
      // TODO Auto-generated method stub
      return 0;
    }

    @Override
    public void setInverted(boolean isInverted) {
      // TODO Auto-generated method stub
      
    }

    @Override
    public boolean getInverted() {
      // TODO Auto-generated method stub
      return false;
    }

    @Override
    public void disable() {
      // TODO Auto-generated method stub
      
    }

    @Override
    public void stopMotor() {
      // TODO Auto-generated method stub
      
    }

  };
    
  
  private MotorController rightShooterMotor = new MotorController(){

    @Override
    public void set(double speed) {
      // TODO Auto-generated method stub
      
    }

    @Override
    public double get() {
      // TODO Auto-generated method stub
      return 0;
    }

    @Override
    public void setInverted(boolean isInverted) {
      // TODO Auto-generated method stub
      
    }

    @Override
    public boolean getInverted() {
      // TODO Auto-generated method stub
      return false;
    }

    @Override
    public void disable() {
      // TODO Auto-generated method stub
      
    }

    @Override
    public void stopMotor() {
      // TODO Auto-generated method stub
      
    }
  };


  private MotorControllerGroup shooter = new MotorControllerGroup(leftShooterMotor,rightShooterMotor );



  /** Creates a new ExampleSubsystem. */
  public Shooter() {

    int test = Constants.Shooter.left_shooter_motor;

    
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
