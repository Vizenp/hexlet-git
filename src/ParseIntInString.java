import java.util.ArrayList;

public class ParseIntInString {
	public static ArrayList<Integer> parseIntInString(String str) {
		char[] nums = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
		ArrayList<Integer> marks = new ArrayList<Integer>();
		
		for(char num : nums) {
			for(int i = 0; i < str.length();i++) {
				if(num == str.charAt(i)) {
					marks.add(Character.getNumericValue(num));
				}
			}
		}
		return marks;		
	}
}
