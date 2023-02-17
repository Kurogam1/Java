//Kyle Christian T. Novillos
//BSCS 2-1

import java.io.*;

public class Novillos_PT1 
{

    public static void main (String[] args) throws Exception {

        InputStreamReader a = new InputStreamReader(System.in);
        BufferedReader ab = new BufferedReader(a);

        do
        {

            int menu_input;

            System.out.print("\033[H\033[2J");

            System.out.println("1. Stack Array");
            System.out.println("2. Queue Array");
            System.out.println("3. Exit The Program");

            System.out.print("\nSelect an Option: ");
            menu_input = Integer.parseInt(ab.readLine());

            switch(menu_input)
            {

                case 1:
                
                {

                    int Num [] = new int [5];

                    System.out.println("Enter 5 elements of the array: ");
                    for (int i = 0; i < Num.length; i++) 
                    {
                        Num[i] = Integer.parseInt(ab.readLine());
                    }

                    //Stack Object
                    Stack Stack = new Stack();
                    System.out.println("Initial Stack Empty : " + Stack.isEmpty());

                    //Push Elements
                    Stack.push(Num[0]);
                    Stack.push(Num[1]);
                    Stack.push(Num[2]);
                    Stack.push(Num[3]);
                    Stack.push(Num[4]);
                    System.out.println("After Push Operation...");

                    //Printout Elements
                    System.out.println("Element at the top of the stack " + Stack.peek());
                    Stack.display();
                    promptAndWait();

                    //Pop 2 Elements
                    Stack.pop();
                    Stack.pop();
                    System.out.println("\nAfter Pop Operation...");
                    
                    //print Stack
                    Stack.display();

                    promptAndWait();

                    break;
                }

                case 2:
                {

                    int Num [] = new int [4];

                    System.out.println("Enter 4 elements of the array: ");
                    for (int i = 0; i < Num.length; i++) 
                    {
                     
                        Num[i] = Integer.parseInt(ab.readLine());
                    }

                    //Que Capacity
                    Queue Que = new Queue(4); 
            
                    System.out.println("Initial Queue:");
                     //Queue elements 
                    Que.QueDisplay(); 
            
                    //Elements in Que 
                    Que.QueEnQue(Num[0]); 
                    Que.QueEnQue(Num[1]); 
                    Que.QueEnQue(Num[2]); 
                    Que.QueEnQue(Num[3]); 
            
                    //Queue elements 
                    System.out.println("Queue after EnQue Operation:");
                    Que.QueDisplay(); 
            
                    //Top of the Que 
                    Que.QueFront(); 
                    
                    //Element in the Que 
                    Que.QueEnQue(90); 
            
                    //Queue elements 
                    Que.QueDisplay(); 
            
                    Que.QueDeQue(); 
                    Que.QueDeQue(); 
                    System.out.printf("\nQueue after two deQue operations:"); 
            
                    //Queue elements 
                    Que.QueDisplay(); 
            
                    //Top of the Que 
                    Que.QueFront(); 

                    promptAndWait();

                    break;

                }

                case 3:
                {
                    System.exit(0);
                    break;
                }
            }
        }while(true);


    }

    public static void promptAndWait() throws Exception 
    {

        InputStreamReader a = new InputStreamReader(System.in);
        BufferedReader ab = new BufferedReader(a);

        String key;

        System.out.print("\nPress any key to continue");
        key = ab.readLine();

    }

    //Stack
    public static class Stack 
    {  
        int top;           
        int maxsize = 5;     
        int[] StackArray = new int[maxsize];  
    
        Stack()
        {           
            top = -1;  
        }    

        boolean isEmpty()
        {         
            return (top < 0);  
        }  

        boolean push (int val)
        {     
                if(top == maxsize-1) 
                {  
                    System.out.println("Stack Overflow !!");  
                    return false;  
                }  
                else 
                 {  
                    top++;  
                    StackArray[top]=val;  
                    return true;  
                }  
            }  

        boolean pop () 
        {            
            if (top == -1) 
            {  
                System.out.println("Stack Underflow !!");  
                return false;  
            }  
            else   
            {  
                
                System.out.println("\nItem popped: " + StackArray[top--]);  
                return true;  
            }  
        }  

        int peek()
        {
            return StackArray[top];
        }

        void display () 
        {           
            System.out.println("Printing stack elements .....");  
            for(int i = top; i>=0;i--) 
            {  
                System.out.print(StackArray[i] + " ");  
            }  
         }  

    }  

    //Queue
    public static class Queue 
    { 
        private static int Top, bottom, capacity; 
        private static int Que[]; 
       
        Queue(int size) 
        { 
            Top = bottom = 0; 
            capacity = size; 
            Que = new int[capacity]; 
        } 
       
        static void QueEnQue(int item)  
        { 
           
            if (capacity == bottom) { 
                System.out.printf("\nQueue is full\n"); 
                return; 
            } 
       
            else { 
                Que[bottom] = item; 
                bottom++; 
            } 
            return; 
        } 
       
        static void QueDeQue()  
        { 
          
            if (Top == bottom) 
            { 
                System.out.printf("\nQueue is empty\n"); 
                return; 
            } 
     
            else 
            { 
                for (int i = 0; i < bottom - 1; i++)
                { 
                    Que[i] = Que[i + 1]; 
                } 
       
                if (bottom < capacity) 
                    Que[bottom] = 0; 
       
                
                bottom--; 
            } 
            return; 
        } 
       
        static void QueDisplay() 
        { 
            int i; 
            if (Top == bottom) 
            { 
                System.out.printf("Queue is Empty\n"); 
                return; 
            } 
       
            for (i = Top; i < bottom; i++) 
            { 
                System.out.printf(" %d = ", Que[i]); 
            } 
            return; 
        } 
        
        static void QueFront() 
        { 
            if (Top == bottom) 
            { 
                System.out.printf("Queue is Empty\n"); 
                return; 
            } 
            System.out.printf("\nTop Element of the Que: %d", Que[Top]); 
            return; 
        } 
    } 

}
