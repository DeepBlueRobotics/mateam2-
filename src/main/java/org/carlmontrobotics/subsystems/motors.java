
package org.carlmontrobotics.subsystems;
import org.carlmontrobotics.lib199.MotorConfig;
import org.carlmontrobotics.lib199.MotorControllerFactory;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class motors extends SubsystemBase {
  

  /** Creates a new Drivetrain. */
  public static void motorss() {
    final CANSparkMax motor1 = MotorControllerFactory.createSparkMax(1, MotorConfig.NEO);
    final CANSparkMax motor2 = MotorControllerFactory.createSparkMax(2, MotorConfig.NEO);
    final CANSparkMax motor3 = MotorControllerFactory.createSparkMax(3, MotorConfig.NEO);
    final CANSparkMax motor4 = MotorControllerFactory.createSparkMax(4, MotorConfig.NEO);

    double motor1Speed = SmartDashboard.getNumber("Motor1", 0);
    double motor2Speed = SmartDashboard.getNumber("Motor2", 0);
    double motor3Speed = SmartDashboard.getNumber("Motor3", 0);
    double motor4Speed = SmartDashboard.getNumber("Motor4", 0);
    
    public static void motor1SetSpeed(){
    motorss.motor1.set();

    }
  }
  

  @Override
  public void periodic() {
    
    
  }
}
  