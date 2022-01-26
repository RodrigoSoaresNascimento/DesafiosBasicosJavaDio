import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num = sc.nextDouble();
        double a = 0;
        double b = 0;
        double c = 0;
        
        a = Math.pow((1+Math.sqrt(5))/2,num);
        b = Math.pow((1-Math.sqrt(5))/2,num);
        c = (a - b)/ Math.sqrt(5);
        System.out.printf("%.1f",c);
        sc.close();
    }
}
