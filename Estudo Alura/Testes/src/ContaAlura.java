import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ContaAlura {
    public static void main(String[] args) {

        int[] digitosValidos = new int[]{1 ,2};
        Scanner pegarNome = new Scanner(System.in);


        System.out.println("Digite o nome do cliente: ");
        String nome = pegarNome.nextLine();

        Scanner tipoConta = new Scanner(System.in);
        System.out.println("Qual o tipo de conta? - (1) - Poupança  /  (2) - Conta corrente.");
        int conta = tipoConta.nextInt();
            if (conta != parseInt(Arrays.toString(digitosValidos)) ){
                System.out.println("Digite um dígito válido");

            }


        System.out.println("Nome: " + nome);
        if (conta == 1) {
            System.out.println("Tipo Conta: Poupança" );
        } else if ( conta ==2) {
            System.out.println("Tipo Conta: Corrente" );
        } else {
            System.out.println("Dígito inválido");
        }

        System.out.println("Saldo inicial: ");
    }
}
