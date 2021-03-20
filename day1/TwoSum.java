import java.io.File;
import java.util.Scanner;
import java.util.HashSet;
public class TwoSum {
	public static void main(String[] args) throws Exception {
    		File input = new File("./input.txt"); 
    		Scanner sc = new Scanner(input); 
  		HashSet<Integer> entries = new HashSet<Integer>();
		int sum = 2020;
		int answer = 0;
    		while (sc.hasNextLine()) {
			int entry = Integer.parseInt(sc.nextLine());
			if (entries.contains(sum - entry)) {
				answer = entry * (sum - entry);
				break;
			}
			entries.add(entry);
		}
		if (answer != 0) System.out.println(answer);
	}
}
