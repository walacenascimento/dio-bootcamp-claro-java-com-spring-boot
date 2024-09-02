/*Estrutura Condicional - Switch e Case */

public class SistemaMedida {
	public static void main(String[] args) {
		String plano = "B"; //M / T
		
		switch (plano) {
			case "T": {
				System.out.println( "5Gb Youtube\nWhats e Intagram grátis\n100 minutos de ligação");
                break;
			}
			case "M": {
				System.out.println("Whats e Intagram grátis");
                break;
			}
			case "B": {
				System.out.println("100 minutos de ligação");
                break;
			}
		}
	}
}
