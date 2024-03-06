// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
private final TalonSRX Intake;


public Intake() {




Intake = new TalonSRX(Constants.Intake_ID);
}
public Intake() {
}
@Override
public void periodic() {

}

public void Intake_In() {
    Intake.set(ControlMode.PercentOutput,Constants.Intake_speed);
}
public void Intake_out(){
    Intake.set(ControlMode.PercentOutput,Constants.Intake_speed*-1);
}

 //private TalonSRX Intake = new TalonSRX(0);





  
}
