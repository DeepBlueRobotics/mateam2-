package org.carlmontrobotics;

import edu.wpi.first.wpilibj.XboxController.Button;

public final class Constants {
    // public static final class Drivetrain {
    //     public static final double MAX_SPEED_MPS = 2;
    // }
    public static final class OI {
        //ublic static final int port = 0;
        public static final int DRIVER_PORT = 0;
        public static final int CONTROLLER_PORT = 1;
    }

    public static final class DrivetrainC { 
        public static final double left_motor_slowdown = 0.3;
        public static final double right_motor_slowdown = 0.3;

        public static final int rightWheelsPort = 17;
        public static final int leftWheelsPort = 14;

        public static final int AButton = Button.kA.value;
    }
    public static final class DoorConstants {
       // public static final int rightBumper = 6;
        public static final int rightBumper = Button.kRightBumper.value;

        //public static final int leftBumper = 5;
        public static final int leftBumper = Button.kLeftBumper.value;

        public static final double doorSpeed = 0.04;
        public static final int doorPort = 4;
    }
}
