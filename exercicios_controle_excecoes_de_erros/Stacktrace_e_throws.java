package exercicios_controle_excecoes_de_erros;

public class Stacktrace_e_throws {

	public static void main(String[] args) {
		
		int nm [] = {6, 36, 30, 45, 60, 20};
		int denom [] = {5, 0, 10, 5, 0};
		
		for (int i = 0; i<nm.length; i++) {
			
		try { 

			System.out.println(nm[i] + "/" + denom[i]+ "="+ nm[i]/denom[i]);

			} catch(Exception e1) {
				System.out.println(e1.getMessage());
				e1.printStackTrace();
					
			}
		      

	}

}
}
