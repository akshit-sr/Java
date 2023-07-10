
import java.util.*;

public class ArrayList_2D {
    public static void main(String[] args){
        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Pasta");
        bakeryList.add("Garlic Bread");
        bakeryList.add("Donuts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("Potato");
        produceList.add("Ham");
        produceList.add("Tomato");

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("Sprite");
        drinkList.add("Thumbs Up");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);

        System.out.println(groceryList.get(2).get(0));
    }
}
