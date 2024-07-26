// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class AmpSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
private Servo servo;
private static AmpSubsystem instance;

  public AmpSubsystem() {

    servo = new Servo(Constants.servo);
  }
  
   
  /**
   * Example command factory method.
   *
   * @return a command
   */
  
  

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public void setAngle(double angle) {
    // Query some boolean state, such as a digital sensor.
    servo.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
    public static AmpSubsystem getInstance(){

     if(instance == null) {
      instance = new AmpSubsystem();
      return instance;
    
     }else {
      return instance;
     }
    }



}
