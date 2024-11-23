// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.carlmontrobotics.commands;

import org.carlmontrobotics.subsystems.Drivetrain;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
public class Autonomous extends Command {
    //make drivetrain
    CANSparkMax rightWheels;
    CANSparkMax leftWheels;
    Timer timer = new Timer();
    Drivetrain drivetrain;
    private static boolean autonomousOn;
    /** Creates a new AimOuttakeSpeaker. */
    public Autonomous(Drivetrain drivetrain) {
        // Use addRequirements() here to declare subsystem dependencies.
        addRequirements(this.drivetrain = drivetrain);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        timer.reset();
        timer.start();
        drivetrain.tankDrive(0.857, 0.857);
        autonomousOn = true;
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {

    }
    public static boolean getAutonomous() {
        return autonomousOn;
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        drivetrain.tankDrive(0, 0);
        timer.stop();
        autonomousOn = false;
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return timer.get() > 1.25;
        //run for 15 more seconds and then stop
        //timer gets stopped
    }
}
