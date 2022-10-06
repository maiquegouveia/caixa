package entities;

public class Validation {
	public int userID;
	
	int user1 = 123456;
	int user2 = 745464;
	int user3 = 757456;
	int user4 = 746841;
	int admID = 446516;
	
	public int checkID() {
		int isvalid=0;
		if (userID == user1 || userID == user2 || userID == user3 || userID == user4 || userID == admID) {
			isvalid = 1;
		}
		return isvalid;
	}
	
}
