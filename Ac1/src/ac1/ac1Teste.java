package ac1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ac1Teste {

	@Test
	public void test() {
		
		Ac1 a = new Ac1();
		
		assertEquals(510, a.Menor(), " - Menor: 510");
		assertEquals(940, a.Maior(), " - Maior: 940");
		assertEquals(7540, a.Soma(), " - Soma: 7040");
		assertEquals(0, a.Repeticoes(3), " - 3 Não aparece");
		assertEquals(1, a.Repeticoes(790), " - 790 Aparece 1 vez");
		assertEquals(2, a.Repeticoes(940), " - 940 Aparece 2 vezes");
	}

}
