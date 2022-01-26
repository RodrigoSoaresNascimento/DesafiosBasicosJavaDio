/*Acima da Diagonal Principal
Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão acima da diagonal principal da matriz, conforme ilustrado abaixo (área verde).*/

/*Entrada
A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'), indicando a operação (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de ponto flutuante que compõem a matriz.*/

/*Saída
Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.*/

import java.util.Scanner;

public class AboveMain {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
		 
		 double[][] headquarters = new double [12][12];
		 
		 double sum = 0;
		 double average = 0;
		 char operation = leitor.next().charAt(0);
		 
		 for(int i = 0; i < headquarters.length; i++) {
			 for(int j = 0; j < headquarters.length; j ++) {
				 
				 headquarters[i][j] = leitor.nextDouble();

				 
				 
			 }
			 
			 
		 }
		 
		 for (int i=0; i<headquarters.length; i++) {
		        for (int j=0; j<headquarters.length; j++) {
		            
		        	if (i < j) {
		        		
		                sum +=  headquarters[i][j];
		                
		            }
		        }
		    }
		 
		 average = sum / 55;
		 
		 if(operation == 'S') {
			 
			 System.out.println(sum);
			 
		 }else if (operation == 'M') {
			 
			 System.out.printf("%.1f", average);
			 
		 }
		 
		 leitor.close();

    }
}
