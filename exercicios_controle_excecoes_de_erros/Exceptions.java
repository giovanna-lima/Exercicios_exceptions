package exercicios_controle_excecoes_de_erros;

public class Exceptions {

	public static void main(String[] args) {
	
		try {
			int vet [] = new int [4];
			
			System.out.println("Antes da exception");
			
			vet[4] = 5;
			
			System.out.println("Esse texto não vai ser impresso");

			
			System.out.println("Depois da exception");
			
		} catch (ArrayIndexOutOfBoundsException exception){
			System.out.println("Exceção ao tentar acessar um índice do vetor inexistente");
			
		}
		
		System.out.println("Esse texto será impresso após a exceção");
	}

}
