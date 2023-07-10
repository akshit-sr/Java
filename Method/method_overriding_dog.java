public class method_overriding_dog extends method_overriding_animal {
    @Override                       // Consider a good practice to add @Override at the top of overriding!
    void speak(){                                       // Here the animals gets overrides by dogs overriding.
        System.out.println("The dog speaks *barks*.");
    }
}
