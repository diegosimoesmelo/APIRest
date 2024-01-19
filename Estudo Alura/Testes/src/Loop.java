import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double nota1 = 0;
        double media = 0;

        for (int i = 0; i< 3 ; i++){
            System.out.println("Digita a tua nota!");
            nota1 = leitura.nextDouble();
            media +=  nota1;
        }
        System.out.println("A sua média é de: " + media/3);

        }
    }

