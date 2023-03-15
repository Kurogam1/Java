//Kyle Christian T. Novillos
//BSCS 2-1

import java.util.Scanner;

public class Novillos_PT2 {
    static Scanner scanner = new Scanner(System.in);

    static class Node {
        int data;
        Node Next;
        Node Previous;

        Node(int data) {
            this.data = data;
            this.Next = null;
            this.Previous = null;
        }
    }

    static Node Head;

    public static void main(String[] args) {
        int Input, Number;
        do {
            System.out.println("1. Insert(Create) ");
            System.out.println("2. Traverse ");
            System.out.println("3. Search ");
            System.out.println("4. Delete");
            System.out.println("5. Exit The Program");
            System.out.println("Input Number:  ");
            Input = scanner.NextInt();
            

            switch(Input) {
                case 1:
                    System.out.println("Enter A Number: ");
                    Number = scanner.NextInt();
                    create(Number);
                    promptAndwait();
                    break;

                case 2:
                    traverse();
                    promptAndwait();
                    break;

                case 3:
                    search();
                    promptAndwait();
                    break;

                case 4:
                    System.out.println("Enter A Number to be deleted: ");
                    Number = scanner.NextInt();
                    delete(Number);
                    promptAndwait();
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Please enter a valid Input.");
                    promptAndwait();
            }
        } while (Input != 5);
    }

    static void create(int Number) {
        Node pt = new Node(Number);

        if (Head == null) {
            pt.Next = null;
            pt.Previous = null;
            Head = pt;
        } else {
            pt.Previous = null;
            pt.Next = Head;
            Head.Previous = pt;
            Head = pt;
        }
        System.out.println("Node inserted.");
    }

    static void traverse() {
        if (Head == null) {
            System.out.println("Empty list.");
            return;
        }

        System.out.print("List: ");
        Node pt = Head;
        while (pt != null) {
            System.out.print(pt.data + " ");
            pt = pt.Next;
        }
        System.out.println();
    }

    static void search() {
        if (Head == null) {
            System.out.println("Empty list.");
            return;
        }

        System.out.println("Enter Number to be searched: ");
        int Number = scanner.NextInt();
        Node pt = Head;
        int i = 1;
        boolean flag = false;
        while (pt != null) {
            if (pt.data == Number) {
                System.out.println("Number found at location " + i);
                flag = true;
                break;
            }
            i++;
            pt = pt.Next;
        }
        if (!flag) {
            System.out.println("Number not found.");
        }
    }

    static void delete(int Number) {
        if (Head == null) {
            System.out.println("Empty list.");
            return;
        }

        Node pt = Head;
        while (pt != null && pt.data != Number) {
            pt = pt.Next;
        }
        if (pt == null) {
            System.out.println("Number not found.");
            return;
        }
        if (pt == Head) {
            Head = Head.Next;
            if (Head != null) {
                Head.Previous = null;
            }
        } else if (pt.Next == null) {
            pt.Previous.Next = null;
        } else {
            pt.Previous.Next = pt.Next;
            pt.Next.Previous = pt.Previous;
        }
        System.out.println("Node deleted.");
    }

    public static void promptAndwait()
    {
        
        Scanner in = new Scanner(System.in);
        System.out.println("\nPress any key to continue");
        String key = in.NextLine();
        System.out.print("\033[H\033[2J");  
    }
}