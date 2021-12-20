import java.util.Scanner;
/*Voce deve calcular o consumo medio de um automovel onde serr informada a distincia total percorrida (em Km)
 e o total de combustivel consumido (em litros).*/

public class ConsumoMedioAutomovel {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

       //declare as variaveis corretamente

       int distancia = leitor.nextInt();
       double combustivelConsumido = leitor.nextDouble();
       double conversao = distancia;

       double media = (conversao/combustivelConsumido)  ;  //insira as variaveis de acordo com o enunciado
       System.out.println(String.format("%.3f km/l", media    ));
       leitor.close();

   }
}
