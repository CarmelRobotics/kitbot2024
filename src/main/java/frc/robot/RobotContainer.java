// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.Drive;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.ShooterShoot;
import frc.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.Shooter;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // Drivetrain Varyables
  private final DriveTrain m_drivetrain = new DriveTrain();
  private final Joystick j_joystick = new Joystick(Constants.Controls.CONTROLS_USB_JOYSTICK);
  // Shooter Varyables
  private final JoystickButton shoot;
  private final JoystickButton eat;
  private final Shooter shootiboi =  new Shooter(); 
  
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Shooter Joystick button Detection 
    shoot = new JoystickButton(j_joystick, 3);
    eat = new JoystickButton(j_joystick,4);
    

    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    // drivetrain init
    m_drivetrain.setDefaultCommand(new Drive(m_drivetrain, j_joystick));
    ShooterShoot shootiboiShoot = new ShooterShoot(1, shootiboi);
    ShooterShoot shootiboiEat = new ShooterShoot(1, shootiboi);
    // Init shooter functions for toggle
    shoot.toggleOnTrue(shootiboiShoot);
    eat.toggleOnTrue(shootiboiEat);
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return new ExampleCommand(null);
  }
}

/// i love cad :) 
///   - ross
