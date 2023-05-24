import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Programa que converte metros para centimetros ");

        System.out.println(" Digite os metros ");
        double metros = sc.nextDouble();

        double conversao=metros*100;
        System.out.println(metros + " metros convertidos em centimetros -> " + conversao + " cm ");



        sc.close();
    }
}
