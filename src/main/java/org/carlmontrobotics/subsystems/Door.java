
package org.carlmontrobotics.subsystems;
import org.carlmontrobotics.lib199.MotorConfig;
import org.carlmontrobotics.lib199.MotorControllerFactory;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import edu.wpi.first.wpilibj.XboxController.Button;


public class Door extends SubsystemBase {
    CANSparkMax doorMotor = MotorControllerFactory.createSparkMax(3, MotorConfig.NEO);
    XboxController driverController; 

    // driverController.getRawButton(Button.kY.value);
    // driverController.getRawButton(Button.kA.value);
  
  /** Creates a new ExampleSubsystem. */
  public Door(XboxController xboob) { 
    driverController = xboob;
  }

  //runs every update
  public void periodic() {
    if ( driverController.getRawButton(Button.kA.value) == true) {
        doorMotor.set(.0035);
    
    }

    if ( driverController.getRawButton(Button.kY.value) == true) {
        doorMotor.set(-.0035);
    }
    }
}