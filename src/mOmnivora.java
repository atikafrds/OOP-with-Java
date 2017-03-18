// NIM/Nama pengembang	: 13514009/Atika Firdaus
// Nama file			: mOmnivora.java

import org.junit.*;
import static org.junit.Assert.*;

public class mOmnivora {
	@Test
	public void test_updateAge() {
		Makhluk O1 = new Omnivora();
		int oldAge = O1.getAge();
		O1.update();
		assertEquals(O1.getAge(), (oldAge - 1));	
	}
	@Test
	public void test_updatePosition() {
		Makhluk O1 = new Omnivora();
		Point oldPos = O1.getPosition();
		switch (O1.getDirection()) {
			case 1:
				oldPos.move(0,-(O1.getSpeed()));
				break;
			case 2:
				oldPos.move(O1.getSpeed(),-(O1.getSpeed()));
				break;
			case 3:
				oldPos.move(O1.getSpeed(),0);
				break;
			case 4:
				oldPos.move(O1.getSpeed(),O1.getSpeed());
				break;
			case -1:
				oldPos.move(0,O1.getSpeed());
				break;
			case -2:
				oldPos.move((-O1.getSpeed()),-(O1.getSpeed()));
				break;
			case -3:
				oldPos.move(-(O1.getSpeed()),0);
				break;
			case -4:
				oldPos.move(-(O1.getSpeed()),O1.getSpeed());
				break;
		}
		O1.update();
		assertTrue((O1.getPosition().getX() == oldPos.getX()) && (O1.getPosition().getY() == oldPos.getY()));
	}
};