package assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class bowlingUnitTest {	
	@Test
	void testAllGutterGame() {
		Game g = new Game();
		for (int i=0; i<20; i++) {
			g.roll(0);
		}
		assertEquals(0, g.score());
	}
}
