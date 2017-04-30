//********************************************************************
// Hospital.java
//
// Programming Project 8.26 on page 466.
//********************************************************************

import java.util.Scanner;
import javax.swing.JFrame;
import java.io.*;

public class Hospital {

	public static void main(String[] args) throws IOException {

		final int WEEKS = 4, DAYS = 7, HOURS = 24, HOUR_COLS = 6;

		int[][][] data = new int[WEEKS][DAYS][HOURS];
		int[][] daySums = new int[WEEKS][DAYS];
		int[] weekSums = new int[WEEKS];

		Scanner fileScan = new Scanner(new File(args[0]));

		while(fileScan.hasNext()) {
			for(int week = 0; week < WEEKS; week++) {
				int weekSum = 0;
				for(int day = 0; day < DAYS; day++) {
					int daySum = 0;
					for(int hour = 0; hour < HOURS; hour++) {
						data[week][day][hour] = fileScan.nextInt();
						weekSum += data[week][day][hour];
						daySum += data[week][day][hour];
					}
					daySums[week][day] = daySum;
				}
				weekSums[week] = weekSum;
			}
		}

		String result = "";
		for(int week = 0; week < WEEKS; week++) {
			result += "Week " + (week+1) + " (" + weekSums[week] + "):" + "\n";
			for(int day = 0; day < DAYS; day++) {
				result += "  Day " + (day+1) + " (" + daySums[week][day] + "):" + "\n";
				for(int hour = 0; hour < HOURS; hour+=HOUR_COLS) {
					int i = 0;
					while(i < HOUR_COLS) {
						result += (hour+1+i < 10 ? "    " : "   ") + "Hour " + (hour+1+i) + ": " + data[week][day][hour + i];
						i++;
					}
					result += "\n";
				}
			}
			result += "\n";
		}

		System.out.println(result);
	}

}