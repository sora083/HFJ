import java.util.ArrayList;

public class DotCom {
	private ArrayList<String> localtionCells;
	private String name;

	public void setLocationCells(ArrayList<String> loc) {
		localtionCells = loc;
	}

	public void setName(String n) {
		name = n;
	}

	public String checkYourSelf(String userInput) {
		String result = "miss";
		int index = localtionCells.indexOf(userInput);
		if (index >= 0) {
			localtionCells.remove(index);

			if (localtionCells.isEmpty()) {
				result = "kill";
				System.out.println("Ouch! you sunk " + name + " : (");
			} else {
				result = "hit";
			}
		}
		return result;
	}
}