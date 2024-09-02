/*
Controle de fluxo - Condicional composta 
e Condicional encadeada
e Condicional ternária
*/
public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;
        /*  Condicional composta e encadeada
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if ( nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        } else 
            System.out.println("Reprovado");
        */

        // Condicional Ternária
        // Cenário 1
		String resultado = nota >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);

        // Cenário 2
		String resultado2 = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado2);

    }
}
