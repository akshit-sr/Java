public class Overloaded_Constructor_Main_Pizza {
    public static void main(String[]args){
        Overloaded_Pizza pizza1 = new Overloaded_Pizza("Thick crust","Tomato","Mozzarella");

        System.out.println("Here's the pizza's ingredients:- ");
        System.out.println(pizza1.bread);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.cheese);
        System.out.println(pizza1.topping);

        System.out.println();

        Overloaded_Pizza pizza2 = new Overloaded_Pizza("Thick crust","Tomato","Mozzarella","Pepperoni");

        System.out.println("Here's the pizza ingredients:- ");
        System.out.println(pizza2.bread);
        System.out.println(pizza2.sauce);
        System.out.println(pizza2.cheese);
        System.out.println(pizza2.topping);
    }
}
