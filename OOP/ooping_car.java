public class ooping_car {                                           // This section is connected to ooping_cars.java😬
    public static void main (String[]args){
        ooping_cars myCar = new ooping_cars();

        System.out.println(myCar.Company_name);
        System.out.println(myCar.Model_name);
        System.out.println(myCar.Color);
        System.out.println(myCar.Year);
        myCar.drive();
        myCar.brake();
    }
}
