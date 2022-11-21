import java.io.Console;
import java.util.*;
import java.util.Scanner;


public class cardealer {
    public static void main(String[] args) {
        //Creates a HashMap with a String as key and Integer as the value it points to
        HashMap<String, Integer> toyotacars = new HashMap<>();

        //.put adds items to the hash map
        toyotacars.put("supra", 2022);
        toyotacars.put("corolla", 2021);
        toyotacars.put("camry", 2010);
        toyotacars.put("sienna", 2022);
        toyotacars.put("prius", 2022);

        //prints out words
        System.out.println("Welcome to Toyota Dealership");


        //String input = sc.nextLine();
        System.out.println("We Have supra`s, corolla's, camry's, prius`s, and The sienna");

        System.out.println("Which vehicle would you like?");
        Scanner sc = new Scanner(System.in);

        //taking input
        String input = sc.nextLine();
        int cars=toyotacars.get(input);


            if (toyotacars.containsKey(input)) {

                System.out.println("Here`s " +input+ cars );

            } else {
                System.out.println("Sorry we currently do not have any " + input + " vehicle");
            }


        }


    }




