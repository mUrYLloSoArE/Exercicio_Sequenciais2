import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Digite um número para ver o seu antecessor e o seu sucessor ");
        int numero = sc.nextInt();

        int antecessor = numero-1;
        int sucessor= numero+1;

        System.out.println("  O seu antecessor -> " + antecessor);
        System.out.println("  O seu sucessor -> " + sucessor);


        sc.close();
    }
}
