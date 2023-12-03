
import java.util.Scanner;

public class leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println("qual o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("qual a sua nota?");
        double nota = leitura.nextDouble();


        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(nota);
    }
}