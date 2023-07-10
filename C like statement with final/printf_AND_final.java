public class printf_AND_final {
    public static void main(String[] args){
        String m = "Akshit";
        double d = 13.4;

        System.out.printf("Hello %s\n", m);
        System.out.printf("You have %.2f money", d);


        // There are 2 arguments = format string + (object/variable/value)
        //------------------------------------------------------------------------------------------------------------//
        // final is a keyword used when something is final means it's final
        // cannot be updated later cuz it will show error. It is said to be a good practice to write var name UPPERCASE.

        final int Z = 12;
        //z = 0;                ILLEGAL cuz 'final' is used.
        System.out.println(Z);
    }
}
