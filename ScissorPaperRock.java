import java.util.Scanner; 
import java.lang.Math;

public class ScissorPaperRock {


    public static void main(String[] args) {

        System.out.println("Welcome to rock paper Scissors");

        Scanner input = new Scanner(System.in);

        System.out.println("scissor (0), rock (1), paper (2) : ");

        int usersChoice = input.nextInt();

        int computerChoice = (int)(Math.random() * 3);


        String usersString = "";

        switch (usersChoice) {

            case 0: 
                usersString = "Scissors";
                break;
            case 1: 
                usersString = "Rock";
                break;
            case 2: 
                usersString = "Paper";
                break;        

        }

        String computerString = "";

        switch (computerChoice) {

            case 0: 
                computerString = "Scissors";
                break;
            case 1: 
                computerString = "Rock";
                break;
            case 2: 
                computerString = "Paper";
                break;        

        }



        int comparison = usersChoice - computerChoice;

        switch(comparison) {
            case 0: 
                System.out.println("The computer is " + computerString + " and you are " + usersString + ": Its a draw");
                break;
            case 1:
                System.out.println("The computer is " + computerString + " and you are " + usersString + ": You win!");
                break;     
            case -2:
                System.out.println("The computer is " + computerString + " and you are " + usersString + ": You win!");
                break;
            default:
                System.out.println("The computer is " + computerString + " and you are " + usersString + ": You Lose!");
                break;

                


        }

    }


}