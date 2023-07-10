public class Overloaded_Method {
    public static void main(String[]args){
        double x = add(1.0,9.0, 3.0);

        System.out.println(x);
    }
    static double add(double a, double b){                       // To use this method we need call only 2 var in double x = add(1.0, 9.0)
        System.out.println("This is overloaded method #1.");
        return a + b;
    }
    static double add(double a, double b, double c){            // Right now this method is triggered cuz we got 3 var in call fxn.
        System.out.println("This is overloaded method #2.");
        return a + b + c;
    }
}
