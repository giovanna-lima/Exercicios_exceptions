package exercicios_controle_excecoes_de_erros;

public class Finally {

	public static void main(String[] args) {
		
		int nm [] = {6, 36, 30, 45, 60, 20};
		int denom [] = {5, 0, 10, 5, 0};
		
		for (int i = 0; i<nm.length; i++) {
			
		try { 

			System.out.println(nm[i] + "/" + denom[i]+ "="+ nm[i]/denom[i]);

			} catch(ArithmeticException e1) {
				System.out.println("Erro ao dividir por zero");
					
			}
		       catch (ArrayIndexOutOfBoundsException e2) {
		    	   System.out.println("Posi��o do array inv�lida!");
		    	   // impedindo a execu��o do catch temos:
		    	   System.exit(0);
		       }
		finally {
			System.out.println("Essa linha sempre � impressa ap�s um try ou um catch");
		}

	}

}
}
