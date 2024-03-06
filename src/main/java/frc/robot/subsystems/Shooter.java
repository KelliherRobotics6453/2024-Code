// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
private final TalonSRX Shooter;


public Shooter() {




Shooter = new TalonSRX(Constants.Shooter_ID);
}
@Override
public void periodic() {

}

public void Shooter_In() {
    Shooter.set(Constants.Shooter_speed_In, 0);
}
public void Shooter_out(){
    Shooter.set(Constants.Shooter_speed_out, 0, null, 0);
}

 //private TalonSRX Shooter = new TalonSRX(0);





  
}
