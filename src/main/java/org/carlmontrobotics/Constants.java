package org.carlmontrobotics;

import edu.wpi.first.wpilibj.XboxController.Button;

public final class Constants {
    // public static final class Drivetrain {
    //     public static final double MAX_SPEED_MPS = 2;
    // }
    public static final class OI {
        //ublic static final int port = 0;
        public static final int XBOX_CONTROLLER_PORT = 1;
    }

    /*public static final class drivetrainC { 
        public static final int left_motor_port = 1;
        public static final int right_motor_port = 9; 
    }*/
    public static final class DoorConstants {
       // public static final int rightBumper = 6;
        public static final int rightBumper = Button.kRightBumper.value;

        //public static final int leftBumper = 5;
        public static final int leftBumper = Button.kLeftBumper.value;

        public static final double doorSpeed = 0.06;
        public static final int doorPort = 9;
    }
    public static final class driveTrainConstants {
        public static final int rightWheelsPort = 1;
        public static final int leftWheelsPort = 9;
    }
}
