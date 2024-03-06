// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Rollers extends SubsystemBase {
private final TalonSRX Rollers_Right;
private final TalonSRX Rollers_Left;

public Rollers() {




Rollers_Right = new TalonSRX(Constants.Rollers_Right_ID);
Rollers_Left = new TalonSRX(Constants.Rollers_Left_ID);
}
@Override
public void periodic() {

}

public void Rollers_In() {
    Rollers_Right.set(ControlMode.PercentOutput,Constants.Rollers_speed_Right);
   Rollers_Left.set(ControlMode.PercentOutput,Constants.Rollers_speed_Right);
}
public void Rollers_out(){
    Rollers_Right.set(ControlMode.PercentOutput,Constants.Rollers_speed_Left);
    Rollers_Left.set(ControlMode.PercentOutput,Constants.Rollers_speed_Left*-1);
}
public void Rollers_Stop() {
  Rollers_Right.set(ControlMode.PercentOutput,Constants.Rollers_stop_Right*0);
  Rollers_Left.set(ControlMode.PercentOutput,0);

 //private TalonSRX Intake = new TalonSRX(0);.





  
}
}
