import java.util.Arrays;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String linebreak = "********************************************************************************\n";
        String lt = "*  ";
        String rt = "  *";
        String equals = " = ";
        String choice = "Enter choice: ";
        String amount = "Please choose one amount: \n";
        String response = "You chose:\t\t";
        String[] cont = {"yes", "no"};
        String selection;
        int maxToppings = 9;
        int i;
        int counter = 0;
        boolean done = false;

        String[] crustOption = {"regular crust", "gluten-free crust"};
        String[] sauceOption = {"red sauce", "no red sauce"};

        String[] ingredients = {"pizza cheese", "diced red onion", "diced green pepper", "pepperoni", "sliced mushrooms", "diced jalapenos", "sardines", "pineapple chunks", "tofu", "ham chunks", "dried red pepper", "dried basil"};

        String[] units = {"each", "1/8 cup", "1/4 cup", "1/2 cup", "generous sprinkle", "2 generous sprinkles", "2 pieces", "4 pieces", "6 pieces", "8 pieces", "1 each", "2 each", "3 each", "4 each", "12 pieces", "16 pieces", "3 generous sprinkles", "4 generous sprinkles"};

        String[] ingredientArray = new String[maxToppings];
        String[] qtyArray = new String[maxToppings];


//      TODO: initialize ingredientArray & qtyArray with null for each value. This will allow to test for !null values in the recipe output

        for (i = 0; i < maxToppings; i++) {
            ingredientArray[i] = null;
            qtyArray[i] = null;
        }

//        Crust and sauce selection must take place out of the loop, as they are only selected once.

//      TODO: Crust Selection section
//        Completed 11/5/2022

        System.out.println(linebreak);
        System.out.println("Please choose one crust option: " + "\n");
        System.out.printf("a.\t%-20s" + "b.\t%-20s", crustOption[0], crustOption[1]);
        System.out.println("\n");
        System.out.print(choice);
        selection = input.next();
        selection = selection.toLowerCase();

        //        TODO: input validation: completed 11/7/2022
        while(!selection.equals("a") && !selection.equals("b")) {
            System.out.println("Invalid selection.");
            System.out.println("Please choose one crust option: " + "\n");
            System.out.printf("a.\t%-20s" + "b.\t%-20s", crustOption[0], crustOption[1]);
            System.out.println("\n");
            System.out.print(choice);
            selection = input.next();
            selection = selection.toLowerCase();
        }

        if (selection.equals("a")) {
            ingredientArray[0] = crustOption[0];
        } else {
            ingredientArray[0] = crustOption[1];
        }

        qtyArray[0] = units[10];

        System.out.println(lt + response + ingredientArray[0] + equals + qtyArray[0] + rt);
        counter++;

        System.out.println(linebreak);

//      TODO: Sauce Selection section
//          Completed: 11/6/2022

        System.out.println("Please select one sauce option: \n");
        System.out.printf("a.\t%-20s" + "b.\t%-20s", sauceOption[0], sauceOption[1]);
        System.out.println("\n");
        System.out.print(choice);
        selection = input.next();
        selection = selection.toLowerCase();

        //        TODO: input validation: completed 11/7/2022
        while(!selection.equals("a") && !selection.equals("b")) {
            System.out.println("Invalid selection.");
            System.out.println("Please select one sauce option: \n");
            System.out.printf("a.\t%-20s" + "b.\t%-20s", sauceOption[0], sauceOption[1]);
            System.out.println("\n");
            System.out.print(choice);
            selection = input.next();
            selection = selection.toLowerCase();
        }

        if (selection.equals("a")) {
            ingredientArray[1] = sauceOption[0];
            System.out.println(amount);
            System.out.printf("a.\t%-25s" + "b.\t%-25s", units[2], units[3]);
            System.out.println("\n");
            System.out.print(choice);
            selection = input.next();
            selection = selection.toLowerCase();

            //        TODO: input validation: completed 11/7/2022
            while(!selection.equals("a") && !selection.equals("b")) {
                System.out.println("Invalid selection.");
                System.out.println(amount);
                System.out.printf("a.\t%-25s" + "b.\t%-25s", units[2], units[3]);
                System.out.println("\n");
                System.out.print(choice);
                selection = input.next();
                selection = selection.toLowerCase();

            }

            if (selection.equals("a")) {
                qtyArray[1] = units[2];
            }
            if (selection.equals("b")) {
                qtyArray[1] = units[3];
            }
            System.out.println(lt + response + ingredientArray[1] + equals + qtyArray[1] + rt);
            counter++;

        } else {
            System.out.println(lt + response + sauceOption[1] + rt);
        }

        System.out.println(linebreak);

