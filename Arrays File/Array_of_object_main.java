public class Array_of_object_main {
    public static void main(String[]args){
        //array_of_food[] refrigerator = new array_of_food[3];

        array_of_food food1 = new array_of_food("Pizza");
        array_of_food food2 = new array_of_food("Hamburger");
        array_of_food food3 = new array_of_food("HotDog");

        array_of_food[] refrigerator = {food1,food2,food3};                 //array of object;

        //refrigerator[0] = food1;
        //refrigerator[1] = food2;
        //refrigerator[2] = food3;

        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);
    }
}
