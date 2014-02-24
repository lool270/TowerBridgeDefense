package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class AfspraakTest {

	Tandarts jansen = new Tandarts(11, "jansen");
	Tandarts De_Gooy = new Tandarts(13,"De Gooy");
	@Test
	public void testHashCode() {
		
	}

	@Test
	public void testEqualsObject() {
		Tandarts jansen = new Tandarts();
		assertNotNull(jansen);
		AfspraakTest De_Gooy = null;
		assertNull(De_Gooy);
	}

	
	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAfspraaknr() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAfspraaknr() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAfspraakdatum() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAfspraakdatum() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPatient() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPatient() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTandarts() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetTandarts() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBehandeling() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetBehandeling() {
		fail("Not yet implemented");
	}

}
