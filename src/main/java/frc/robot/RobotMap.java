/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

public class RobotMap {

    //MOTORS

    //Drivetrain mini
    public static int TALONLEFT = 11;
    public static int TALONRIGHT = 15;

    //Drivetrain
    public static int SPARKLEFTFRONT = 11;
    public static int SPARKLEFTBACK = 12;

    public static int SPARKRIGHTFRONT = 15;
    public static int SPARKRIGHTBACK = 16;

    /************************************ */

    //CONTROLLERS

    public static int OI_DRIVESTICK_USB = 0;
    public static int OI_FUNSTICK_USB = 1;
    public static int OI_PROSTICK_USB = 2;
    public static int OI_TESTSTICK_USB = 3;

    //Drivestick AXIS
    public static int OI_DRIVESTICK_MOVEY = 1;
    public static int OI_DRIVESTICK_TURN = 4;
    public static int OI_DRIVESTICK_TLEFT = 1;
    public static int OI_DRIVESTICK_TRIGHT = 5;

    //Drivestick Buttons
    public static int OI_DRIVESTICK_TURBO = 5;
    public static int OI_DRIVESTICK_SNAIL = 6;

    //Funstick AXIS
    public static int OI_FUNSTICK_LIFT = 1;
    
    
    public static double P_TURRET = 1;
	public static double I_TURRET = 0;
    public static double D_TURRET = 0;
    
    public static double P_HOOD = 1;
	public static double I_HOOD = 0;
	public static double D_HOOD = 0;

}
