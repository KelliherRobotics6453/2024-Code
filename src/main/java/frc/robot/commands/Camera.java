package frc.robot.commands;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.TimedRobot;

public class camera extends TimedRobot {
 @Override
 public void RobotInit(){
    CameraServer.startAutomaticCapture();   
}
}