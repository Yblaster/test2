package testUni;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import orchestre.MusicienFactory;
import orchestre.Musiciens;
import orchestre.Partitions;
import orchestre.Serveur;

class ServeurTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Before
	public void setup() {
		Serveur serveur = Serveur.getInstanceOfServeur();
	}
	
	@Test
	void testAddMusicien() {
		
		Musiciens piano =  MusicienFactory.getMusicien("beethoven", "Piano");
		int nbrMusicien = Serveur.nbrMusicien();
		Serveur.addMusicien(piano);
		assertEquals((nbrMusicien + 1), Serveur.nbrMusicien());

	}
	
	@Test
	void testEraseMusicien() {
		
		Musiciens piano =  MusicienFactory.getMusicien("beethoven", "Piano");
		Serveur.addMusicien(piano);
		int nbrMusicien = Serveur.nbrMusicien();
		Serveur.eraseMusicien(piano);
		assertEquals((nbrMusicien - 1), Serveur.nbrMusicien());

	}
	@Test
	void testAddPartition() {
	
		Partitions partition1 = new Partitions("part1", "A");
		int nbrPartition = Serveur.nbrPartition();
		Serveur.addPartition(partition1);
		assertEquals((nbrPartition + 1), Serveur.nbrPartition());

	}
	

	
}
