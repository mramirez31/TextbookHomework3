/**
 * @Class: PerimeterOfATriangle
 * @Author: Miguel Ramirez
 * @Course: ITEC 2140 section 05, spring 2023
 * @Date: February 7, 2023
 * @Description: This program will have the person put their weight and height
 * and compute it into BMI and then use the BMI of the persons weight and height
 * to compare it with other BMI and see what the interception of their BMI is
 * whether it is underweight, normal, overweight, and obese.
 *
 */

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextInt();
        System.out.print("Enter height in inches: ");
        double inches = input.nextInt();

        double weightKg = pounds * 0.4536;
        double heightM = inches * 0.0254;

        double bmi = weightKg / heightM * heightM;

        if(bmi < 18.5){
            System.out.println("Your BMI total ia " + bmi + " kg/m so you are underweight.");
        }
        else if (18.5 <= bmi && bmi < 25.0) {
            System.out.println("Your BMI total is " + bmi + " kg/m so you are normal.");
        }
        else if (25.0 <= bmi && bmi < 30.0) {
            System.out.println("Your BMI total is " + bmi + " kg/m so you are overweight.");
        }
        else{
            System.out.println("Your Bmi total is " + bmi + "kg/m so your are obese.");
        }
    }
}
