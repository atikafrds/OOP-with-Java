// NIM/Nama pengembang	: 13514009/Atika Firdaus
// Nama file			: mHerbivora.java

import org.junit.*;
import static org.junit.Assert.*;

public class mHerbivora {
	@Test
	public void test_updateAge() {
		Makhluk H1 = new Herbivora();
		int oldAge = H1.getAge();
		H1.update();
		assertEquals(H1.getAge(), (oldAge - 1));	
	}
	@Test
	public void test_updatePosition() {
		Makhluk H1 = new Herbivora();
		Point oldPos = H1.getPosition();
		switch (H1.getDirection()) {
			case 1:
				oldPos.move(0,-(H1.getSpeed()));
				break;
			case 2:
				oldPos.move(H1.getSpeed(),-(H1.getSpeed()));
				break;
			case 3:
				oldPos.move(H1.getSpeed(),0);
				break;
			case 4:
				oldPos.move(H1.getSpeed(),H1.getSpeed());
				break;
			case -1:
				oldPos.move(0,H1.getSpeed());
				break;
			case -2:
				oldPos.move((-H1.getSpeed()),-(H1.getSpeed()));
				break;
			case -3:
				oldPos.move(-(H1.getSpeed()),0);
				break;
			case -4:
				oldPos.move(-(H1.getSpeed()),H1.getSpeed());
				break;
		}
		H1.update();
		assertTrue((H1.getPosition().getX() == oldPos.getX()) && (H1.getPosition().getY() == oldPos.getY()));
	}
};