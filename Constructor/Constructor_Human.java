public class Constructor_Human {

    String name;
    int age;
    double weight;
    Constructor_Human(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    void eat(){
        System.out.println(this.name + " is eating hamburger.");
    }
    void drink(){
        System.out.println(this.name + " is drinking water.");
    }
}
