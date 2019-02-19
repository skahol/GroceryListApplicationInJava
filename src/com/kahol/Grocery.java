package com.kahol;
import java.util.ArrayList;
public class Grocery {
    private static ArrayList<String> groceryList= new ArrayList<>();
    public static void addGroceryItem(String s){
        groceryList.add(s);     //---> add(String str)
    }
    public static void printGroceryList(){
        System.out.println("You have "+groceryList.size()+" items in your grocery list.");
        for(int i=0; i < groceryList.size(); i++ ){
            System.out.println(groceryList.get(i));     //---> get(int index)
        }
    }
    public static void modifyGroceryItem(int index, String item){
        groceryList.set(index, item);      //---> set item at position index
        System.out.println("GroceryItem "+(index+1)+" has been modified.");
    }
    public static void removeGroceryItem(int index){
        String item=groceryList.get(index);
        groceryList.remove(index);          //---> remove item from index
        System.out.println(item+" has been removed from grocery list");
    }
    public static String findItem(String searchItem){
    //    boolean exists= groceryList.contains(item);
        int position = groceryList.indexOf(searchItem);  //---> return lower index, if not found return -1.
       if(position >=0){
           return groceryList.get(position);
       }
       return null;
    }
}
