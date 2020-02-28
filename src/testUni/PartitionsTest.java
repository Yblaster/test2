package testUni;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import orchestre.Partitions;

class PartitionsTest {

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
	
	@Test
	void testCreatePartitions() {
		Partitions partition1 = new Partitions("part1", "A");
		assertEquals(("part1"), partition1.getNom());
		assertEquals(("A"), partition1.getTonalite());

	}

}
