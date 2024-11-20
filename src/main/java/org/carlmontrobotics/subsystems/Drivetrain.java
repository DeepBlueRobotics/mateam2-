
package org.carlmontrobotics.subsystems;
import org.carlmontrobotics.lib199.MotorConfig;
import org.carlmontrobotics.lib199.MotorControllerFactory;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import org.carlmontrobotics.Constants.*;
import org.carlmontrobotics.commands.Autonomous;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class Drivetrain extends SubsystemBase {
  CANSparkMax rightWheels = MotorControllerFactory.createSparkMax(DrivetrainC.rightWheelsPort, MotorConfig.NEO);
  CANSparkMax leftWheels = MotorControllerFactory.createSparkMax(DrivetrainC.leftWheelsPort, MotorConfig.NEO);
  RelativeEncoder rightEncoder = rightWheels.getEncoder();
  RelativeEncoder leftEncoder = leftWheels.getEncoder();
  private XboxController controller;
  public static boolean arcadeDrive = true;

  
  /** Creates a new Drivetrain. */
  public Drivetrain(XboxController controller) {
    SmartDashboard.putNumber("test Drive", 0);
    this.controller = controller;
  }

  public void tankDrive(double leftY, double rightY) {
    // double rightY = controller.getRightY();
    // double leftY = controller.getLeftY();
    rightWheels.set(-rightY * DrivetrainC.right_motor_slowdown);
    leftWheels.set(leftY * DrivetrainC.left_motor_slowdown);
    SmartDashboard.putNumber("motor right", rightEncoder.getPosition());
  }

  public void arcadeDrive(double rightX, double leftY){
    // double rightX = controller.getRightX();
    // double leftY = controller.getLeftY();
    rightWheels.set(-((leftY + rightX) * DrivetrainC.right_motor_slowdown));
    leftWheels.set((leftY - rightX) * DrivetrainC.left_motor_slowdown);
    SmartDashboard.putNumber("motor right", rightEncoder.getPosition());
  }
  public void switchModes(){
    arcadeDrive = !arcadeDrive;
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    if (!Autonomous.getAutonomous()){
      if (arcadeDrive){
        arcadeDrive(controller.getRightX(), controller.getLeftY());
      } 
      else{
        tankDrive(controller.getLeftY(), controller.getRightY());

      }
    }
    //leftWheels.set(SmartDashboard.getNumber("test Drive", 0));
    else{
      return;
    }
    
  }
}
  