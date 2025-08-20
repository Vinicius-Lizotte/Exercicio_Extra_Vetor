import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, value = Integer.MIN_VALUE;

        System.out.print("Valor da Array: ");
        valor = sc.nextInt();

        int ser[] = new  int[valor], cont_min =0, cont_max = 0, serr = 0;


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
                cont_max = 0;
                if (cont_max == 2){
                    serr = 1;
                }
            } else if (value > ser[b]){
                System.out.print(" > " + ser[b]);
                value = ser[b];
                cont_max++;
                cont_min = 0;
                if (cont_max == 2){
                    serr = 1;
                }
            } else if (value == ser[b]){
                System.out.print(" = " + ser[b]);
                value = ser[b];
                System.out.println("\nNão é serrilhado");
                break;
            }
        }
        if (valor == 1){
            serr = 1;
        }

        if (serr == 1){
            System.out.println("\n Não é serrilhado");
        } else {
            System.out.println("\n É serrilhado");
        }


    }
}
