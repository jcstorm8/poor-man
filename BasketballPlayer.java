package prob1;

public class BasketballPlayer {

   //hello world!

	private int	freeThrowsAttempted;
	private int	freeThrowsMade;
	private String name;
	private int	twoPointersAttempted;
	private int	twoPointersMade;
	private int	threePointersAttempted;
	private int	threePointersMade;
	
	public BasketballPlayer(String name) {
		this.name = name;
	}
	
	//getter
	public int getFreeThrowsAttempted() {
		return freeThrowsAttempted;
	}
	
	//getter
	public int getFreeThrowsMade() {
		return freeThrowsMade;
	}
	
	public void shootFreeThrow(boolean isMade) {
		freeThrowsAttempted++;
		if(isMade) {
			freeThrowsMade++;
		}
	}
	
	public double getFreeThrowPercent() {
		if(freeThrowsAttempted==0) {
			return 0.0;
		}
		double percent = 100.0 * freeThrowsMade / freeThrowsAttempted;
		return percent;
	}
	
	//getter
	public int getTwoPointersAttempted() {
		return twoPointersAttempted;
	}
	
	//getter
	public int getTwoPointersMade() {
		return twoPointersMade;
	}
	
	public void shootTwoPointer(boolean isMade) {
		twoPointersAttempted++;
		if(isMade) {
			twoPointersMade++;
		}
	}
	
	public double getTwoPointerPercent() {
		if(twoPointersAttempted==0) {
			return 0.0;
		}
		double percent = 100.0 * twoPointersMade / twoPointersAttempted;
		return percent;
	}
	
	//getter
	public int getThreePointersAttempted() {
		return threePointersAttempted;
	}
	
	//getter
	public int getThreePointersMade() {
		return threePointersMade;
	}
	
	public void shootThreePointer(boolean isMade) {
		threePointersAttempted++;
		if(isMade) {
			threePointersMade++;
		}
	}
	
	public double getThreePointerPercent() {
		if(threePointersAttempted ==0) {
			return 0.0;
		}
		double percent = 100.0* threePointersMade / threePointersAttempted;
		return percent;
	}
	
	public int getTotalPoints() {
		int points = 1*freeThrowsMade + 2*twoPointersMade + 3*threePointersMade;
		return points;
	}
	
	@Override
	public String toString() {
		String str = String.format("Player:%s , points:%d , \n Free Throws: made:%d , attempted:%d , percent:%.1f , \n 2 Pointers: made:%d , attempted:%d , percent:%.1f , \n Three Pointers: made:%d , attempted:%d , percent:%.1f" ,
				name , getTotalPoints() , freeThrowsMade , freeThrowsAttempted , getFreeThrowPercent() , twoPointersMade , twoPointersAttempted, getTwoPointerPercent() , threePointersMade , threePointersAttempted, getThreePointerPercent() );
		return str;
	}
}
