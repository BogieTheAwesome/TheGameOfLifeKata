package gameOfLife;

public class Grid {
	private Cell[] Rows;
	private Cell[] Columns;

	public Grid(int size, CellFactory cellFactory) {
		Rows = new Cell[size];
		Columns = new Cell[size];
	}

	public int getRows() {
		return Rows.length;
	}

	public int getColumns() {
		return Columns.length;
	}
}
