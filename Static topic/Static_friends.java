public class Static_friends {
    String name;
    static int numberofFriends;

    Static_friends(String name){
        this.name = name;
        numberofFriends++;
    }

    static void dispalyFriends(){
        System.out.println("You have "+numberofFriends+" friends.");
    }
}
