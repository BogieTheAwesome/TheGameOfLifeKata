package gameOfLife;


import static org.junit.Assert.*;

import org.junit.Test;

public class GameOfLifeTest {

	@Test
	public void aSquareCellGridCanReportItsSizeToAUser() {
		CellFactory cellFactory = new CellFactory();
		Grid grid = new Grid(10, cellFactory);
		
		assertEquals(10, grid.getRows());
		assertEquals(10, grid.getColumns());
	}
}
