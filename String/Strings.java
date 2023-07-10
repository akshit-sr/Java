public class Strings {
    public static void main(String[] args){
        String name = "Akshit";

        boolean a = name.equalsIgnoreCase("akshit");
        int b = name.length();
        char c = name.charAt(3);                // c = d
        int d = name.indexOf("i");              // c = d
        boolean e = name.isEmpty();
        String f = name.toUpperCase();
        String g = name.toLowerCase();
        String h = name.trim();
        String i = name.replace('s','o');

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
    }
}
