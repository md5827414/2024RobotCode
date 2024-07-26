// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj2.command.Command;

/** An example command that uses an example subsystem. */
public class AmpCmd extends Command {
  private final AmpSubsystem ampsubsystem;
  private final double angle;
  /**
   * Creates a new ExampleCommand.
   *
   
   */
  public AmpCmd(AmpSubsystem ampsubsystem, double angle) {
    this.ampsubsystem = ampsubsystem;
    this.angle = angle;


    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(ampsubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    ampsubsystem.setAngle(angle);
  }
    
  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {

     ampsubsystem.setAngle(0);
  }
 
  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
