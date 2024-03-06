// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;

public final static int Intake_ID = 0;



public final static int Shooter_ID = 4;

public final static int Rollers_Right_ID = 3;
public final static int Rollers_Left_ID = 2;



  }

  public static final double Intake_speed = 0;
public static final int Intake_ID = 0;

public static final int Rollers_Right_ID = 0;
public static final int Rollers_Left_ID = 0;
public static final double Rollers_speed_Right = 0;
public static final double Rollers_speed_Left = 0;
public static final double Rollers_stop_Right = 0;
public static final Object Rollers_stop_Left = 0;

public static final int Shooter_ID = 0;

public static final TalonSRXControlMode Shooter_speed_In = null;
public static final TalonSRXControlMode Shooter_speed_out = null;

public static final double DRIVETRAIN_TRACKWIDTH_METERS = 0;
public static final double DRIVETRAIN_WHEELBASE_METERS = 0;

public static final String FRONT_LEFT_MODULE_DRIVE_MOTOR = null;
public static final String FRONT_LEFT_MODULE_STEER_MOTOR = null;
public static final String FRONT_LEFT_MODULE_STEER_ENCODER = null;
public static final String FRONT_LEFT_MODULE_STEER_OFFSET = null;

public static final String FRONT_RIGHT_MODULE_DRIVE_MOTOR = null;
public static final String FRONT_RIGHT_MODULE_STEER_MOTOR = null;
public static final String FRONT_RIGHT_MODULE_STEER_ENCODER = null;
public static final String FRONT_RIGHT_MODULE_STEER_OFFSET = null;

public static final String BACK_LEFT_MODULE_STEER_MOTOR = null;
public static final String BACK_LEFT_MODULE_DRIVE_MOTOR = null;
public static final String BACK_LEFT_MODULE_STEER_ENCODER = null;
public static final String BACK_LEFT_MODULE_STEER_OFFSET = null;

public static final String BACK_RIGHT_MODULE_DRIVE_MOTOR = null;
public static final String BACK_RIGHT_MODULE_STEER_MOTOR = null;
public static final String BACK_RIGHT_MODULE_STEER_ENCODER = null;
public static final String BACK_RIGHT_MODULE_STEER_OFFSET = null;
}

