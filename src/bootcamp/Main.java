package bootcamp;
/* Teron Briggs
   2/10/2017
   Lab8BattingAvg
   Taking a batter and getting the average
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //Get user imput -or number at bats
        Scanner scan = new Scanner(System.in);
        String infoEntered;
        do {

            // Ask user to enter number of bats.
            System.out.println("Enter number at bats? ");
        int atBats = scan.nextInt();


        // Ask the user for number of bases earned by the batter.
        System.out.println("Enter number of bases earned? ");
        double[] atBatsArray = new double[atBats];

        // Get Sum
        double sum = 0;

        // Get user input for number of bases.
        for (int i = 0; i < atBats; i++) {
            atBatsArray[i] = scan.nextInt();
        }
        //double[] atBatsArray = {0.0};

        // Display batting avg
        double batAvg = calculateBatAverage(atBatsArray);
        System.out.println("Your batting average is: " + batAvg);
        // Display slugging percentage
        double slugPercent = calculateSlugPer(atBatsArray);
        System.out.println("Your slugging percent is: " + slugPercent);

        System.out.println("Would  you like to know about another batter? Type Yes or no");
         infoEntered = scan.next();
    } while (infoEntered.equalsIgnoreCase("yes")) ; //Asking if user would like to know about more batters.
    }

    /* This method caculates slugging percent
     */
    public static double calculateSlugPer(double[] atBatsArray) {
        int total = 0;
        for (int i = 0; i < atBatsArray.length; i++) {
            total += atBatsArray[i];
        }

        double slugPercent = (double) total / atBatsArray.length;
            return slugPercent;
    }

    /* This method caculates batting avg
     */
    public static double calculateBatAverage(double[] atBatsArray) {
        int i = 0;
        int total = 0;
        for (i = 0; i < atBatsArray.length; i++) {
            if (atBatsArray[i] > 0) {
                total = total + 1;
            }
        }
        double atBatsAvg = (double) total / atBatsArray.length;

        return atBatsAvg;


    }

   }

