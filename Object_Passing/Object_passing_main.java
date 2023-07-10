public class Object_passing_main {
    public static void main(String[]args){
        Object_passing_garage garage = new Object_passing_garage();

        Object_passing_car car1 = new Object_passing_car("BMW");
        Object_passing_car car2 = new Object_passing_car("Mercedes");

        garage.park(car1);
        garage.park(car2);
    }
}
