public class condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true; //O tipo boolean é utilizado para representar valores lógicos, podendo assumir apenas dois valores: true ou false.
        double notaDoFilme = 8.7;
        String tipoPlano = "plus";

        if (anoDeLancamento <= 2022) {
            System.out.println("ótimo filme");
        } else {
            System.out.println("ótimo filme retrô");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("filme libeado");
        } else {
            System.out.println("acesso negado");
        }
    }
}