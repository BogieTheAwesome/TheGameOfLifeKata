package gameOfLife;

import static org.junit.Assert.*;

import org.junit.Test;

public class CellFactoryTest {
	@Test
	public void aCreateRandomCellCallToCellFactoryReturnsACell() {
		CellFactory cellFactory = new CellFactory();
		
		Cell newCell = cellFactory.CreateRandomCell();
		assertNotNull(newCell);
	}
	
	@Test
	public void multipleCreateRandomCellCallsToCellFactoryReturnsUniqueCells() {
		CellFactory cellFactory = new CellFactory();
		
		Cell newCell1 = cellFactory.CreateRandomCell();
		Cell newCell2 = cellFactory.CreateRandomCell();
		
		assertNotEquals(newCell1, newCell2);
	}
}
