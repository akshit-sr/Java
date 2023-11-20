public class Search_inString {
    public static void main(String[] args) {
        String name = "Akshit";
        char target = 'k';
        System.out.println(charfind(name, target));
    }

    static boolean charfind(String str, char target) {
        if (str.isEmpty())
            return false;

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}