
import java.util.Scanner;
import java.io.IOException;
public class TempoDeDobby {
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	int A = leitor.nextInt() + leitor.nextInt();
        /* Complete o If com a condição que soluciona o problema.*/
    	if (A > N )
    		System.out.println("Deixa para amanha!");
    	else
    		System.out.println("Farei hoje!");
        leitor.close();
    }
	
}
