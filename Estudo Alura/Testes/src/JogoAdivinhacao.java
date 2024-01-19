import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;

        while (tentativas < 5){

            System.out.println("Digite um número entre 0 e 100: ");
            int numeroDigitado = leitor.nextInt();
            tentativas++;


            if (numeroDigitado == numeroGerado){
                System.out.println("QUE SORTE! O número gerado também foi:" + numeroGerado);
                break;
            }else if (numeroDigitado < numeroGerado){
                System.out.println("O número digitado é menor!!");
            } else {
                System.out.println("O número digitado é maior!");
            }
        }
        if (tentativas == 5) {
            System.out.println("Você não conseguiu adivinhar o número!");
        }
        System.out.println("O número gerado era: " + numeroGerado);

    }
}
