import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;

        System.out.println("Valor da Array: ");
        valor = sc.nextInt();

        System.out.println("------------------------");
        int Poli[] = new int[valor];

        for (int i = 0; i < Poli.length; i++){
            System.out.print("Digite valor: ");
            Poli[i] = sc.nextInt();
        }
        for (int b = 0; b < Poli.length; b++){

        }
    }
}
