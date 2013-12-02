package gameOfLife;

import static org.junit.Assert.*;

import org.junit.Test;

public class CellTest {
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

	@Test
	public void aLiveCellWithFewerThanTwoLiveNeighborsDiesFromStarvation() {
		Cell cell = new Cell(true);
		Cell topNeighbor = new Cell(true);
		Cell bottomNeighbor = new Cell(false);
		Cell rightNeighbor = new Cell(false);
		Cell leftNeighbor = new Cell(false);
		
		cell.AddNeighbor(topNeighbor);
		cell.AddNeighbor(bottomNeighbor);
		cell.AddNeighbor(rightNeighbor);
		cell.AddNeighbor(leftNeighbor);
		
		cell.calculateState();
		
		assertFalse(cell.IsAlive());
	}
	
	@Test
	public void aLiveCellWithMoreThanThreeLiveNeighborsDiesFromOverCrowding() {
		Cell cell = new Cell(true);
		Cell topNeighbor = new Cell(true);
		Cell bottomNeighbor = new Cell(true);
		Cell rightNeighbor = new Cell(true);
		Cell leftNeighbor = new Cell(true);
		
		cell.AddNeighbor(topNeighbor);
		cell.AddNeighbor(bottomNeighbor);
		cell.AddNeighbor(rightNeighbor);
		cell.AddNeighbor(leftNeighbor);
		
		cell.calculateState();
		
		assertFalse(cell.IsAlive());
	}
	
	@Test
	public void aDeadCellWithExactlyThreeLiveNeighborsIsRevived() {
		Cell cell = new Cell(false);
		Cell topNeighbor = new Cell(true);
		Cell bottomNeighbor = new Cell(true);
		Cell rightNeighbor = new Cell(true);
		Cell leftNeighbor = new Cell(false);
		
		cell.AddNeighbor(topNeighbor);
		cell.AddNeighbor(bottomNeighbor);
		cell.AddNeighbor(rightNeighbor);
		cell.AddNeighbor(leftNeighbor);
		
		cell.calculateState();
		
		assertTrue(cell.IsAlive());
	}
}
