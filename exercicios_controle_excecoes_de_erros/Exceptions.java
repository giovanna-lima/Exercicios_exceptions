package exercicios_controle_excecoes_de_erros;

public class Exceptions {

	public static void main(String[] args) {
	
		try {
			int vet [] = new int [4];
			
			System.out.println("Antes da exception");
			
			vet[4] = 5;
			
			System.out.println("Esse texto n�o vai ser impresso");

			
			System.out.println("Depois da exception");
			
		} catch (ArrayIndexOutOfBoundsException exception){
			System.out.println("Exce��o ao tentar acessar um �ndice do vetor inexistente");
			
		}
		
		System.out.println("Esse texto ser� impresso ap�s a exce��o");
	}

}
