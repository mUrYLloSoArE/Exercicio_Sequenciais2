import java.util.Scanner;


public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horas, mes_horas,mes;

        mes=30;

        double valor_hora;

        System.out.println(" Programa que realiza o cálculo do seu salário ");

        System.out.println(" Quantas horas você trabalha por dia? ");
        horas=sc.nextInt();

        System.out.println(" Qual o valor da sua hora? ");
        valor_hora = sc.nextDouble();

        mes_horas = mes*horas;
        System.out.println(" Horas trabalhadas no mes -> " + mes_horas + " horas ");

        double salario=(horas*valor_hora)*mes;
        System.out.println(" O seu salário Bruto é -> " + " R$ " + salario );

        sc.close();
    }
}
