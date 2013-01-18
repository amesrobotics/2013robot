/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ames.frc.robot;

import edu.wpi.first.wpilibj.Joystick;
/* List of buttons/toggles needed
 * Manual pivot toggle: 2
 * Speed boost button: Active joystick push
 * Force shoot button: 4 
 * Force Realign button: 7
 * Stop auto-target toggle: 10
 * Activate frisbee grab button: 8
 * Launch climb procedure: Simultaneously &  5,6,7,8,9, and 10.
 *
 */

public class InputManager {
//Git is good
    protected static Joystick PS2Cont = new Joystick(1);

    protected static double[][] GetPureAxis() { // Gets, stores, and returns the status of the joysticks on the PS2 Controller
        /* We will use a double dimension arry to hold the joystick data so that everything can be sent to other functions.
         * Both of the first dimensions will hold 2 doulbes, the first is the x & y axis of the first (paning) joystick
         * The second dimension holds the x & y for the second (pivoting) joystick
         */
        double[][] axis = new double[2][2];// Variable for storing all that data
        axis[0][0] = PS2Cont.getRawAxis(1);// X
        axis[0][1] = PS2Cont.getRawAxis(2);// Y
        axis[1][0] = PS2Cont.getRawAxis(3);// X
        axis[1][1] = PS2Cont.getRawAxis(4);// Y
        return (axis); // Returns axis data to the caller.
    }

    protected static double[][] deadzone(double[][] axis) {// Checks for deadzone
        //This is a skeleton of the deadzone funtion. Mark should fill this in.
        
        return (axis);
    }
    protected static double[][] ramp(double[][] axis){// Ramps inputs so that they curve all happy like.
        //This is a skeleton of the ramp funtion. Mark should fill this in.
        return (axis);
    }
    protected static double[][] translate(double[][] axis){// Translates deadzoned and scaled inputs into whatever exact type of input MotorControl needs/wants.
        //This is a skeleton of the translate funtion. Mark should fill this in.
        return (axis);
    }
}
