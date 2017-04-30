import java.util.*;

public class Histogram {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final String SYMBOL = "#";
		String userInput = "", output = "";
		System.out.print("Enter in students' scores (separate with spaces):");
		userInput = scan.nextLine();

		ArrayList<Integer> scores = new ArrayList<Integer>();

		for(int i = 0; i < userInput.split(" ").length; i++) {
			scores.add(Integer.parseInt(userInput.split(" ")[i]));
		}

		String[][] lines = {
			{"0  - 10", ""}, {"11 - 20", ""}, {"21 - 30", ""},
			{"31 - 40", ""}, {"41 - 50", ""}, {"51 - 60", ""},
			{"61 - 70", ""}, {"71 - 80", ""}, {"81 - 90", ""},
			{"91 - 100", ""}
		};

		for(int i = 0; i < scores.size(); i++) {
			int n = scores.get(i);
			if(n >= 0 && n <= 10) {
				lines[0][1] += SYMBOL;
			} else if(n >= 11 && n <= 20) {
				lines[1][1] += SYMBOL;
			} else if(n >= 21 && n <= 30) {
				lines[2][1] += SYMBOL;
			} else if(n >= 31 && n <= 40) {
				lines[3][1] += SYMBOL;
			} else if(n >= 41 && n <= 50) {
				lines[4][1] += SYMBOL;
			} else if(n >= 51 && n <= 60) {
				lines[5][1] += SYMBOL;
			} else if(n >= 61 && n <= 70) {
				lines[6][1] += SYMBOL;
			} else if(n >= 71 && n <= 80) {
				lines[7][1] += SYMBOL;
			} else if(n >= 81 && n <= 90) {
				lines[8][1] += SYMBOL;
			} else if(n >= 91 && n <= 100) {
				lines[9][1] += SYMBOL;
			} 
		}

		int i = lines.length - 1;
		while(i >= 0) {
			output += lines[i][0] + (lines[i][0].length() == 8 ? " | " : "  | ") + lines[i][1] + "\n";
			i--;
		}

		System.out.println(output);
	}

}