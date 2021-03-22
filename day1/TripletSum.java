import java.io.File;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class TripletSum {
	public static void main(String[] args) throws Exception {
    		File input = new File("./input.txt"); 
    		Scanner sc = new Scanner(input); 
		
		List<Integer> entries = new ArrayList<Integer>();
		int sum = 2020;
		int answer = 0;

		while (sc.hasNextLine()) {
			int entry = Integer.parseInt(sc.nextLine());
			entries.add(entry);
		}
		
		Collections.sort(entries);
		int inputSize = entries.size();

		for (int i = 0; i < inputSize - 2; i++) {
			boolean isTriplet = false;
			int first = i + 1;
			int last = inputSize - 1;
			while(first < last) {
				int tripletSum = entries.get(i) + entries.get(first) + entries.get(last);
				if (tripletSum == sum) {
					isTriplet = true;
					answer = entries.get(i) * entries.get(first) * entries.get(last);
					break;
				} 
				else if (tripletSum < sum) first++;
				else if (tripletSum > sum) last--;
			}
			if (isTriplet) break;
		}

		if (answer != 0) System.out.println(answer);
		else System.out.println("Chomed");
	}	
}
