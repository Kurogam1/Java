import java.io.*;

public class Novillos_OE1
{
    public static void main(String[] args) throws Exception
    {
        InputStreamReader X = new InputStreamReader(System.in);
        BufferedReader XY = new BufferedReader(X);

        int nums [] = new int[10];


        do
        {
            //menu

            nums[0] = 10;
            nums[1] = 20;
            nums[2] = 30;
            nums[3] = 40;
            nums[4] = 50;
            nums[5] = 60;
            nums[6] = 70;
            nums[7] = 80;
            nums[8] = 90;
            nums[9] = 100;

            int search_num;
            int delete_num;
            int position = 0;

            int length = nums.length;

            int menu_input;
            int add_element;

            System.out.print("\033[H\033[2J");
            System.out.println("1. Display Array Elements");
            System.out.println("2. Add Element in Array");
            System.out.println("3. Search Element in Array");
            System.out.println("4. Delete Element in Array");
            System.out.println("5. Exit Menu");

            System.out.print("\n Please Select an Option.");
            menu_input = Integer.parseInt(XY.readLine());


            switch (menu_input)
            {
                case 1:
                {
                    for(int index = 0; index < nums.length; index++)
                    {
                        int num = nums[index];
                        System.out.println(num);
                    }

                    String key;

                    System.out.print("Press any Key to Continue");
                    key = XY.readLine();

                    break;
                }

                case 2:
                {
                    int n = 10;

                    int nums_2 [] = new int[11];
                    nums_2[0] = 10;
                    nums_2[1] = 20;
                    nums_2[2] = 30;
                    nums_2[3] = 40;
                    nums_2[4] = 50;
                    nums_2[5] = 60;
                    nums_2[6] = 70;
                    nums_2[7] = 80;
                    nums_2[8] = 90;
                    nums_2[9] = 100;

                    System.out.print("Enter to an Element to Into The Array: ");
                    add_element = Integer.parseInt(XY.readLine());

                    nums_2[n] = add_element;

                    System.out.print("\n");

                    for(int index = 0; index < nums_2.length; index++)
                    {
                        int num = nums_2[index];
                        System.out.println(num);
                    }

                    String key;

                    System.out.print("Press any Key to Continue");
                    key = XY.readLine();

                    break;
                }

                case 3:
                {
                    System.out.print("Enter a Number to Search in The Array: ");
                    search_num = Integer.parseInt(XY.readLine());

                    for(int i = 0; i < length; i++)
                    {
                        if (nums[i] == search_num)
                        {

                            position = i;
                        }
                    }

                    System.out.println("The Positiion of the Number Selected in The Array is : " + position);

                    String key;
                    
                    System.out.print("Press any Key to Continue");
                    key = XY.readLine();

                    break;
                }

                case 4:
                {
                    System.out.print("Enter a Number in The Array you want to Delete: ");
                    delete_num = Integer.parseInt(XY.readLine());

                    int delete_position;

                    for(int i = 0; i < length; i++)
                    {
                        if (nums[i] == delete_num)
                        {
                            position = i;
                        }
                    }

                    for (int i = position; i < length; i++)
                    {
                        System.out.print(nums[i] + " ");
                    }
                    
                    String key;
                    
                    System.out.print("Press any Key to Continue");
                    key = XY.readLine();

                    break;
                }

                case 5:
                {

                    System.exit(0);
                    break;
                }


            }   

            
        } while(true);
    }
}