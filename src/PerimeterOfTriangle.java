/**
 *  @class : PerimeterOfTriangle
 *  @author: Sonal Sekhda
 *  @course: ITEC 2140 - 04 Spring 2023
 *  @date: February 7, 2023
 *  * Write a program about perimeter of the triangle with condition every pair of the two edges greater than third
 */
import java.util.Scanner;
public class PerimeterOfTriangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side a of the triangle : ");
        int a = in.nextInt();//Declare the side 1 of the triangle

        System.out.print("Enter the side b of the  triangle : ");
        int b = in.nextInt();//Declare the side 2 or the triangle

        System.out.print("Enter the side c of the triangle : ");
        int c = in.nextInt();//Declare the side 3 or the triangle
        int perimeter = a + b + c;// Calculate perimeter of the triangle
        System.out.println("Perimeter of the triangle is : " + perimeter);

        if(a < b + c && b < a + c && c < a + b)
            System.out.println(perimeter + " is a valid perimeter of the triangle. ");
        else
            System.out.println("Invalid input ");
    }

}
