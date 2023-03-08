//Kyle Christian T. Novillos
//BSCS 2-1

import java.util.Scanner;
import java.io.*;
public class Novillos_OE4 
{
    public static void main(String[] args) 
    {
     
        do
        {
        //Main Menu

        Scanner in = new Scanner(System.in);
        System.out.println("\n\n[1] Fibonacci series number\n[2] Factorial of a number");
        System.out.println("[3] Reverse a number\n[4] Reverse a word\n[5] Tower of Hanoi\n[0] Exit the program");
        System.out.print("Select your Choice:  ");
        int input = in.nextInt();

        switch (input)
        {
            case 1:
            {
                //To input a value

                Scanner number = new Scanner(System.in);
                System.out.print("\nEnter a Number: ");
                int ot = number.nextInt();


                int fn = 0;
                int st = 1;
                System.out.print("Fibonnaci of " + ot + ": ");
                for (int i = 1; i<= ot; i++){
                System.out.print(fn + " ");
                int nt = fn + st;
                fn = st;
                st = nt;
                }
                pwait();
                break;
            }
            case 2:
            {
                //To input a value
                Scanner number = new Scanner(System.in);
                System.out.print("\nEnter a Number:  ");
                int ot = number.nextInt();
                

                int temp = 1;
                System.out.print("Factorial of " + ot + ":  ");
                for (int i = 1; i<=ot; ++i){
                    temp = temp * i;
                }
                System.out.print(temp + " ");
                pwait();
                break;
            }
            case 3:
            {
                //To input a value
                Scanner number = new Scanner(System.in);
                System.out.print("\nEnter a Number to be Reversed:  ");
                int ot = number.nextInt();


                int temp = 0;
                System.out.print("Reversed numberber of " + ot + ":  ");
                while (ot != 0){
                    int i = ot % 10;
                    temp = temp * 10 + i;
                    ot /= 10;
                }
                System.out.print(temp + " ");
                pwait();
                break;
            }
            case 4:
            {
                //To input a value
                Scanner number = new Scanner(System.in);
                System.out.print("\nEnter a Word to be Reversed:  ");
                String ot = number.nextLine();
                

                String temp="";
                System.out.print("Reversed word of " + ot + ":  ");
                for(int i = ot.length() - 1; i >= 0; i--){
                    temp = temp + ot.charAt(i);
                }
                System.out.print(temp + " ");
                pwait();
                break;
            }
            case 5:
            {
                 //To input a value
                 Scanner number = new Scanner(System.in);
                 System.out.print("\nEnter a Number:  ");
                 int ot = number.nextInt();
                Towers(ot, 'A', 'B', 'C');
                pwait();
                break;
            }
            case 0:
            {
                System.exit(0);
                break;
            }
            default:
            {
                System.out.print("Invalid Choice!");
                pwait();
            }

            
        }

        
        }while(true); 
    }
    
    public static void Towers(int topN, char from, char inter, char to) 
    {
        if (topN == 1) 
        {
           System.out.println("Disk 1 from " + from + " to " + to);
        } else {
           Towers(topN - 1, from, to, inter);
           System.out.println("Disk " + topN + " from " + from + " to " + to);
           Towers(topN - 1, inter, from, to);}
    }

    public static void pwait()
    {
        
        Scanner in = new Scanner(System.in);
        System.out.println("\nPress any key to continue");
        String key = in.nextLine();
        System.out.print("\033[H\033[2J");  
    }
}
