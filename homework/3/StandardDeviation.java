//********************************************************************
// Email.java
//
// Programming Project 8.5 on page 463.
//********************************************************************

import java.util.Arrays;

public class StandardDeviation {

	public static void main(String[] args) {
		int data[] = {2, 4, 4, 4, 5, 5, 7, 9};
		double mean = getMean(data), deviation = getDeviation(data);

		System.out.println("Data: " + Arrays.toString(data));
		System.out.println("Mean: " + mean);
 		System.out.println("Deviation: " + deviation);
	}

	public static double getMean(int[] nums) {
		int sum = 0;
		for(int i = 0; i < nums.length; i++){
			sum += nums[i];
		}
		return (double) (sum / nums.length);
	}
 
	public static double getDeviation(int[] nums) {

		double mean = getMean(nums);
		double deviations = 0.0;

		for(int i = 0; i < nums.length; i++) {
			double deviation = (double) Math.pow((nums[i] - mean), 2);
			deviations += deviation;
		}

		return (double) Math.sqrt((deviations) / nums.length);
	}

}