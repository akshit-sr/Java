
import java.util.ArrayList;

public class Array_list {
    public static void main(String[] args){
        ArrayList <String> food = new ArrayList <String> ();

        food.add("Hamburger");
        food.add("Pizza");
        food.add("HotDog");

        //food.set(0 , "Sushi");
        //food.remove(2);
        //food.clear();

        for (int i = 0; i < food.size(); i++)
        {
            System.out.println(food.get(i));
        }
    }
}
