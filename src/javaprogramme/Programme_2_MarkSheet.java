package javaprogramme;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between, 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between, 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * |                               |
 * | Mark Sheet                    |
 * |_______________________________|
 * | Name : Jay                    |
 * | Roll No: 08                   |
 * |_______________________________|
 * | Subjects : Marks              |
 * |_______________________________|
 * | Math : 98                     |
 * | Science : 90                  |
 * | English : 85                  |
 * |_______________________________|
 * | Total : 273                   |
 * |_______________________________|
 * | Percentage : 91.0             |
 * | Result : Pass                 |
 * | Grade : A+                    |
 * |_______________________________
 * Write programme with if else and while loop.
 */
public class Programme_2_MarkSheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //scanner declaration to read data
        char continueCalculation = 'Y';
        while (continueCalculation == 'Y' || continueCalculation == 'y') {
            System.out.println("Enter Student Name: ");
            String name = scanner.nextLine();
            System.out.println("Enter Roll Number: ");
            int rollNumber = scanner.nextInt();
            System.out.println("Enter Maths Marks: ");
            double mathsMarks = scanner.nextDouble();
            System.out.println("Enter Science Marks: ");
            double scienceMarks = scanner.nextDouble();
            System.out.println("Enter English Marks: ");
            double englishMarks = scanner.nextDouble();
            result(mathsMarks, scienceMarks, englishMarks, name, rollNumber);
            System.out.println("would you like to enter another student's details? Please enter Y or  N): ");
            continueCalculation = scanner.next().charAt(0);
            scanner.nextLine();
        }
        System.out.println("Programme Terminated");
        scanner.close(); // close scanner object
    }


    public static void result(double Math, double Science, double English, String name, int rollNumber) {
        if (Math < 0 || Math > 100 || Science < 0 || Science > 100 || English < 0 || English > 100) { // condition given in question
            System.out.println("Invalid input, Marks should between 0 and 100"); // print a statement if data is invalid
        } else {
            //calculate total marks and result
            double totalMarks = Math + Science + English;
            double percentage = (totalMarks / 300) * 100;
            String result = (percentage >= 35 && Math >= 35 && Science >= 35 && English >= 35) ? "Pass" : "Fail"; // used ternary operator

            //grade calculation
            String Grade = "-";
            if (Math >= 35 && Science >= 35 && English >= 35) {
                if (percentage <= 100 && percentage >= 80) {
                    Grade = "A+";
                } else if (percentage < 80 && percentage >= 60) {
                    Grade = "A";
                } else if (percentage < 60 && percentage >= 50) {
                    Grade = "B";
                } else if (percentage < 50 && percentage >= 35) {
                    Grade = "C";
                } else {
                    Grade = "Fail";
                }
                // Display the result
                System.out.println("Pass");
                System.out.println("Percentage: " + percentage);
                System.out.println("Grade: " + Grade);
            } else {
                System.out.println("Fail");
            }

            //Printing a Mark sheet
            System.out.println(" ______________________________");
            System.out.println("|                              |");
            System.out.println("|            Mark Sheet        |");
            System.out.println("|______________________________|");
            System.out.println("|   Name      : " + name + "         |");
            System.out.println("|   Roll No.  : " + rollNumber + "             |");
            System.out.println("|______________________________|");
            System.out.println("|   Subjects  :  Marks         |");
            System.out.println("|______________________________|");
            System.out.println("|   Math      : " + Math + "          |");
            System.out.println("|   Science   : " + Science + "          |");
            System.out.println("|   English   : " + English + "          |");
            System.out.println("|______________________________|");
            System.out.println("|    Total : " + totalMarks + "             | ");
            System.out.println("|______________________________|");
            System.out.println("|    Percentage  :" + percentage + "|");
            System.out.println("|    Result      :" + result + "        |");
            System.out.println("|    Grade       : " + Grade + "          |");
            System.out.println("|_______________________________|");

        }
    }
}