import java.util.Scanner;

public class SomaParesImpares {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = 0;
        int n = 0;
        if (x > y){
            n = x;// armazena o variavel x//
            x = y;// converte X em Y//
            y = n;// salva a variavel//
        }

        for(int i = x+1; i < y; i++ ){

            if(i % 2 != 0){
                z = z + i;
            }

        }
        System.out.println(z);

        sc.close();
    }
}
