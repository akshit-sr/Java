public class Method_overriding_main {
    public static void main (String[]args){
        method_overriding_animal animal = new method_overriding_animal();
        animal.speak();

        method_overriding_dog dog = new method_overriding_dog();
        dog.speak();
    }
}
