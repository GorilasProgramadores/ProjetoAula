package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import source.NodePositionList;
import source.Position;

class NodePositionListTest {

	@Test
	void test() {
		NodePositionList<Integer> l = new NodePositionList<Integer>();
		assertEquals("[]", l.toString(), "[]");
		l.addFirst(8);
		assertEquals("[8]", l.toString(), "[8]");
		Position<Integer> p1 = l.first();
		assertEquals(8, p1.element(), "8");
		assertEquals("[8]", l.toString(), "[8]");
		l.addAfter(p1, 5);
		assertEquals("[8, 5]", l.toString(), "[8, 5]");
		Position<Integer> p2 = l.next(p1);
		assertEquals(5, p2.element(), "5");
		assertEquals("[8, 5]", l.toString(), "[8, 5]");
		l.addBefore(p2, 3);
		assertEquals("[8, 3, 5]", l.toString(), "[8, 3, 5]");
		Position<Integer> p3 = l.prev(p2);
		assertEquals(3, p3.element(), "3");
		assertEquals("[8, 3, 5]", l.toString(), "[8, 3, 5]");
		l.addFirst(9);
		assertEquals("[9, 8, 3, 5]", l.toString(), "[9, 8, 3, 5]");
		p2 = l.last();
		assertEquals(5, p2.element(), "5");
		assertEquals("[9, 8, 3, 5]", l.toString(), "[9, 8, 3, 5]");
		assertEquals(9, l.remove(l.first()), "9");
		assertEquals("[8, 3, 5]", l.toString(), "[8, 3, 5]");
		assertEquals(3, l.set(p3, 7), "3");
		assertEquals("[8, 7, 5]", l.toString(), "[8, 7, 5]");
		l.addAfter(l.first(), 2);
		assertEquals("[8, 2, 7, 5]", l.toString(), "[8, 2, 7, 5]");
	}
	
	// exe11
	@Test
	void reverter() {
		
		NodePositionList<Integer> a = new NodePositionList<Integer>();
		
		assertEquals("[]", a.toString(), "[]");		
		a.addFirst(2);
		
		Position<Integer> p1 = a.first();
		a.addAfter(p1, 4);
		Position<Integer> p2 = a.next(p1);
		assertEquals("[2, 4]", a.toString(), "[2, 4]");		
		
		a.reverter();
		assertEquals("[4, 2]", a.toString(), "[4, 2]");
		
		assertEquals(2, p1.element(), "4");
		assertEquals(4, p2.element(), "2");		
		
		a.addBefore(p2, 6);
		a.addFirst(8);
		assertEquals("[8, 6, 4, 2]", a.toString(), "[8, 6, 4, 2]");
		
		a.reverter();
		a.addLast(10);		
		assertEquals("[2, 4, 6, 8, 10]", a.toString(), "[2, 4, 6, 8, 10]");
		
		a.reverter();		
		assertEquals("[10, 8, 6, 4, 2]", a.toString(), "[10, 8, 6, 4, 2]");		
	}
	
	// exe12
	@Test
	void makeFirst() {
		
		NodePositionList<Integer> M = new NodePositionList<Integer>();
		assertEquals("[]", M.toString(), "[]");
		
		M.addFirst(2);
		Position<Integer> p1 = M.first();
		M.addLast(4);
		Position<Integer> p2 = M.next(p1);
		
		M.addAfter(p2, 6);
		Position<Integer> p3 = M.next(p2);
		assertEquals("[2, 4, 6]", M.toString(), "[2, 4, 6]");
		
		M.makeFirst(p3);
		assertEquals("[6, 2, 4]", M.toString(), "[6, 2, 4]");
		
		M.reverter();
		assertEquals("[4, 2, 6]", M.toString(), "[4, 2, 6]");
		
		M.makeFirst(p1);
		assertEquals("[2, 4, 6]", M.toString(), "[2, 4, 6]");
	}

}
