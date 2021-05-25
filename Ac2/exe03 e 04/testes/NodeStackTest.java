package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import source.EmptyStackException;

import source.NodeStack;

class NodeStackTest {

	Object o;

	static final NodeStack<Integer> a = new NodeStack<Integer>();

	// Exe03
	@Test
	void pilhaInteiros() {

		a.push(7);

		assertEquals("[7]", a.toString(), "Deve imprimir [7]");

		a.push(9);

		assertEquals("[9, 7]", a.toString(), "Deve imprimir [9, 7]");

		a.push(1);

		assertEquals("[1, 9, 7]", a.toString(), "Deve imprimir [1, 9, 7]");

		assertEquals(1, a.pop(), "Deve ter desempilhado 1");

		assertEquals("[9, 7]", a.toString(), "Deve imprimir [9, 7]");

		assertEquals(9, a.pop(), "Deve ter desempilhado 9");

		assertEquals("[7]", a.toString(), "Deve imprimir [7]");

		assertEquals(7, a.pop(), "Deve ter desempilhado 7");

		assertEquals("[]", a.toString(), "Deve imprimir []");

		assertTrue(a.isEmpty());

		assertThrows(EmptyStackException.class, () -> {
			a.pop();
		});

	}

	// Exe04 - Questão B
	@Test
	void arranjoInvertido() {
		NodeStack<String> teste = new NodeStack<String>();

		String[] alfabeto = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z" };

		for (int i = 0; i <= alfabeto.length - 1; i++)
			teste.push(alfabeto[i]);

		assertEquals("[Z, Y, X, W, V, U, T, S, R, Q, P, O, N, M, L, K, J, I, H, G, F, E, D, C, B, A]", teste.toString(),
				"Deve retornar alfabeto invertido");
	}
	
	// Exe04 - Questão C
	@Test
	void checarExpressao() {
		NodeStack<String> teste = new NodeStack<String>();
		
		String correto1 = "[(5 + x)/4 – 2*(y + z)]";
		String correto2 = "((()(()){([()])}))";
		
		assertEquals("Correto", teste.checarExpressao(correto1.split("")));
		assertEquals("Correto", teste.checarExpressao(correto2.split("")));
		
		String incorreto1 = ")(( )){([( )])}";
		String incorreto2 = "({[])}";
		String incorreto3 = "(";
		
		assertEquals("Incorreto", teste.checarExpressao(incorreto1.split("")));
		assertEquals("Incorreto", teste.checarExpressao(incorreto2.split("")));
		assertEquals("Incorreto", teste.checarExpressao(incorreto3.split("")));
	}
}
