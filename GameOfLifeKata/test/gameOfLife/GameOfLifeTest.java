package gameOfLife;


import static org.junit.Assert.*;
import org.junit.Test;

public class GameOfLifeTest {

	@Test
	public void aLiveCellInformsUserThatItIsAlive() {
		Cell cell = new Cell(true);
		assertTrue(cell.IsAlive());
	}
	
	@Test
	public void aDeadCellInformsUserThatItIsNotAlive() {
		Cell cell = new Cell(false);
		assertFalse(cell.IsAlive());
	}

}
