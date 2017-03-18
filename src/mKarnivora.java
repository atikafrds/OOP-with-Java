// NIM/Nama pengembang	: 13514009/Atika Firdaus
// Nama file			: mKarnivora.java

import org.junit.*;
import static org.junit.Assert.*;

public class mKarnivora {
	@Test
	public void test_updateAge() {
		Makhluk K1 = new Karnivora();
		int oldAge = K1.getAge();
		K1.update();
		assertEquals(K1.getAge(), (oldAge - 1));	
	}
	@Test
	public void test_updatePosition() {
		Makhluk K1 = new Karnivora();
		Point oldPos = K1.getPosition();
		switch (K1.getDirection()) {
			case 1:
				oldPos.move(0,-(K1.getSpeed()));
				break;
			case 2:
				oldPos.move(K1.getSpeed(),-(K1.getSpeed()));
				break;
			case 3:
				oldPos.move(K1.getSpeed(),0);
				break;
			case 4:
				oldPos.move(K1.getSpeed(),K1.getSpeed());
				break;
			case -1:
				oldPos.move(0,K1.getSpeed());
				break;
			case -2:
				oldPos.move((-K1.getSpeed()),-(K1.getSpeed()));
				break;
			case -3:
				oldPos.move(-(K1.getSpeed()),0);
				break;
			case -4:
				oldPos.move(-(K1.getSpeed()),K1.getSpeed());
				break;
		}
		K1.update();
		assertTrue((K1.getPosition().getX() == oldPos.getX()) && (K1.getPosition().getY() == oldPos.getY()));
	}
};