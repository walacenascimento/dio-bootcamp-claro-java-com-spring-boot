public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        String nome = "Walace";
        System.out.println(nome);

        double salarioMinino = 2500;
        System.out.println(salarioMinino);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        System.out.println(numeroCurto2);

        int numero = 1;
        numero = 2;

        System.out.println(numero);

        // Para declarar uma variável como uma constante, usamos a palavra "final"
        // e o nome da variável deverá ser escrita em CAIXA ALTA

        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);

        
    }
}
