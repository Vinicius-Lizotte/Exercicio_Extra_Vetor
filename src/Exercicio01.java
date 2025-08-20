import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, value = Integer.MIN_VALUE;

        System.out.println("Valor da Array: ");
        valor = sc.nextInt();

        int ser[] = new  int[valor], cont_eq = 0, cont_min =0, cont_max = 0, serr = 0;


        for (int i = 0; i < ser.length; i++){
            System.out.print("Digite valor: ");
            ser[i] = sc.nextInt();
        }

        System.out.println("----------------------------");
        for (int b = 0; b < ser.length; b++){
            if (value == Integer.MIN_VALUE){
                System.out.print(ser[b]);
                value = ser[b];
            } else if (value < ser[b]){
                System.out.print(" < " + ser[b]);
                value = ser[b];
                cont_min++;
            } else if (value > ser[b]){
                System.out.print(" > " + ser[b]);
                value = ser[b];
                cont_max++;
            } else if (value == ser[b]){
                System.out.print(" = " + ser[b]);
                value = ser[b];
                System.out.println("\nNão é serrilhado");
                break;
            }
        }


    }
}
