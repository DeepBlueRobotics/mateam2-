package org.carlmontrobotics;

import edu.wpi.first.wpilibj.XboxController.Button;

public final class Constants {

    public static final class OI {
        public static final int XBOX_CONTROLLER_PORT = 0;
    }

    public static final class DrivetrainC { 
        public static final double left_motor_slowdown = 0.5;
        public static final double right_motor_slowdown = 0.5;

        public static final int rightWheelsPort = 17;
        public static final int leftWheelsPort = 14;

        public static final int AButton = Button.kA.value;
    }
    public static final class DoorConstants {
       // public static final int rightBumper = 6;
        public static final int rightBumper = Button.kRightBumper.value;

        //public static final int leftBumper = 5;
        public static final int leftBumper = Button.kLeftBumper.value;

        public static final double doorSpeed = 0.06;
        public static final int doorPort = 9;
    }
}
