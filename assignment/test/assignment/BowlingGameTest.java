package assignment;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {

	Game g;
	
	@Before
	public void setUp() {
		g=new Game();
	}
	
	@Test
	public void testAllGutterGame() {
		for (int i=0; i<20; i++) {
			g.roll(0);
		}
		assertEquals(0, g.score());
	}
	@Test
	public void testAllOnes() {
		for (int i=0; i<20; i++) {
			g.roll(1);
		}
		assertEquals(20,g.score());
	}	

}
