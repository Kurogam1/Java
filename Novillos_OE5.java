//Kyle Christian T. Novillos
//BSCS 2-1

import java.util.Scanner;

public class Novillos_OE5 {

    public static int QSort(int[] array, int low, int high) {
            int pivot = array[high];
            int L = low - 1;
            
            for (int i = low; i <= high-1; i++) {
                if (array[i] <= pivot) {
                    L++;
                    int temp = array[L];
                    array[L] = array[i];
                    array[i] = temp;
                }
            }
            
            int temp = array[L+1];
            array[L+1] = array[high];
            array[high] = temp;
            
            return L+1;
        }

    public static void Sort(int[] arrayay, int low, int high) {
        if (low < high) {
            int Index = QSort(arrayay, low, high);
            Sort(arrayay, low, Index-1);
            Sort(arrayay, Index+1, high);
        }
    }
      
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("\nEnter arrayay size: ");
        int n = scan.nextInt();
        
        int[] array = new int[n];
        System.out.print("\nEnter unsorted arrayay elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        
        Sort(array, 0, n-1);
        
        System.out.println("Sorted arrayay: ");
        for (int i = 0; i < n; i++) {
            System.out.println("[" + array[i] + "]");
        }
    }
    
    
}