import java.lang.Math; 

public class PickCard {


    public static void main(String[] args){
        int cardNum = (int)(Math.random() * 13) + 1;
        int suit =  (int)(Math.random() * 4);

        String suitString = "";

        switch (suit) {
            case 0: 
                suitString = "Hearts";
                break;
            case 1: 
                suitString = "Diamonds";
                break;
            case 2: 
                suitString = "Spades";
                break;
            case 3: 
                suitString = "Clubs";
                break;

        }


        if (cardNum > 1 && cardNum < 11) {
            System.out.println("The card you picked is the " + cardNum + " of " + suitString);
        } else {
            switch(cardNum) {
                case 1: 
                    System.out.println("The card you picked is the Ace of " + suitString);
                    break;
                case 11:
                    System.out.println("The card you picked is the Jack of " + suitString);
                    break;
                case 12:
                System.out.println("The card you picked is the Queen of " + suitString);
                break;  
                case 13:
                System.out.println("The card you picked is the King of " + suitString);
                break;          



            }

        }





    }



}