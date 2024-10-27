
package org.carlmontrobotics.subsystems;
import org.carlmontrobotics.lib199.MotorConfig;
import org.carlmontrobotics.lib199.MotorControllerFactory;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class Door extends SubsystemBase {
  
  /** Creates a new Drivetrain. */
  public Door() {
    CANSparkMax doorMotor = MotorControllerFactory.createSparkMax(1, MotorConfig.NEO);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
  }
}
  