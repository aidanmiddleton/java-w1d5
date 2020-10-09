import java.util.Scanner;

public class PerimeterOfTriangle {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the length of side A");
        int A = input.nextInt();
        System.out.println("Please enter the length of side B");
        int B = input.nextInt();
        System.out.println("Please enter the length of side C");
        int C = input.nextInt();

        if((A + B > C) && (B + C > A) && (A + C > B)) {
            int perim = A + B + C;
            System.out.println("This is a valid triangle with the perimeter: " + perim);
        } else {
            System.out.println("This is not a valid triangle");
        }


    }


}