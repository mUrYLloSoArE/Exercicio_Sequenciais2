import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Sistema que converte temperatura em fahrenheit,  em graus Celsius ");

        System.out.println(" Digite a temperatura fahrenheit ");
        double temp=sc.nextDouble();

        double fahrenheit=(temp-32)/1.8;
        System.out.println(" Convertendo o resultado é -> "+ Math.round(fahrenheit) + " em graus Celsius ");

        sc.close();
    }
}
