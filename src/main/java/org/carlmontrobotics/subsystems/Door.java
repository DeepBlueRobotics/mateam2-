
package org.carlmontrobotics.subsystems;
import org.carlmontrobotics.lib199.MotorConfig;
import org.carlmontrobotics.lib199.MotorControllerFactory;
import org.carlmontrobotics.Constants.*;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.XboxController;



public class Door extends SubsystemBase {
    public static CANSparkMax doorMotor = MotorControllerFactory.createSparkMax(DoorConstants.doorPort, MotorConfig.NEO);
    RelativeEncoder encoder = doorMotor.getEncoder();
    private XboxController xboxController2 = new XboxController(2); 
  /** Creates a new Drivetrain. */
  /*public void doorOpen() {
   double leftY2 = xboxController2.getLeftY();
    doorMotor.set(leftY2 * DoorConstants.doorSpeed);
  }
  public void doorOpenButton() {
    
  }*/

  public void doorOpenButton(){
    doorMotor.set(DoorConstants.doorSpeed);
  }
  public void doorCloseButton(){
    doorMotor.set(-DoorConstants.doorSpeed);
  }
  public void doorStopButton(){
    doorMotor.set(0);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    SmartDashboard.putNumber("Position", encoder.getPosition());
    //doorOpen();
    //doorOpenButton();
    //doorCloseButton();
  }
}
  