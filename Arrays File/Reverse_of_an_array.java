public class Reverse_of_an_array{
    public static void main(String[]args){
        int number[] = {55, 40, 80, 65, 71};
        int n = number.length;
        System.out.print("Given list:  ");
        for(int i = 0; i < n; i++){
            System.out.print(" "+ number[i]);
        }
        System.out.println();
        //Sorting of number
        for (int i = 0; i < n; i++){
            for(int j = i+1 ; j < n; j++){
                if(number[j] < number[i]){                // to get reverse of it jus change it to '>'.
                    // INTERCHANGING OF VALUES
                    int temp = number [i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
        System.out.print("Sorted list :  ");
        for ( int i = 0 ; i< n ; i++){
            System.out.print(" " + number[i]);
        }
        System.out.println();
    }
}