package gameOfLife;

public class Cell{
	private boolean IsAlive;
	
	public Cell(boolean isAlive) {
		IsAlive = isAlive;
	}
	
	public boolean IsAlive() {
		return IsAlive;
	}
}
