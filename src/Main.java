import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String linebreak = "**************************************************\n";
        String equals = " = ";
        String[] crustIN = {"a.\tregular crust", "b.\tgluten-free crust"};
        String[] sauceIN = {"a.\tred sauce", "b.\tno red sauce"};
        String[] sauceInUnit = {"a.\t1/8 cup", "b.\t1/4 cup"};
        String[] ingredientsIN = {"a.\tpizza cheese", "b.\tdiced red onion", "c.\tdiced green pepper", "d.\tpepperoni", "e.\tsliced mushrooms", "f.\tdiced jalapenos", "g.\tsardines", "h.\tpineapple chunks", "i.\ttofu", "j.\tham chunks", "k.\tdried red pepper", "l.\tdried basil"};

        String[] units = {"each", "2 pieces", "4 pieces", "1/8 cup", "1/4 cup", "generous sprinkle", "2 generous sprinkles"};

        String[] crustOUT = new String[1];
        String[] sauceOUT = new String[1];
        String[] ingredientsOUT = new String[6];
        String[] crustUNIT = new String[1];
        String[] sauceUNIT = new String[1];
        String[] ingredientsUNIT = new String[6];

        String choice = "Enter choice: ";
        String response = "You chose:\t\t\t";
        String item;
        int counter = 0;
        Boolean done;

//      TODO: Crust Selection section
//        Completed 11/5/2022

        System.out.println(linebreak);
        System.out.println("Please choose one crust option: " + "\n");
        System.out.printf("%-25s%-25s", crustIN[0], crustIN[1]);
        System.out.println("\n");
        System.out.print(choice);
        item = input.next();
        if (item.equals("a")) {
            crustOUT[0] = crustIN[0];
            crustUNIT[0] = units[0];
            System.out.println(response + crustOUT[0] + " = 1 " + crustUNIT[0]);
        } else if (item.equals("b")) {
            crustOUT[0] = crustIN[1];
            crustUNIT[0] = units[0];
            System.out.println(response + crustOUT[0] + " = 1 " + crustUNIT[0]);
        }
        counter++;
//      The following line is an ingredient counter. Remove before submission.
        System.out.println("Counter: " + counter);
        System.out.println(linebreak);

//      TODO: Sauce Selection section
//          Completed: 11/5/2022

        System.out.println("Please select one sauce option: \n");
        System.out.printf("%-25s%-25s", sauceIN[0], sauceIN[1]);
        System.out.println("\n");
        System.out.print(choice);
        item = input.next();

        if (item.equals("a")) {
            sauceOUT[0] = sauceIN[0];
            System.out.println("Please choose one amount: \n");
            System.out.printf("%-25s%-25s", sauceInUnit[0], sauceInUnit[1]);
            System.out.println("\n");
            System.out.print(choice);
            item = input.next();
            if (item.equals("a")) {
                sauceUNIT[0] = sauceInUnit[0];
                System.out.println(response + sauceOUT[0] + equals + units[3]);
            }
            if (item.equals("b")) {
                sauceUNIT[0] = sauceInUnit[1];
                System.out.println(response + sauceOUT[0] + equals + units[4]);
            }
            counter++;
        }
        else if(item.equals("b")) {
            sauceOUT[0] = sauceIN[1];
            System.out.println(response + sauceOUT[0]);
        }



        //      The following line is an ingredient counter. Remove before submission.
        System.out.println("Counter: " + counter);
        System.out.println(linebreak);

//        TODO: Topping Section
//            Completed:
//        While loop for !done and counter < 8?
//            Conditional for if item already exists in topping array

//        ***Would you like to add another ingredient section (within Topping Section)
//            Change value of boolean done based on answer. Default is !done;
//        TODO: Recipe Output Section
//            Completed:


        /* Recipe Output section



//        Include: " * Pizza is to be appropriately cooked until crust is cooked and toppings are warmed *

         */


        }
    }
