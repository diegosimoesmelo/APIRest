import org.w3c.dom.ls.LSOutput;

public class Condicional {
    public static void main(String[] args) {

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = " plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Novos Lançamentos!");
        } else {
            System.out.println("Filme Clássico!");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("Plano liberado!");
        } else {
            System.out.println("Necessário atualizar o pagamento!");
        }

    }
}
