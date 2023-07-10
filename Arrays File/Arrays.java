
public class Arrays {
    public static void main(String[]args){
        /*  There are 2 ways of WRITING arrays:
        *      1. String[] name = {"Akshit" , "Srivastava"} and so on...
        *
        *          name[0] = "Rishu";
        *          System.out.println(cars[3]);
        *
        *
        *       2. String[] name = new String[2];
        *
        *          name[0] = "Akshit";
        *          name[1] = "Srivastava";
        *
        *          System.out.println(name[index value]);                           */

        String[] cars = new String[3];

        cars[0] = "Maruti Suzuki";
        cars[1] = "BMW";
        cars[2] = "Mercedes";

        // System.out.println(cars);     DO NOT JUST LEAVE IT (cars) you have to write index value of it else it runs buut doesn't show the output we want. ERROR:-> [Ljava.lang.String;@4dd8dc3
        // To print all the values we have to use for loop.
        for (int i=0; i<cars.length; i++){
            System.out.println(cars[i]);
        }
    }
}
