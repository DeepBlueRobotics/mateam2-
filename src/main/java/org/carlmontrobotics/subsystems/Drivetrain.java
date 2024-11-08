
package org.carlmontrobotics.subsystems;
import org.carlmontrobotics.lib199.MotorConfig;
import org.carlmontrobotics.lib199.MotorControllerFactory;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class Drivetrain extends SubsystemBase {
  CANSparkMax rightWheels = MotorControllerFactory.createSparkMax(17, MotorConfig.NEO);
  CANSparkMax leftWheels = MotorControllerFactory.createSparkMax(14, MotorConfig.NEO);
  RelativeEncoder rightEncoder = rightWheels.getEncoder();
  RelativeEncoder leftEncoder = leftWheels.getEncoder();
  private static XboxController XboxController1 = new XboxController(0);
  
  /** Creates a new Drivetrain. */
  public Drivetrain() {
    SmartDashboard.putNumber("test Drive", 0);
  }

  public void tankDrive() {
    double rightY = XboxController1.getRightY();
    double leftY = XboxController1.getLeftY();
    rightWheels.set(-rightY*0.25);
    leftWheels.set(leftY*0.25);
    SmartDashboard.putNumber("motor right", rightEncoder.getPosition());
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
    tankDrive();
    //leftWheels.set(SmartDashboard.getNumber("test Drive", 0));

    
  }
}
  