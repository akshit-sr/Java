package Super;

public class Main {
    public static void main(String[]args){
        Hero hero1 = new Hero("SpiderMan", 19, "Webs");
        Hero hero2 = new Hero("IronMan", 32, "Iron suit");

        System.out.println(hero1.toString());
        System.out.println();
        System.out.println(hero2.toString());
    }
}
