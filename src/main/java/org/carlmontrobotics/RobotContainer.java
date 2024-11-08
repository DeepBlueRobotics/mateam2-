// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.carlmontrobotics;

//199 files
import org.carlmontrobotics.commands.*;
import org.carlmontrobotics.subsystems.*;
import static org.carlmontrobotics.Constants.*;

import org.carlmontrobotics.Constants.OI;
import org.carlmontrobotics.Constants.driveTrainConstants;

//controllers
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;

//commands
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.PrintCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
//control bindings
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.POVButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;

public class RobotContainer {
  private final XboxController controller = new XboxController(OI.XBOX_CONTROLLER_PORT);
  private final Drivetrain drivetrain = new Drivetrain();
  private final Door door = new Door();
  public RobotContainer() {
    setBindings();
  }

  private void setBindings() {
    //6 is the Right bumper
  new JoystickButton(controller, Constants.DoorConstants.rightBumper)
    .whileTrue(new InstantCommand(door::doorOpenButton))
    .whileFalse(new InstantCommand(door::doorStopButton));

    
  new JoystickButton(controller, Constants.DoorConstants.leftBumper)
    .whileTrue(new InstantCommand(door::doorCloseButton))
    .whileFalse(new InstantCommand(door::doorStopButton));
  }

  public Command getAutonomousCommand() {
    return new Autonomous(drivetrain);
  }

}