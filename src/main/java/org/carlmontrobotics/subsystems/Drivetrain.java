
package org.carlmontrobotics.subsystems;
import org.carlmontrobotics.lib199.MotorConfig;
import org.carlmontrobotics.lib199.MotorControllerFactory;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import static org.carlmontrobotics.Constants.drivetrainC.*;
import static org.carlmontrobotics.Constants.OI.*;



public class Drivetrain extends SubsystemBase {
  CANSparkMax rightWheels = MotorControllerFactory.createSparkMax(right_motor_port, MotorConfig.NEO);
  CANSparkMax leftWheels = MotorControllerFactory.createSparkMax(left_motor_port, MotorConfig.NEO);
  private XboxController XboxController1 = new XboxController(XBOX_CONTROLLER_PORT);
  
  /** Creates a new Drivetrain. */
  public Drivetrain() {

  }

  public void tankDrive(double right_Y, double left_Y) {
    double rightY = XboxController1.getRightY();
    double leftY = XboxController1.getLeftY();
    rightWheels.set(right_Y);
    leftWheels.set(left_Y);
  }

  public void arcadeDrive(double speed, double turnX) {
    double turnX = XboxController1.getRightX();
    double speed = XboxController1.getLeftY();
    rightWheels.set(speed + turnX);
    leftWheels.set(speed - turnX);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    tankDrive();
  }
}
  