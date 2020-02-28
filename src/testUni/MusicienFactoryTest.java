package testUni;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import orchestre.MusicienFactory;
import orchestre.Musiciens;

class MusicienFactoryTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Before

	
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	//test création musicien avec piano
	@Test
	void createPiano() {
		Musiciens piano =  MusicienFactory.getMusicien("test", "Piano");
		assertEquals(("Piano"), piano.getInstrument());
		assertEquals(("test"), piano.getNom());
		
	}
	
	@Test
	void createViolin() {
		Musiciens violin =  MusicienFactory.getMusicien("test", "Violon");
		assertEquals(("Violon"), violin.getInstrument());
		assertEquals(("test"), violin.getNom());
		
	}

	@Test
	void createTrumpet() {
		Musiciens trumpet =  MusicienFactory.getMusicien("test", "Trompette");
		assertEquals(("Trompette"), trumpet.getInstrument());
		assertEquals(("test"), trumpet.getNom());
		
	}


}
