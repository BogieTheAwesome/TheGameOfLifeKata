package gameOfLife;

import java.util.ArrayList;
import java.util.List;

public class Cell{
	private boolean IsAlive;
	private List<Cell> Neighbors;
	
	private final int STARVATION_THRESHOLD = 2;
	private final int OVER_CROWDING_THRESHOLD = 3;
	private final int REVIVAL_COUNT = 3;
	
	public Cell(boolean isAlive) {
		IsAlive = isAlive;
		Neighbors = new ArrayList<Cell>();
	}
	
	public boolean IsAlive() {
		return IsAlive;
	}

	public void AddNeighbor(Cell neighbor) {
		Neighbors.add(neighbor);
	}

	public void calculateState() {
	   int liveNeighbors = CountLiveNeighbors();
	   
	   if(IsAlive && (IsStarved(liveNeighbors) || IsOverCrowded(liveNeighbors))) {
		   IsAlive = false;
	   }
	   else if(!IsAlive && IsRevived(liveNeighbors)){
		   IsAlive = true;
	   }
	}

	private int CountLiveNeighbors() {
		int liveNeighbors = 0;
		for(Cell neighbor : Neighbors) {
			if(neighbor.IsAlive() == true) {
				liveNeighbors++;
			}
		}
		return liveNeighbors;
	}

	private boolean IsStarved(int liveNeighbors) {
		return liveNeighbors < STARVATION_THRESHOLD;
	}
	
	private boolean IsOverCrowded(int liveNeighbors) {
		return liveNeighbors > OVER_CROWDING_THRESHOLD;
	}

	private boolean IsRevived(int liveNeighbors) {
		return liveNeighbors == REVIVAL_COUNT;
	}
}
