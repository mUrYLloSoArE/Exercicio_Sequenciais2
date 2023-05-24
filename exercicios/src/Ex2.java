import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua primeira nota ");
        double n1=sc.nextDouble();

        System.out.println("Digite a sua segunda nota ");
        double n2=sc.nextDouble();

        System.out.println("Digite a sua terceira nota ");
        double n3=sc.nextDouble();

        System.out.println("Digite a sua quarta nota ");
        double n4=sc.nextDouble();

        double media=(n1+n2+n3+n4)/4;
        System.out.println(" A sua média final foi -> " + Math.round(media));

        sc.close();
    }
}
