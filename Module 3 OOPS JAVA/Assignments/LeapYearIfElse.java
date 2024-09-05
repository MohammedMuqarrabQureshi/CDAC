
// 1)Write a program that checks if a given year is a leap year or not using both if-else and switch-case

// Using if-else statement: 

import java.util.Scanner;

public class LeapYearIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            } else {
                System.out.println(year + " is a leap year.");
            }
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}


// Using Switch-case

// import java.util.Scanner;

// public class LeapYearSwitchCase {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a year: ");
//         int year = scanner.nextInt();

//         int divisibleBy4 = (year % 4 == 0) ? 1 : 0;
//         int divisibleBy100 = (year % 100 == 0) ? 1 : 0;
//         int divisibleBy400 = (year % 400 == 0) ? 1 : 0;

//         switch (divisibleBy4) {
//             case 1:
//                 switch (divisibleBy100) {
//                     case 1:
//                         switch (divisibleBy400) {
//                             case 1:
//                                 System.out.println(year + " is a leap year.");
//                                 break;
//                             default:
//                                 System.out.println(year + " is not a leap year.");
//                         }
//                         break;
//                     default:
//                         System.out.println(year + " is a leap year.");
//                 }
//                 break;
//             default:
//                 System.out.println(year + " is not a leap year.");
//         }

//         scanner.close();
//     }
// }
