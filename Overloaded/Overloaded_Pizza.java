public class Overloaded_Pizza {

    String bread;
    String sauce;
    String cheese;
    String topping;

    Overloaded_Pizza(String bread,String sauce,String cheese)                               // Overloaded Constructor
    {                                                                                       // It has the same name given
        this.bread = bread;                                                                 // below but the parameters
        this.sauce = sauce;                                                                 // aren't the same.
        this.cheese = cheese;
    }

    Overloaded_Pizza(String bread,String sauce,String cheese,String topping)                // Overloaded Constructor
    {                                                                                       // It has the same name given
        this.bread = bread;                                                                 // above but the parameters
        this.sauce = sauce;                                                                 // aren't the same.
        this.cheese = cheese;
        this.topping = topping;
    }
}
