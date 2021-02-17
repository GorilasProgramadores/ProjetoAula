/**
 * 
 */
package ProjetoAC1;

/**
 * @author User
 *
 */
public class Pricipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Menor());
		System.out.println(Maior());
		System.out.println(Soma());

	}

	public static Integer Menor() {
		int[] arranjo = { 940, 880, 830, 790, 750, 660, 650, 590, 510, 940 };
		int menor = arranjo[0];
		for (int i = 0; i < arranjo.length; i++) {
			if (arranjo[i] < menor) {
				menor = arranjo[i];
			}
		}
		return menor;
	}
	public static Integer Maior() {
		int[] arranjo = { 940, 880, 830, 790, 750, 660, 650, 590, 510, 940 };
		int maior = 0;
		for (int i = 0; i < arranjo.length; i++) {
			if (arranjo[i] >= maior) {
				maior = arranjo[i];
			}
		}
		return maior;
	}

	public static Integer Soma() {
		int[] arranjo = { 940, 880, 830, 790, 750, 660, 650, 590, 510, 940 };
		
		int soma = 0;
		for (int i = 0; i < arranjo.length; i++) {		
			soma = soma + arranjo[i];			
		}
		return soma;
	}
	public static Integer ContaVzs() {
		
		
	}

}
