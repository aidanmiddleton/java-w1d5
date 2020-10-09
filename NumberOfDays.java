import java.util.Scanner;


public class NumberOfDays {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a month number: ");
        int month = input.nextInt();
        System.out.print("Please enter a year: ");
        int year = input.nextInt();


        String monthString = "";

        int numOfDays = -1;

        boolean isLeap;

        if ((year % 100 == 0 && year % 400 == 0) || year % 4 == 0) {
            isLeap = true;
        } else {
            isLeap = false;
        }


        switch (month) {


            case 1: 
                monthString = "January";
                numOfDays = 31;
                break;

            case 2:
                monthString = "February";
                numOfDays = (isLeap) ? 29 : 28;
                break;
                
            case 3: 
            monthString = "March";
            numOfDays = 31;
            break;
                
            case 4: 
            monthString = "April";
            numOfDays = 30;
            break;

            case 5: 
            monthString = "May";
            numOfDays = 31;
            break;

            case 6: 
            monthString = "June";
            numOfDays = 30;
            break;

            case 7: 
            monthString = "July";
            numOfDays = 31;
            break;

            case 8: 
            monthString = "August";
            numOfDays = 31;
            break;

            case 9: 
            monthString = "September";
            numOfDays = 30;
            break;

            case 10: 
            monthString = "October";
            numOfDays = 31;
            break;

            case 11: 
            monthString = "November";
            numOfDays = 30;
            break;

            case 12: 
            monthString = "December";
            numOfDays = 31;
            break;



        }

        System.out.println(monthString + " has " + numOfDays + " days in the year " + year);

    }


}