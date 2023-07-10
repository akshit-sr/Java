public class Constructor {
    public static void main(String[] args){
        Constructor_Human human1 = new Constructor_Human("Akshit", 18, 62.45);
        Constructor_Human human2 = new Constructor_Human("Rishu", 19, 62.50);

        System.out.println(human1.name);
        System.out.println(human1.age);
        System.out.println(human1.weight);
        System.out.println();
        System.out.println(human2.name);
        System.out.println(human2.age);
        System.out.println(human2.weight);
        human1.eat();
        human2.drink();
    }
}
