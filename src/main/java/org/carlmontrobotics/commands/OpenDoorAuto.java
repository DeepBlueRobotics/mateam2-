// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.carlmontrobotics.commands;

import org.carlmontrobotics.subsystems.Door;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Command;
public class OpenDoorAuto extends Command {
    //make drivetrain
    CANSparkMax doorMotor;
    Timer timer = new Timer();
    Door door;
    /** Creates a new AimOuttakeSpeaker. */
    public OpenDoorAuto(Door door) {
        // Use addRequirements() here to declare subsystem dependencies.
        addRequirements(this.door = door);

    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        timer.reset();
        timer.start();
        Door.doorMotor.set(-0.1);

    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {}

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        Door.doorMotor.set(0);
        timer.stop();
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return timer.get() > 2;
        //run for 15 more seconds and then stop
        //timer gets stopped
    }
}
