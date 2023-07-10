public class Arrays_2D {
    public static void main(String[] args){
        String[][] cars = {
                            {"Camaro","Corvette","Silverado"},
                            {"BMW","Mustang","Ranger"},
                            {"Tesla","Jaguar","Mercedes"}
                                                                    };

        /* Another way is:-
        String[][] cars = new String[3][3];             <---- Here we assign the size of 2D Array.

        cars [0][0] = "Camaro";
        cars [0][1] = "Corvette";
        cars [0][2] = "Silverado";
        cars [1][0] = "BMW";
        cars [1][1] = "Mustang";
        cars [1][2] = "Ranger";
        cars [2][0] = "Tesla";
        cars [2][1] = "Jaguar";
        cars [2][2] = "Mercedes";
         */

        for (int i = 0; i < cars.length; i++)
        {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++)
            {
                System.out.print(cars[i][j]+" ");
            }
        }
    }
}
