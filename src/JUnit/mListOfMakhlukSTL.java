// NIM/Nama pengembang	: 13514009/Atika Firdaus
// Nama file			: mListOfMakhlukSTL.java

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class mListOfMakhlukSTL {
	@Test
	public void test_getAllMem() {
		ListOfMakhlukSTL L = new ListOfMakhlukSTL(10);
		Vector<Makhluk> V = new Vector<Makhluk>();
		Makhluk H = new Herbivora();
		Makhluk O = new Omnivora();
		L.add(H);
		L.add(O);
		V.add(H);
		V.add(O);
		assertEquals(V, L.getAllMem());
	}
	@Test
	public void test_addgetMem() {
		ListOfMakhlukSTL L = new ListOfMakhlukSTL(10);
		Makhluk H = new Herbivora();
		Makhluk O = new Omnivora();
		L.add(H);
		L.add(O);
		assertTrue((L.getMem(0) == H) && (L.getMem(1) == O));
	}
	@Test
	public void test_setMem() {
		ListOfMakhlukSTL L = new ListOfMakhlukSTL(10);
		Makhluk H = new Herbivora();
		Makhluk O = new Omnivora();
		L.setMem(0, H);
		L.setMem(1, O);
		assertTrue((L.getMem(0) == H) && (L.getMem(1) == O));
	}
	@Test
	public void test_remove() {
		ListOfMakhlukSTL L = new ListOfMakhlukSTL(10);
		Makhluk H = new Herbivora();
		L.add(H);
		L.remove(0);
		assertTrue(L.getAllMem().isEmpty());
	}
	@Test
	public void test_update() {
		ListOfMakhlukSTL L = new ListOfMakhlukSTL();
		Makhluk H = new Herbivora();
		Makhluk O = new Omnivora();
		Makhluk K = new Karnivora();
		int ageO = O.getAge() - 1;
		int ageK = K.getAge() - 1;
		H.setAge(1);
		L.add(H);
		L.add(O);
		L.add(K);
		L.update();
		assertTrue((L.getAllMem().size() == 2));
	}
};