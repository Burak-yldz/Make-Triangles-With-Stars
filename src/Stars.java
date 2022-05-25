import java.util.Scanner;
public class Stars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number ( n ) : ");
        int n = input.nextInt();

        // ----------------This program can calculate like below ----------------------   *
        //   ***
        //  *****
        // *******
        //*********
        // *******
        //  *****
        //   ***
        //    *

        for (int i = 1; i<= n ; i++){

            for(int j = 1; j<= (n - i) ; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=(2 * i)-1; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int z=1; z<=n ;z++){
            for (int x=1; x<=z ;x++){
                System.out.print(" ");
            }
            for (int y=1; y<=2*(n-z)-1 ;y++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

        /*
            *----------------------This program can calculate like below----------------------------
        //    ***
        //   *****
        //  *******
        // *********
        //***********
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number ( n ) : ");
        int n = input.nextInt();

        for (int i = 1; i<= n ; i++){

            for(int j = 1; j<= (n - i) ; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=(2 * i)-1; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}*/

