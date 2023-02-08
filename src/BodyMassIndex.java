/**
 * @class : BodyMassIndex
 * @author: Sonal Sekhda
 * @course: ITEC 2140 - 04 Spring 2023
 * @date: February 7, 2023
 * Write a program that compute BMI using formula BMI = weight(kilograms )/ height(meter * meter)
 */
import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of weight : ");
        double weight = scan.nextDouble(); //Declare the variable weight in pound

        System.out.print("Enter the value of the height : ");
        double height = scan.nextDouble(); //Decalre tne variable height in inches

        weight = weight * 0.4536; //Convert weight pounds to kilograms
        System.out.println("Weight in Kilograms : " + weight);

        height = height * 0.0254; //Convert height inches to meters
        System.out.println("Height is in the meter: " + height);

        double bodyMassIndex; //Declare the variable BodyMassIndex
        bodyMassIndex = weight / (height * height);// count BodyMassIndex
        System.out.printf("Total BodyMassIndex is : %.4f ", bodyMassIndex);
        System.out.println();

        if (bodyMassIndex >= 30.0) {
            System.out.println("Obese");
        } else if (bodyMassIndex < 30.0 && bodyMassIndex >= 25.0) {
            System.out.println("Overweight");
        } else if (bodyMassIndex < 25 && bodyMassIndex >= 18.5) {
            System.out.println("Normal");
        } else
            System.out.println("Underweight");
    }
}
