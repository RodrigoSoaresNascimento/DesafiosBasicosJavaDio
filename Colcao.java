import java.io.IOException;
import java.util.Scanner;
public class Colcao {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
		int A = leitor.nextInt();
		int B = leitor.nextInt();
		int C = leitor.nextInt();
		int H = leitor.nextInt();
		int L = leitor.nextInt();
        if (B <= 200){
            System.out.println("S");
        }else{
            System.out.println("N");
        }
        leitor.close();

    }
}
