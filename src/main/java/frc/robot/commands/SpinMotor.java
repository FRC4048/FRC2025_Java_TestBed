// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import frc.robot.subsystems.basicTestbed.TestbedSubsystem;

public class SpinMotor {
  private TestbedSubsystem neoMotor;

  private double startTime;
  private double speedMotors;

  public SpinMotor(TestbedSubsystem neoMotor, double speedMotors) {

    this.speedMotors = speedMotors;
    this.neoMotor = neoMotor;
  }

  // Called when the command is initially scheduled.
  public void initialize() {
    neoMotor.setSpeed(speedMotors);
    startTime = Timer.getFPGATimestamp();
  }

  // Called every time the scheduler runs while the command is scheduled.
  public void execute() {}

  // Called once the command ends or is interrupted.
  public void end(boolean interrupted) {
    neoMotor.stop();
  }

  // Returns true when the command should end.
  public boolean isFinished() {

    return (Timer.getFPGATimestamp() - startTime >= 5);
  }
}
