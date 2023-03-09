//Kyle Christian T. Novillos
//BSCS 2-1

import java.util.Scanner;
import java.io.*;

public class Novillos_OE4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("APPLICATION OF RECURSION");
            System.out.println("[1] Fibonacci series number");
            System.out.println("[2] Factorial of a number");
            System.out.println("[3] Reverse a number");
            System.out.println("[4] Reverse a word");
            System.out.println("[5] Tower of Hanoi");
            System.out.println("[0] Exit the program");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the value of n: ");
                    int n = sc.nextInt();
                    System.out.println("The " + n + "th Fibonacci number is: " + fibonacci(n));
                    promptAndwait();
                    break;
                case 2:
                    System.out.print("Enter the value of n: ");
                    int m = sc.nextInt();
                    System.out.println(m + "! = " + factorial(m));
                    promptAndwait();
                    break;
                case 3:
                    System.out.print("Enter the number to be reversed: ");
                    int num = sc.nextInt();
                    System.out.println("The reverse of " + num + " is: " + reverseNumber(num));
                    promptAndwait();
                    break;
                case 4:
                    System.out.print("Enter the word to be reversed: ");
                    String word = sc.next();
                    System.out.println("The reverse of " + word + " is: " + reverseWord(word));
                    promptAndwait();
                    break;
                case 5:
                    System.out.print("Enter the number of disks: ");
                    int disks = sc.nextInt();
                    towerOfHanoi(disks, 'A', 'B', 'C');
                    promptAndwait();
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    promptAndwait();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
        sc.close();
    }

    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n-1);
    }

    public static int reverseNumber(int num) {
        return reverseNumberHelper(num, 0);
    }

    public static int reverseNumberHelper(int num, int reversedNum) {
        if (num == 0)
            return reversedNum;
        else
            return reverseNumberHelper(num/10, reversedNum*10 + num%10);
    }

    public static String reverseWord(String word) {
        if (word.length() == 0)
            return "";
        else
            return word.charAt(word.length()-1) + reverseWord(word.substring(0, word.length()-1));
    }

    public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
        if (disks == 1)
            System.out.println("Move disk 1 from " + source + " to " + destination);
        else {
            towerOfHanoi(disks-1, source, destination, auxiliary);
            System.out.println("Move disk " + disks + " from " + source + " to " + destination);
            towerOfHanoi(disks-1, auxiliary, source, destination);
        }
    }

    public static void promptAndwait()
    {
        
        Scanner in = new Scanner(System.in);
        System.out.println("\nPress any key to continue");
        String key = in.nextLine();
        System.out.print("\033[H\033[2J");  
    }
}