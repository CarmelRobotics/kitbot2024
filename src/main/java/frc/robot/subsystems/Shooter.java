// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
  // Shooter Motors
  private VictorSP motor1;
  private VictorSP motor2;

  public Shooter() {
    // Init motor objects and assign where the are connected
    motor1 = new VictorSP(4);
    motor2 = new VictorSP(5);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void set(double speed) {
    // Go speed
    motor1.set(speed);
    motor2.set(speed);
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
