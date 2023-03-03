//Kyle Christian T. Novillos
//BSCS 2-1

import java.io.*;
import java.util.LinkedList;

public class Novillos_OE3
{

    public static void main(String[] args) throws Exception 
    {
        LinkedList<String> word = new LinkedList<String>();
        String sentence;
        
        InputStreamReader x = new InputStreamReader(System.in);
        BufferedReader xy = new BufferedReader(x);

        //Menu

        do
        {
            int menu_input;

            System.out.print("\033[H\033[2J]");

            System.out.println("1. Enter Elements for the Linked List");
            System.out.println("2. Add Node at beginning of the List");
            System.out.println("3. Add Node at end of the List");
            System.out.println("4. Add Node after Specified Node in List");
            System.out.println("5. Close Program");

            System.out.println("\nSelect an Option: ");
            menu_input = Integer.parseInt(xy.readLine());

            switch(menu_input)
            {
                case 1:
                {
                    System.out.println("Enter 5 words to be stored in the Linked List");

                    for(int i = 0; i < 5; i++)
                    {
                    sentence = xy.readLine();
                    word.add(sentence);
                    }

                    System.out.println("\n");
                    System.out.println(word);

                    promptAndWait();

                    break;
                }

                case 2:
                {
                    String new_word;

                    System.out.println("Enter a new word to be added to the beginning of the Linked List");
                    new_word = xy.readLine();

                    word.addFirst(new_word);
                    System.out.println("\n");
                    System.out.println(word);

                    promptAndWait();

                    break;
                }

                case 3:
                {
                    String end_word;

                    System.out.println("Enter a new word to be added at the end of the Linked List");
                    end_word = xy.readLine();

                    word.addLast(end_word);

                    System.out.println("\n");
                    System.out.println(word);

                    promptAndWait();

                    break;
                }

                case 4:
                {
                    String s_word;
                    String s_node;

                    System.out.println("Enter a word to be added after the node in the Linked List");
                    s_word = xy.readLine();

                    System.out.println("\n");
                    System.out.println(word);

                    System.out.println("Enter Specific word in the Linked List");
                    s_node = xy.readLine();

                    int node_index = word.indexOf(s_word);

                    word.add(node_index+1, s_word);

                    System.out.println("\n");
                    System.out.println(word);

                    promptAndWait();

                    break;
                }
                
                case 5:
                {
                    System.exit(0);
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