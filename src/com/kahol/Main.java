package com.kahol;

import java.util.Scanner;

public class Main {
    private static Scanner scanner= new Scanner(System.in);
    private static Grocery groceryList=new Grocery();
    private static int choice=0;

    public static void main(String[] args) {
        boolean quit=false;
        printInstructions();
        while(!quit) {
            System.out.print("Enter your choice :");
            choice= scanner.nextInt();
            scanner.nextLine();         //---> to clear buffer

        switch (choice) {
            case 0: printInstructions();        //---> to print choice options
                break;
            case 1: printGroceryList();
                break;
            case 2: addItem();
                break;
            case 3: modifyItem();
                break;
            case 4: removeItem();
                break;
            case 5: findItem();
                break;
            case 6:
                quit=true;
                break;
        }
        }
    }
    private static void printInstructions(){
        System.out.print("\nPress :");
        System.out.print("\n 0 - To print choice options");
        System.out.print("\n 1 - To print the list of grocery items");
        System.out.print("\n 2 - To add an item to the list");
        System.out.print("\n 3 - To modify an item in the list");
        System.out.print("\n 4 - To remove an item from the list");
        System.out.print("\n 5 - To search an item in the list");
        System.out.println("\n 6 - To quit the application");
    }
    private static void printGroceryList(){
        Grocery.printGroceryList();
    }
    private static void addItem(){
        System.out.print("Enter the item :");
        String item=scanner.nextLine();
        Grocery.addGroceryItem(item);
    }
    private static void modifyItem(){
        System.out.print("Enter the index :");
        int index=scanner.nextInt();
        scanner.nextLine(); // clearing buffer
        System.out.println("Enter the item :");
        String modifyWith=scanner.nextLine();
        Grocery.modifyGroceryItem(index-1,modifyWith);
    }
    private static void removeItem(){
        System.out.print("Enter item index :");
        int index=scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(index-1);
    }
    private static void findItem(){
        System.out.print("Enter item :");
        String searchItem=scanner.nextLine();
         if(searchItem!=null)
            System.out.println(Grocery.findItem(searchItem)+" has been found.");
        else
            System.out.println("Item you are looking for is not in the list.");

    }
}
