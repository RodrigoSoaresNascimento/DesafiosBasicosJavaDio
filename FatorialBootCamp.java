import java.util.Scanner;

public class FatorialBootCamp{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int mult = 1;
        for(int i = 0; i < x; x--){

            mult = mult * x;

        }
        System.out.println(mult);

        input.close();


    }

}