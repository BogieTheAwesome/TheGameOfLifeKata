package gameOfLife;

import java.util.Random;

public class CellFactory {

	public Cell CreateRandomCell() {
		Random random = new Random();
		return new Cell(random.nextBoolean());
	}

}
