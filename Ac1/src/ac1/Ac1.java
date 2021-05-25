package ac1;

public class Ac1 {

	public int[] arranjo = { 940, 880, 830, 790, 750, 660, 650, 590, 510, 940 };

	public static void main(String[] args) {
		Ac1 n1 = new Ac1();
		
		System.out.println("Menor: " + n1.Menor());
		System.out.println("Maior: " + n1.Maior());
		System.out.println("Soma: " + n1.Soma());
		System.out.println("Repetições do 940: " + n1.Repeticoes(940));

	}

	public Integer Menor() {		
		int menor = arranjo[0];

		for (int i = 0; i < arranjo.length; i++) {
			if (arranjo[i] < menor) 
				menor = arranjo[i];
		}
		return menor;
	}

	public Integer Maior() {		
		int maior = 0;
		
		for (int i = 0; i < arranjo.length; i++) {
			if (arranjo[i] >= maior) 
				maior = arranjo[i];			
		}
		return maior;
	}

	public Integer Soma() {		
		int soma = 0;
		
		for (int i = 0; i < arranjo.length; i++) 
			soma = soma + arranjo[i];			
		
		return soma;
	}

	public Integer Repeticoes(int n1) {
		int repeticoes = 0;
		
		for (int i = 0; i < arranjo.length; i++) {
			if (n1 == arranjo[i]) 
				repeticoes++;            	
		}
		return repeticoes;
	}

}
