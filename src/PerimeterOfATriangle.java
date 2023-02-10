/**
 * @Class: PerimeterOfATriangle
 * @Author: Miguel Ramirez
 * @Course: ITEC 2140 section 05, spring 2023
 * @Date: February 7, 2023
 * @Description: In this program the written code will calculate the perimeter of
 * a triangle if all sides pass the if statement and will be valid otherwise
 * if one of the edges is bigger than two added together than they will
 * be given a text saying invalid.
 *
 */


import java.util.Scanner;
public class PerimeterOfATriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first length of the triangle: ");
        double edge1 = input.nextInt();
        System.out.print("Enter the second length of the triangle: ");
        double edge2 = input.nextInt();
        System.out.print("Enter the third length of the triangle: ");
        double edge3 = input.nextInt();

        if (edge1 + edge2 > edge3 && edge2 + edge3 > edge1 && edge1 + edge3 > edge2) {
            double perimeter = edge1 + edge2 + edge3;
            System.out.println("The Perimeter of the triangle is: " + perimeter);
        }
        else {
            System.out.println("The input is invalid as one of the edges is longer than the other two pairs.");
        }
    }
}