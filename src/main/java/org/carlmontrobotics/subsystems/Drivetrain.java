
package org.carlmontrobotics.subsystems;
import org.carlmontrobotics.lib199.MotorConfig;
import org.carlmontrobotics.lib199.MotorControllerFactory;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import org.carlmontrobotics.Constants.*;


import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class Drivetrain extends SubsystemBase {
  CANSparkMax rightWheels = MotorControllerFactory.createSparkMax(DrivetrainC.rightWheelsPort, MotorConfig.NEO);
  CANSparkMax leftWheels = MotorControllerFactory.createSparkMax(DrivetrainC.leftWheelsPort, MotorConfig.NEO);
  RelativeEncoder rightEncoder = rightWheels.getEncoder();
  RelativeEncoder leftEncoder = leftWheels.getEncoder();
  private XboxController controller;
  
  /** Creates a new Drivetrain. */
  public Drivetrain(XboxController controller) {
    SmartDashboard.putNumber("test Drive", 0);
    this.controller = controller;
  }

  public void tankDrive() {
    double rightY = controller.getRightY();
    double leftY = controller.getLeftY();
    rightWheels.set(-rightY * DrivetrainC.right_motor_slowdown);
    leftWheels.set(leftY * DrivetrainC.left_motor_slowdown);
    SmartDashboard.putNumber("motor right", rightEncoder.getPosition());
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
    tankDrive();
    //leftWheels.set(SmartDashboard.getNumber("test Drive", 0));

    
  }
}
  