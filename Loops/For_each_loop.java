
import java.util.ArrayList;

public class For_each_loop {
    public static void main(String[]args)
    {
        //String[] animals = {"Dog", "Sparrow", "Fish", "Squirrel"};

        ArrayList<String> animals = new ArrayList<String>();

        animals.add("Dog");
        animals.add("Sparrow");
        animals.add("Fish");
        animals.add("Squirrel");

        for (String i : animals)
        {
            System.out.println(i);
        }
    }
}
