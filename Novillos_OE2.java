//Kyle Christian T. Novillos
//BSCS 2-1

import java.io.*;
import java.util.Scanner;

public class Novillos_OE2
{

    public static void main (String [] args) throws Exception
    {
       
        int leng;
        int ITC = 1;
    
        InputStreamReader x = new InputStreamReader(System.in);
        BufferedReader xy = new BufferedReader(x);

        do
        { 
            int menu_input;


            System.out.print("\033[H\033[2J");
            System.out.print("Enter the size of the array: ");
            leng = Integer.parseInt(xy.readLine());

            int[] number = new int [leng];


            System.out.println("Enter the elements of the array: ");  
            for(int i=0; i<leng; i++)  
            {  
                //reading array elements from the user   
                number[i]=Integer.parseInt(xy.readLine()); 
            }  
            
            //Main Menus

            System.out.println("1. Insertion Sort");
            System.out.println("2. Bubble Sort");
            System.out.println("3. Exit ");

            System.out.print("\nSelect an Option: ");
            menu_input = Integer.parseInt(xy.readLine());

            switch(menu_input)
            {

                case 1:
                {

                    for (int i = 1; i < leng; ++i) 
                    {
                        int key = number[i];
                        int j = i - 1;
             
                        /* Move elements of arr[0..i-1], that are
                           greater than key, to one position ahead
                           of their current position */
                        while (j >= 0 && number[j] > key) 
                        {
                            number[j + 1] = number[j];
                            j = j - 1;
                        }
                        number[j + 1] = key;

                        System.out.print("\nIteration No." +(i+1)+ " ->  ");
                        for(j=0; j<leng; j++)
                        {
                           System.out.print(number[j]+ " ");
                        }
                    }
                    

                    System.out.println("\nFinal sorted array is:");
                    for(int i=0; i<leng; i++)
                    {
                        System.out.print(number[i]+ " ");
                    }

                    promptAndWait();
                    break;
                }

                case 2:
                {

                    for(int i=0; i<(leng-1); i++)
                    {
                       for(int j=0; j<(leng-i-1); j++)
                       {
                          if(number[j]>number[j+1])
                          {
                             int temp = number[j];
                             number[j] = number[j+1];
                             number[j+1] = temp;
                          }
                       }
                       System.out.print("\nIteration No." +(i+1)+ " ->  ");
                       for(int j=0; j<leng; j++)
                       {
                          System.out.print(number[j]+ " ");
                       }

                       
                    }

                    System.out.println("\nFinal sorted array is:");
                    for(int i=0; i<leng; i++)
                    {
                        System.out.print(number[i]+ " ");
                    }

                    promptAndWait();
                    break;
                }

            }

        }while(true);
    }

    public static void promptAndWait() throws Exception 
    {

        InputStreamReader x = new InputStreamReader(System.in);
        BufferedReader xy = new BufferedReader(x);

        String key;

        System.out.print("\nPress any key to continue");
        key = xy.readLine();

    }
}
