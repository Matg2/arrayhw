import java.io.Console;
import java.util.*;
import java.util.Scanner;


public class array{
    public static void main(String[]args){
        //the array list
        ArrayList<Integer> list=new ArrayList<Integer>(5);

        //captures input
        Scanner in = new Scanner(System.in);

        //loop for input
        int i;

        for(i=0;i<5;i++){
            System.out.println("Please enter a number then press enter");
            list.add(in.nextInt());
        }
        //variables
        int sum=0;
        int product=1;
        int largest=list.get(0);
        int smallest=list.get(0);

        for(i=0;i<5;i++){
            sum +=list.get(i);
            product*= list.get(i);
            largest=Math.max(largest,list.get(i));
            smallest=Math.min(smallest, list.get(i));
        }

        System.out.println("Sum is: "+sum);
        System.out.println("product is: "+product);
        System.out.println("largest is: "+largest);
        System.out.println("smallest is: "+smallest);


    }



}

