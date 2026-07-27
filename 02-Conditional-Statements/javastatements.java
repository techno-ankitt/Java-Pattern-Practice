// import java.util.*;

// public class javastatements{
//     public static void main(String[] args) {
        
    
//     Scanner sc = new Scanner(System.in);

//     int button = sc.nextInt();



// -------------------------------------------------
//                    IF & ELSE-IF
// -------------------------------------------------
//      if (button==1) {
//          System.out.println("hello by press 1");
//      }
//      else if (button==2){
//          System.out.println("hello by press 2");
//      }
//     }
// }




//---------------------------------------------------
//                     SWITCH
// --------------------------------------------------
//      switch(button){
//          case 1 : System.out.println("ironman");
//          break;

//          case 2 : System.out.println("wanda");
//          break;

//          case 3 : System.out.println("thor");
//          break;

//          default : System.out.println("Invalid button");

//      }

// }
// }


import java.util.Scanner;

public class javastatements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("============================");
        System.out.println("MOVIES TICKET BOOKING SYSTEM");
        System.out.println("============================");

        // Movies
        System.out.println("\nAVAILABLE MOVIES");
        System.out.println("1. Ramayan");
        System.out.println("2. Spider-man: Brand New Home");
        System.out.println("3. The Odyssey");
        System.out.println("4. Avengers-Doomsday");

        System.out.print("\nChoose Movie (1-4): ");
        int moviechoice = sc.nextInt();

        int price = 0;

        // Movie Validation
        switch (moviechoice) {

            case 1:
                System.out.println("Movie Name : Ramayan");
                price = 1900;
                break;

            case 2:
                System.out.println("Movie Name : Spider-man: Brand New Home");
                price = 800;
                break;

            case 3:
                System.out.println("Movie Name : The Odyssey");
                price = 1100;
                break;

            case 4:
                System.out.println("Movie Name : Avengers-Doomsday");
                price = 1500;
                break;

            default:
                System.out.println("Invalid Movie Choice!");
                sc.close();
                return;
        }

        // Show Timing
        System.out.println("\nAvailable Show Timings");
        System.out.println("1. 10:00 AM");
        System.out.println("2. 2:00 PM");
        System.out.println("3. 7:00 PM");

        System.out.print("Choose Show Time (1-3): ");
        int timechoice = sc.nextInt();

        // Show Time Validation
        if (timechoice == 1) {
            System.out.println("Show : 10:00 AM");
        } else if (timechoice == 2) {
            System.out.println("Show : 2:00 PM");
        } else if (timechoice == 3) {
            System.out.println("Show : 7:00 PM");
        } else {
            System.out.println("Invalid Show Time!");
            sc.close();
            return;
        }

        // Tickets
        System.out.print("\nEnter Number of Tickets: ");
        int tickets = sc.nextInt();

        int total = tickets * price;

        // Booking Details
        System.out.println("\n---------------------------------");
        System.out.println("        BOOKING DETAILS");
        System.out.println("---------------------------------");
        System.out.println("Tickets           : " + tickets);
        System.out.println("Price per Ticket  : " + price);
        System.out.println("Total Amount      : " + total);

        System.out.println("\nBooking Successful!");
        System.out.println("Enjoy Your Movie");

        sc.close();
    }
}
