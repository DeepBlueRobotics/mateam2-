
package org.carlmontrobotics.subsystems;
import org.carlmontrobotics.lib199.MotorConfig;
import org.carlmontrobotics.lib199.MotorControllerFactory;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class ExampleSubsystem extends SubsystemBase {
  CANSparkMax rightWheels = MotorControllerFactory.createSparkMax(1, MotorConfig.NEO);
  CANSparkMax leftWheels = MotorControllerFactory.createSparkMax(2, MotorConfig.NEO);
  private XboxController XboxController1 = new XboxController(0);
  /** Creates a new ExampleSubsystem. */
  public ExampleSubsystem() {

  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public void tankDrive() {
    double rightY = XboxController1.getRightY();
    double leftY = XboxController1.getLeftY();
    rightWheels.set(rightY);
    leftWheels.set(leftY);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    tankDrive();
  }
}
  