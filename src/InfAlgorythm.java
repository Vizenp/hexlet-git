import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InfAlgorythm {
	
	public static void main(String[] args) {
		algorithmPage148(3);
	}
	
	public static int algorithm201(int x, int y) {
		while(x!=y) {
			if(x>y) {
				x = x - y;
			}
			else {
				y = y - x;
			}
		}
		return x; //написал Калинский Виталий. упражнение 201
	}

  public static void algorithmPage148(int times){
    String[] words = new String[times];
    String[] cases = new String[Factorial.getFactorial(times)];
    int a = 0;

    //заполняем список словами
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < times; i++) {
      words[i] = scanner.nextLine();
    }

    //создаём список возможных случаев
    for(String l1 : words){
      for(String l2 : words){
        for(String l3 : words){
          if(l1 == l2 || l1 == l3 || l2==l3 )continue;
          cases[a] = l1 + " " + l2 + " " + l3;
          a++;
        }
      }
    }
    System.out.println(Arrays.toString(cases));
    System.out.println(cases.length);
  }
}
