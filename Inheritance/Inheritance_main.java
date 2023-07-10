public class Inheritance_main {
    public static void main(String[]args){
        Inheritance_car car = new Inheritance_car();
        Inheritance_bicycle bike = new Inheritance_bicycle();

        car.go();                   // Inheritance is SubClass of vehicle file whereas Vehicle is a SuperClass
        bike.stop();                // Same goes for here.
    }
}
