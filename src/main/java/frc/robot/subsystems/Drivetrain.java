/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Drivetrain extends SubsystemBase {
  
  TalonSRX TALONLEFT = new TalonSRX(RobotMap.TALONLEFT);
  TalonSRX TALONRIGHT = new TalonSRX(RobotMap.TALONRIGHT);

  public Drivetrain() {

    double rampRate = 0.2;

    TALONLEFT.setInverted(false);
    TALONRIGHT.setInverted(false);

    TALONLEFT.configOpenloopRamp(rampRate);
    TALONRIGHT.configOpenloopRamp(rampRate);

  }

  public void arcade(double moveY, double turn){

    TALONLEFT.set(ControlMode.PercentOutput, turn + moveY);
    TALONRIGHT.set(ControlMode.PercentOutput, turn - moveY);

  }

  public void tank(double moveL, double moveR){

    TALONLEFT.set(ControlMode.PercentOutput, moveL);
    TALONRIGHT.set(ControlMode.PercentOutput, moveR);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
