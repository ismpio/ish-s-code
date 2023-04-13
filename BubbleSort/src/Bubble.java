/**
 * Hello testing github through the command line, if you see this, ssh github works
 */

import java.util.*;
public class Bubble
{
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }

    public static void main(String[] args) {

    //int [] randArray[]= {3,60,35,2,45,320,5};
    Scanner s = new Scanner(System.in);

    System.out.println("How many integers would you like to enter?");

    int count = s.nextInt();

    //s.close();

    int [] randArray = new int[count];

    System.out.println("Enter the integers separated by ENTER key");

    Scanner s2 = new Scanner(System.in);

    for(int i=0; i<count; i++)
    {
        randArray[i] = s2.nextInt();
    }

    //s2.close();



        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < randArray.length; i++){
            System.out.print(randArray[i] + " ");
        }
        System.out.println();

        bubbleSort(randArray);//sorting array elements using bubble sort

        System.out.println("Array After Bubble Sort");
        for(int i=0; i < randArray.length; i++){
            System.out.print(randArray[i] + " ");
        }
/**
        System.out.println("Number of Command Line Argument = "+args.length);

        for(int i = 0; i< args.length; i++) {
            System.out.println(String.format("Command Line Argument %d is %s", i, args[i]));
        }
 */

    }
}
