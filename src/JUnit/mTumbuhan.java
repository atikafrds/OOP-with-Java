// NIM/Nama pengembang	: 13514009/Atika Firdaus
// Nama file			: mTumbuhan.java

import org.junit.*;
import static org.junit.Assert.*;

public class mTumbuhan {
	@Test
	public void test_updateAge() {
		Makhluk T1 = new Tumbuhan();
		int oldAge = T1.getAge();
		T1.update();
		assertEquals(T1.getAge(), (oldAge - 1));	
	}
};