//        TODO: Topping Section
//            Completed: 11/7/2022

//        TODO: while loop to check total number of ingredients (counter) and add another topping yes/no - completed 11/6/2022
//        Starts at index 2 to account for crust and sauce placeholders, these ingredient options are not present in the toppings loop

        while (counter < 8 && !done) {
            for (i = 2; i < maxToppings; i++) {

                System.out.println("Please choose one ingredient option: \n");
                System.out.printf("a.\t%-25s" + "b.\t%-25s" + "c.\t%-25s\n", ingredients[0], ingredients[1], ingredients[2]);
                System.out.printf("d.\t%-25s" + "e.\t%-25s" + "f.\t%-25s\n", ingredients[3], ingredients[4], ingredients[5]);
                System.out.printf("g.\t%-25s" + "h.\t%-25s" + "i.\t%-25s\n", ingredients[6], ingredients[7], ingredients[8]);
                System.out.printf("j.\t%-25s" + "k.\t%-25s" + "l.\t%-25s", ingredients[9], ingredients[10], ingredients[11]);
                System.out.println("\n");
                System.out.print(choice);
                selection = input.next();
                selection = selection.toLowerCase();

                char[] letters = new char[12];

                for (i = 0; i < letters.length; i++) {
                    letters[i] = (char) ('a' + i);
                }

//                TODO: input validation for ingredient letter selection - completed 11/8/2022
                while (!Arrays.toString(letters).contains(selection)) {
                    System.out.println("Invalid selection.");
                    System.out.println("Please choose one ingredient option: \n");
                    System.out.printf("a.\t%-25s" + "b.\t%-25s" + "c.\t%-25s\n", ingredients[0], ingredients[1], ingredients[2]);
                    System.out.printf("d.\t%-25s" + "e.\t%-25s" + "f.\t%-25s\n", ingredients[3], ingredients[4], ingredients[5]);
                    System.out.printf("g.\t%-25s" + "h.\t%-25s" + "i.\t%-25s\n", ingredients[6], ingredients[7], ingredients[8]);
                    System.out.printf("j.\t%-25s" + "k.\t%-25s" + "l.\t%-25s", ingredients[9], ingredients[10], ingredients[11]);
                    System.out.println("\n");
                    System.out.print(choice);
                    selection = input.next();
                    selection = selection.toLowerCase();
                }

//TODO: implement validation for if topping name already exists in ingredientArray. If so, return error message and prompt for new selection. Completed 11/7/2022

                switch (selection) {
                    case "a":

                        if(Arrays.toString(ingredientArray).contains(ingredients[0])) {
                            System.out.println("Topping has previously been chosen. Please make a new selection.");
                            break;
                        }
//                      checks to see if array index is already populated with a value. If true, searches for the next null value and pushes ingredient name to the array. Begins at [2] to account for crust and sauce placeholders.

                        for (i = 2; i < maxToppings; i++) {
                            if (ingredientArray[i] == null) {
                                ingredientArray[i] = ingredients[0];
                                System.out.println(amount);
                                System.out.printf("a.\t%-25s" + "b.\t%-25s", units[2], units[3]);
                                System.out.println("\n");
                                System.out.print(choice);
                                selection = input.next();
                                selection = selection.toLowerCase();


                                while(!selection.equals("a") && !selection.equals("b")) {
                                    System.out.println("Invalid selection.");
                                    System.out.println(amount);
                                    System.out.printf("a.\t%-25s" + "b.\t%-25s", units[2], units[3]);
                                    System.out.println("\n");
                                    System.out.print(choice);
                                    selection = input.next();
                                    selection = selection.toLowerCase();
                                }

                                if (selection.equals("a")) {
                                    qtyArray[i] = units[2];
                                }
                                if (selection.equals("b")) {
                                    qtyArray[i] = units[3];
                                }

                                System.out.println(lt + response + ingredientArray[i] + equals + qtyArray[i] + rt);
                                counter++;
                                break;
                            }
                        }
                        break;

                    case "b":

                        if(Arrays.toString(ingredientArray).contains(ingredients[1])) {
                            System.out.println("Topping has previously been chosen. Please make a new selection.");
                            break;
                        }

                        for (i = 2; i < maxToppings; i++) {
                            if (ingredientArray[i] == null) {
                                ingredientArray[i] = ingredients[1];
                                System.out.println(amount);
                                System.out.printf("a.\t%-25s" + "b.\t%-25s", units[1], units[2]);
                                System.out.println("\n");
                                System.out.print(choice);
                                selection = input.next();
                                selection = selection.toLowerCase();

                                while(!selection.equals("a") && !selection.equals("b")) {
                                    System.out.println("Invalid selection.");
                                    System.out.println(amount);
                                    System.out.printf("a.\t%-25s" + "b.\t%-25s", units[1], units[2]);
                                    System.out.println("\n");
                                    System.out.print(choice);
                                    selection = input.next();
                                    selection = selection.toLowerCase();
                                }

                                if (selection.equals("a")) {
                                    qtyArray[i] = units[1];
                                }
                                if (selection.equals("b")) {
                                    qtyArray[i] = units[2];
                                }

                                System.out.println(lt + response + ingredientArray[i] + equals + qtyArray[i] + rt);
                                counter++;
                                break;
                            }
                        }
                        break;

                    case "c":

                        if(Arrays.toString(ingredientArray).contains(ingredients[2])) {
                            System.out.println("Topping has previously been chosen. Please make a new selection.");
                            break;
                        }

                        for (i = 2; i < maxToppings; i++) {
                            if (ingredientArray[i] == null) {
                                ingredientArray[i] = ingredients[2];
                                System.out.println(amount);
                                System.out.printf("a.\t%-25s" + "b.\t%-25s", units[1], units[2]);
                                System.out.println("\n");
                                System.out.print(choice);
                                selection = input.next();
                                selection = selection.toLowerCase();

                                while(!selection.equals("a") && !selection.equals("b")) {
                                    System.out.println("Invalid selection.");
                                    System.out.println(amount);
                                    System.out.printf("a.\t%-25s" + "b.\t%-25s", units[1], units[2]);
                                    System.out.println("\n");
                                    System.out.print(choice);
                                    selection = input.next();
                                    selection = selection.toLowerCase();
                                }

                                if (selection.equals("a")) {
                                    qtyArray[i] = units[1];
                                }
                                if (selection.equals("b")) {
                                    qtyArray[i] = units[2];
                                }

                                System.out.println(lt + response + ingredientArray[i] + equals + qtyArray[i] + rt);
                                counter++;
                                break;
                            }
                        }
                        break;

                    case "d":

                        if(Arrays.toString(ingredientArray).contains(ingredients[3])) {
                            System.out.println("Topping has previously been chosen. Please make a new selection.");
                            break;
                        }

                        for (i = 2; i < maxToppings; i++) {
                            if (ingredientArray[i] == null) {
                                ingredientArray[i] = ingredients[3];
                                System.out.println(amount);
                                System.out.printf("a.\t%-25s" + "b.\t%-25s" + "c.\t%-25s\n" + "d.\t%-25s",units[6], units[7], units[8], units[9]);
                                System.out.println("\n");
                                System.out.print(choice);
                                selection = input.next();
                                selection = selection.toLowerCase();

                                while(!selection.equals("a") && !selection.equals("b") && !selection.equals("c") && !selection.equals("d")) {
                                    System.out.println("Invalid selection.");
                                    System.out.println(amount);
                                    System.out.printf("a.\t%-25s" + "b.\t%-25s" + "c.\t%-25s\n" + "d.\t%-25s",units[6], units[7], units[8], units[9]);
                                    System.out.println("\n");
                                    System.out.print(choice);
                                    selection = input.next();
                                    selection = selection.toLowerCase();
                                }

                                if (selection.equals("a")) {
                                    qtyArray[i] = units[6];
                                }
                                if (selection.equals("b")) {
                                    qtyArray[i] = units[7];
                                }
                                if(selection.equals("c")) {
                                    qtyArray[i] = units[8];
                                }
                                if(selection.equals("d")) {
                                    qtyArray[i] = units[9];
                                }

                                System.out.println(lt + response + ingredientArray[i] + equals + qtyArray[i] + rt);
                                counter++;
                                break;
                            }
                        }
                        break;

                    case "e":

                        if(Arrays.toString(ingredientArray).contains(ingredients[4])) {
                            System.out.println("Topping has previously been chosen. Please make a new selection.");
                            break;
                        }

                        for (i = 2; i < maxToppings; i++) {
                            if (ingredientArray[i] == null) {
                                ingredientArray[i] = ingredients[4];
                                System.out.println(amount);
                                System.out.printf("a.\t%-25s" + "b.\t%-25s", units[1], units[2]);
                                System.out.println("\n");
                                System.out.print(choice);
                                selection = input.next();
                                selection = selection.toLowerCase();

                                while(!selection.equals("a") && !selection.equals("b")) {
                                    System.out.println("Invalid selection.");
                                    System.out.println(amount);
                                    System.out.printf("a.\t%-25s" + "b.\t%-25s", units[1], units[2]);
                                    System.out.println("\n");
                                    System.out.print(choice);
                                    selection = input.next();
                                    selection = selection.toLowerCase();
                                }

                                if (selection.equals("a")) {
                                    qtyArray[i] = units[1];
                                }
                                if (selection.equals("b")) {
                                    qtyArray[i] = units[2];
                                }

                                System.out.println(lt + response + ingredientArray[i] + equals + qtyArray[i] + rt);
                                counter++;
                                break;
                            }
                        }
                        break;

                    case "f":

                        if(Arrays.toString(ingredientArray).contains(ingredients[5])) {
                            System.out.println("Topping has previously been chosen. Please make a new selection.");
                            break;
                        }

                        for (i = 2; i < maxToppings; i++) {
                            if (ingredientArray[i] == null) {
                                ingredientArray[i] = ingredients[5];
                                System.out.println(amount);
                                System.out.printf("a.\t%-25s" + "b.\t%-25s", units[1], units[2]);
                                System.out.println("\n");
                                System.out.print(choice);
                                selection = input.next();
                                selection = selection.toLowerCase();

                                while(!selection.equals("a") && !selection.equals("b")) {
                                    System.out.println("Invalid selection.");
                                    System.out.println(amount);
                                    System.out.printf("a.\t%-25s" + "b.\t%-25s", units[1], units[2]);
                                    System.out.println("\n");
                                    System.out.print(choice);
                                    selection = input.next();
                                    selection = selection.toLowerCase();
                                }

                                if (selection.equals("a")) {
                                    qtyArray[i] = units[1];
                                }
                                if (selection.equals("b")) {
                                    qtyArray[i] = units[2];
                                }

                                System.out.println(lt + response + ingredientArray[i] + equals + qtyArray[i] + rt);
                                counter++;
                                break;
                            }
                        }
                        break;

                    case "g":

                        if(Arrays.toString(ingredientArray).contains(ingredients[6])) {
                            System.out.println("Topping has previously been chosen. Please make a new selection.");
                            break;
                        }

                        for (i = 2; i < maxToppings; i++) {
                            if (ingredientArray[i] == null) {
                                ingredientArray[i] = ingredients[6];
                                System.out.println(amount);
                                System.out.printf("a.\t%-25s" + "b.\t%-25s" + "c.\t%-25s\n" + "d.\t%-25s",units[10], units[11], units[12], units[13]);
                                System.out.println("\n");
                                System.out.print(choice);
                                selection = input.next();
                                selection = selection.toLowerCase();

                                while(!selection.equals("a") && !selection.equals("b") && !selection.equals("c") && !selection.equals("d")) {
                                    System.out.println("Invalid selection.");
                                    System.out.println(amount);
                                    System.out.printf("a.\t%-25s" + "b.\t%-25s" + "c.\t%-25s\n" + "d.\t%-25s",units[10], units[11], units[12], units[13]);
                                    System.out.println("\n");
                                    System.out.print(choice);
                                    selection = input.next();
                                    selection = selection.toLowerCase();
                                }

                                if (selection.equals("a")) {
                                    qtyArray[i] = units[10];
                                }
                                if (selection.equals("b")) {
                                    qtyArray[i] = units[11];
                                }
                                if(selection.equals("c")) {
                                    qtyArray[i] = units[12];
                                }
                                if(selection.equals("d")) {
                                    qtyArray[i] = units[13];
                                }

                                System.out.println(lt + response + ingredientArray[i] + equals + qtyArray[i] + rt);
                                counter++;
                                break;
                            }
                        }
                        break;

                    case "h":

                        if(Arrays.toString(ingredientArray).contains(ingredients[7])) {
                            System.out.println("Topping has previously been chosen. Please make a new selection.");
                            break;
                        }

                        for (i = 2; i < maxToppings; i++) {
                            if (ingredientArray[i] == null) {
                                ingredientArray[i] = ingredients[7];
                                System.out.println(amount);
                                System.out.printf("a.\t%-25s" + "b.\t%-25s" + "c.\t%-25s\n" + "d.\t%-25s",units[6], units[7], units[8], units[9]);
                                System.out.println("\n");
                                System.out.print(choice);
                                selection = input.next();
                                selection = selection.toLowerCase();

                                while(!selection.equals("a") && !selection.equals("b") && !selection.equals("c") && !selection.equals("d")) {
                                    System.out.println("Invalid selection.");
                                    System.out.println(amount);
                                    System.out.printf("a.\t%-25s" + "b.\t%-25s" + "c.\t%-25s\n" + "d.\t%-25s",units[6], units[7], units[8], units[9]);
                                    System.out.println("\n");
                                    System.out.print(choice);
                                    selection = input.next();
                                    selection = selection.toLowerCase();
                                }

                                if (selection.equals("a")) {
                                    qtyArray[i] = units[6];
                                }
                                if (selection.equals("b")) {
                                    qtyArray[i] = units[7];
                                }
                                if(selection.equals("c")) {
                                    qtyArray[i] = units[8];
                                }
                                if(selection.equals("d")) {
                                    qtyArray[i] = units[9];
                                }

                                System.out.println(lt + response + ingredientArray[i] + equals + qtyArray[i] + rt);
                                counter++;
                                break;
                            }
                        }
                        break;

                    case "i":

                        if(Arrays.toString(ingredientArray).contains(ingredients[8])) {
                            System.out.println("Topping has previously been chosen. Please make a new selection.");
                            break;
                        }

                        for (i = 2; i < maxToppings; i++) {
                            if (ingredientArray[i] == null) {
                                ingredientArray[i] = ingredients[8];
                                System.out.println(amount);
                                System.out.printf("a.\t%-25s" + "b.\t%-25s", units[2], units[3]);
                                System.out.println("\n");
                                System.out.print(choice);
                                selection = input.next();
                                selection = selection.toLowerCase();

                                while(!selection.equals("a") && !selection.equals("b")) {
                                    System.out.println("Invalid selection.");
                                    System.out.println(amount);
                                    System.out.printf("a.\t%-25s" + "b.\t%-25s", units[2], units[3]);
                                    System.out.println("\n");
                                    System.out.print(choice);
                                    selection = input.next();
                                    selection = selection.toLowerCase();
                                }

                                if (selection.equals("a")) {
                                    qtyArray[i] = units[2];
                                }
                                if (selection.equals("b")) {
                                    qtyArray[i] = units[3];
                                }

                                System.out.println(lt + response + ingredientArray[i] + equals + qtyArray[i] + rt);
                                counter++;
                                break;
                            }
                        }
                        break;

                    case "j":

                        if(Arrays.toString(ingredientArray).contains(ingredients[9])) {
                            System.out.println("Topping has previously been chosen. Please make a new selection.");
                            break;
                        }

                        for (i = 2; i < maxToppings; i++) {
                            if (ingredientArray[i] == null) {
                                ingredientArray[i] = ingredients[9];
                                System.out.println(amount);
                                System.out.printf("a.\t%-25s" + "b.\t%-25s" + "c.\t%-25s\n" + "d.\t%-25s",units[7], units[9], units[14], units[15]);
                                System.out.println("\n");
                                System.out.print(choice);
                                selection = input.next();
                                selection = selection.toLowerCase();

                                while(!selection.equals("a") && !selection.equals("b") && !selection.equals("c") && !selection.equals("d")) {
                                    System.out.println("Invalid selection.");
                                    System.out.println(amount);
                                    System.out.printf("a.\t%-25s" + "b.\t%-25s" + "c.\t%-25s\n" + "d.\t%-25s",units[7], units[9], units[14], units[15]);
                                    System.out.println("\n");
                                    System.out.print(choice);
                                    selection = input.next();
                                    selection = selection.toLowerCase();
                                }

                                if (selection.equals("a")) {
                                    qtyArray[i] = units[7];
                                }
                                if (selection.equals("b")) {
                                    qtyArray[i] = units[9];
                                }
                                if(selection.equals("c")) {
                                    qtyArray[i] = units[14];
                                }
                                if(selection.equals("d")) {
                                    qtyArray[i] = units[15];
                                }

                                System.out.println(lt + response + ingredientArray[i] + equals + qtyArray[i] + rt);
                                counter++;
                                break;
                            }
                        }
                        break;

                    case "k":

                        if(Arrays.toString(ingredientArray).contains(ingredients[10])) {
                            System.out.println("Topping has previously been chosen. Please make a new selection.");
                            break;
                        }

                        for (i = 2; i < maxToppings; i++) {
                            if (ingredientArray[i] == null) {
                                ingredientArray[i] = ingredients[10];
                                System.out.println(amount);
                                System.out.printf("a.\t%-25s" + "b.\t%-25s" + "c.\t%-25s\n" + "d.\t%-25s",units[4], units[5], units[16], units[17]);
                                System.out.println("\n");
                                System.out.print(choice);
                                selection = input.next();
                                selection = selection.toLowerCase();

                                while(!selection.equals("a") && !selection.equals("b") && !selection.equals("c") && !selection.equals("d")) {
                                    System.out.println("Invalid selection.");
                                    System.out.println(amount);
                                    System.out.printf("a.\t%-25s" + "b.\t%-25s" + "c.\t%-25s\n" + "d.\t%-25s",units[4], units[5], units[16], units[17]);
                                    System.out.println("\n");
                                    System.out.print(choice);
                                    selection = input.next();
                                    selection = selection.toLowerCase();
                                }

                                if (selection.equals("a")) {
                                    qtyArray[i] = units[4];
                                }
                                if (selection.equals("b")) {
                                    qtyArray[i] = units[5];
                                }
                                if(selection.equals("c")) {
                                    qtyArray[i] = units[16];
                                }
                                if(selection.equals("d")) {
                                    qtyArray[i] = units[17];
                                }

                                System.out.println(lt + response + ingredientArray[i] + equals + qtyArray[i] + rt);
                                counter++;
                                break;
                            }
                        }
                        break;

                    case "l":

                        if(Arrays.toString(ingredientArray).contains(ingredients[11])) {
                            System.out.println("Topping has previously been chosen. Please make a new selection.");
                            break;
                        }

                        for (i = 2; i < maxToppings; i++) {
                            if (ingredientArray[i] == null) {
                                ingredientArray[i] = ingredients[11];
                                System.out.println(amount);
                                System.out.printf("a.\t%-25s" + "b.\t%-25s", units[4], units[5]);
                                System.out.println("\n");
                                System.out.print(choice);
                                selection = input.next();
                                selection = selection.toLowerCase();

                                while(!selection.equals("a") && !selection.equals("b")) {
                                    System.out.println("Invalid selection.");
                                    System.out.println(amount);
                                    System.out.printf("a.\t%-25s" + "b.\t%-25s", units[4], units[5]);
                                    System.out.println("\n");
                                    System.out.print(choice);
                                    selection = input.next();
                                    selection = selection.toLowerCase();
                                }

                                if (selection.equals("a")) {
                                    qtyArray[i] = units[4];
                                }
                                if (selection.equals("b")) {
                                    qtyArray[i] = units[5];
                                }

                                System.out.println(lt + response + ingredientArray[i] + equals + qtyArray[i] + rt);
                                counter++;
                                break;
                            }
                        }
                        break;

                    default:
                        System.out.println("NOT A VALID OPTION");
                        break;
                }

                System.out.println(linebreak);

//              Below is the section to prompt for adding another ingredient. Ingredient counter must be less than 8 for this to occur, else break to print recipe section.

                if (counter < 8) {

                    System.out.println("Would you like to add another ingredient?\n");
                    System.out.printf("a.\t%-25s" + "b.\t%-25s", cont[0], cont[1]);
                    System.out.println("\n");
                    System.out.print(choice);
                    selection = input.next();
                    selection = selection.toLowerCase();

                    while(!selection.equals("a") && !selection.equals("b")) {
                        System.out.println("Invalid selection.");
                        System.out.println("Would you like to add another ingredient?\n");
                        System.out.printf("a.\t%-25s" + "b.\t%-25s", cont[0], cont[1]);
                        System.out.println("\n");
                        System.out.print(choice);
                        selection = input.next();
                        selection = selection.toLowerCase();
                    }

                    System.out.println(linebreak);

                    if (selection.equals("a")) {
                        continue;
                    } else if (selection.equals("b")) {
                        done = true;
                        break;
                    }
                    System.out.println(linebreak);
                }
                else {
                    break;
                }
            }
    }
//    TODO: Recipe Output Section - completed 11/7/2022
//    TODO: "Your recipe" statement - completed: 11/6/2022
//    TODO: Crust line with formatting - completed 11/6/2022
//    TODO: Condition sauce line with formatting - completed 11/6/2022
//    TODO: Ingredient loop with formatting - check for null values in arrays x2 - completed 11/7/2022
//    TODO: Final baking instruction - completed 11/7/2022
        System.out.println("Your pizza recipe: \n");
        for (i = 0; i < ingredientArray.length; i++) {
            if (ingredientArray[i] != null) {
                System.out.printf("%-35s%-50s\n", ingredientArray[i], qtyArray[i]);
            }
        }
        System.out.println(" \n* Pizza is to be appropriately baked until crust is cooked\n and toppings are warmed *\n");
        System.out.println(linebreak);
        }
    }