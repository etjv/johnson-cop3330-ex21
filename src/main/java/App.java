/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Edmund Johnson V
 */

/*
Many programs display information to the end user in one form but use a different form inside the program. For example, you may show the word Blue on the screen, but behind the scenes you’ll have a numerical value for that color or an internal value because you may need to represent the textual description in another language for Spanish-speaking visitors.

Write a program that converts a number from 1 to 12 to the corresponding month. Prompt for a number and display the corresponding calendar month, with 1 being January and 12 being December. For any value outside that range, display an appropriate error message.

Example Output
Please enter the number of the month: 3
The name of the month is March.
Constraints
Use a switch or case statement for this program.
Use a single output statement for this program.
 */


import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] arg){
        int month = getMonth();
        System.out.println(output(month));
    }

    private static int getMonth(){
        System.out.print("Please enter the number of the month: ");
        String x = in.nextLine();
        if(x.matches("[0-9]+")){
            int i = Integer.parseInt(x.replace(" ", ""));
            if(i > 0 && i < 13){
                return i;
            }
            else{
                System.out.println("Enter a valid month number (1-12)");
                return getMonth();
            }
        }
        else{
            System.out.println("Enter a valid month number (1-12)");
            return getMonth();
        }
    }

    private static String output(int m){
        switch(m){
            case 1:
                return "The name of the month is January.";
            case 2:
                return "The name of the month is February.";
            case 3:
                return "The name of the month is March.";
            case 4:
                return "The name of the month is April.";
            case 5:
                return "The name of the month is May.";
            case 6:
                return "The name of the month is June.";
            case 7:
                return "The name of the month is July.";
            case 8:
                return "The name of the month is August.";
            case 9:
                return "The name of the month is September.";
            case 10:
                return "The name of the month is October.";
            case 11:
                return "The name of the month is November.";
            case 12:
                return "The name of the month is December.";
            default:
                return "Default";
        }
    }
}
