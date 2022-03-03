import java.util.*;
public class MiddleMark {
	public static void getMiddleMark() {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> marks = ParseIntInString.parseIntInString(scanner.next());
		double totalMark = 0;
		double markCount = 0;
		for(int mark : marks) {
			totalMark+= mark;
			markCount++;
		}
		System.out.print("Ваш средний балл - " + totalMark/markCount);
	}
}
