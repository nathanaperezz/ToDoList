//Nathan Perez
//To do list that allows adding, deleting, and printing

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        ArrayList<String> toDo = new ArrayList<String>();

        int userOption = 0;
        while(userOption != -1) {

            System.out.println("\nEnter a number to perform a function to your to do list.");
            System.out.println("1  - Add new item");
            System.out.println("2  - Delete an item");
            System.out.println("3  - Print the list");
            System.out.println("-1 - Quit");

            userOption = scan.nextInt();

            if (userOption == 1) {
                UserInputAddItem(toDo);
            }
            else if (userOption == 2) {
                UserInputDeleteItem(toDo);
            }
            else if (userOption == 3) {
                System.out.println("To do: ");
                PrintToDoList(toDo);
            }
            else if (userOption != -1) {
                System.out.println("Error please type a valid option");
            }
        }

    }

    public static void UserInputAddItem (ArrayList<String> toDo) {

        String newItem;

        System.out.print("New item: ");
        scan.nextLine();
        newItem = scan.nextLine();

        AddItem(newItem, toDo);
        System.out.println("\n" + newItem + " has been added to your to do list!");
    }

    public static void AddItem (String item, ArrayList<String> toDo) {
        toDo.add(item);
    }


    public static void UserInputDeleteItem (ArrayList<String> toDo) {

        int place = 0;

        System.out.println("Please enter the number of the item you would like to delete: ");
        place = scan.nextInt();

        DeleteItem((place - 1), toDo);
        System.out.println("Item " + place + " has been deleted from your list.");
    }

    public static void DeleteItem (int placeInArray, ArrayList<String> toDo) {
        toDo.remove(placeInArray);
    }

    public static void PrintToDoList (ArrayList<String> toDo) {
        for(int i = 0; i < toDo.size(); i++) {
            System.out.println(i+1 + ". " + toDo.get(i));
        }
    }
}

