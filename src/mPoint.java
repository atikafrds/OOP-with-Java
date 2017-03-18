// NIM/Nama pengembang	: 13514009/Atika Firdaus
// Nama file			: mPoint.java

import org.junit.*;
import static org.junit.Assert.*;

public class mPoint {
	@Test
	public void test_getter() {
		Point P1 = new Point();
		Point P2 = new Point(1,2);
		assertTrue((P1.getX() == 0) && (P1.getY() == 0) && (P2.getX() == 1) && (P2.getY() == 2));
	}
	@Test
	public void test_setter() {
		Point P1 = new Point();
		Point P2 = new Point(1,2);
		P1.setXY(5,3);
		P2.setX(4);
		P2.setY(6);
		assertTrue((P1.getX() == 5) && (P1.getY() == 3) && (P2.getX() == 4) && (P2.getY() == 6));	
	}
	@Test
	public void test_equal() {
		Point P1 = new Point(1,2);
		Point P2 = new Point(2,1);
		Point P3 = new Point(3,3);
		Point P4 = new Point(3,3);
		assertTrue(!(P1.isEqual(P2)) && P3.isEqual(P4));
	}
	@Test
	public void test_move() {
		Point P1 = new Point();
		int dx = 1;
		int dy = 2;
		P1.move(dx,dy);
		assertTrue((P1.getX() == dx) && (P1.getY() == dy));
	}
};