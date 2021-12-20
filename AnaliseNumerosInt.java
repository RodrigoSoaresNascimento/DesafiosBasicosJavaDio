/*Você deve fazer a leitura de 5 valores inteiros.
 *  Em seguida mostre quantos valores informados são pares, 
 *  quantos valores informados são ímpares, 
 *  quantos valores informados são positivos e quantos valores informados são negativos. 
 *  Considere que o número zero é positivo, mas não pode ser considerado como positivo ou negativo.*/
import java.util.Scanner;

public class AnaliseNumerosInt {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		//declare suas variaveis corretamente
		       
		        int par = 0;
		        int impar = 0;
		        int positivo = 0;
		        int negativo  = 0;
		        int cont = 0;
		        int [] vetor = new int [5];

		//continue a solução
		        do{
		        for (int i = 0; i < 5; i++ ) {
		          vetor[i] = leitor.nextInt();
		        }
		          for(int controle = 0; controle < 5; controle++){
		            if(vetor[controle] > 0){
		              positivo++;
		            }else if(vetor[controle]< 0){
		              negativo++;
		            }
		          }
		          for(int controle2 = 0; controle2 < 5 ; controle2 ++){
		            if(vetor[controle2] % 2 == 0){
		              par++;
		            }else{
		              impar++;
		            }
		          }  
		        	
		       
		        cont++;
		        }while(cont < 1);
		//insira suas variaveis corretamente
		        System.out.println(par + " par(es)");
		        System.out.println(impar + " impar(es)");
		        System.out.println(positivo + " positivo(s)");
		        System.out.println(negativo + " negativo(s)");
		        leitor.close();

	}

}
