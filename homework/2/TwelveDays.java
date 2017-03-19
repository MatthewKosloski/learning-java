//********************************************************************
// TwelveDays.java
//
// Programming Project 6.10 on page 323.
//********************************************************************

public class TwelveDays {
	public static void main(String[] args) {

		for(int i = 1; i <= 12; i++) {
			String day = "", line = "";

			switch(i) {
				case 1: {
					day = "1st";
					line += "A partridge in a pear tree.\n";
					break;
				}
				case 2: {
					day = "2nd";
					line += "2 Turtle Doves\n";
					line += "and a partridge in a pear tree.\n";
					break;
				}
				case 3: {
					day = "3rd";
					line += "3 French Hens\n";
					line += "2 Turtle Doves\n";
					line += "and a partridge in a pear tree.\n";
					break;
				}
				case 4: {
					day = "4th";
					line += "4 Calling Birds\n";
					line += "3 French Hens\n";
					line += "2 Turtle Doves\n";
					line += "and a partridge in a pear tree.\n";
					break;
				}
				case 5: {
					day = "5th";
					line += "5 Golden Rings\n";
					line += "4 Calling Birds\n";
					line += "3 French Hens\n";
					line += "2 Turtle Doves\n";
					line += "and a partridge in a pear tree.\n";
					break;
				}
				case 6: {
					day = "6th";
					line += "6 Geese a Laying\n";
					line += "5 Golden Rings\n";
					line += "4 Calling Birds\n";
					line += "3 French Hens\n";
					line += "2 Turtle Doves\n";
					line += "and a partridge in a pear tree.\n";
					break;
				}
				case 7: {
					day = "7th";
					line += "7 Swans a Swimming\n";
					line += "6 Geese a Laying\n";
					line += "5 Golden Rings\n";
					line += "4 Calling Birds\n";
					line += "3 French Hens\n";
					line += "2 Turtle Doves\n";
					line += "and a partridge in a pear tree.\n";
					break;
				}
				case 8: {
					day = "8th";
					line += "8 Maids a Milking\n";
					line += "7 Swans a Swimming\n";
					line += "6 Geese a Laying\n";
					line += "5 Golden Rings\n";
					line += "4 Calling Birds\n";
					line += "3 French Hens\n";
					line += "2 Turtle Doves\n";
					line += "and a partridge in a pear tree.\n";
					break;
				}
				case 9: {
					day = "9th";
					line += "9 Ladies Dancing\n";
					line += "8 Maids a Milking\n";
					line += "7 Swans a Swimming\n";
					line += "6 Geese a Laying\n";
					line += "5 Golden Rings\n";
					line += "4 Calling Birds\n";
					line += "3 French Hens\n";
					line += "2 Turtle Doves\n";
					line += "and a partridge in a pear tree.\n";
					break;
				}
				case 10: {
					day = "10th";
					line += "10 Lords a Leaping\n";
					line += "9 Ladies Dancing\n";
					line += "8 Maids a Milking\n";
					line += "7 Swans a Swimming\n";
					line += "6 Geese a Laying\n";
					line += "5 Golden Rings\n";
					line += "4 Calling Birds\n";
					line += "3 French Hens\n";
					line += "2 Turtle Doves\n";
					line += "and a partridge in a pear tree.\n";
					break;
				}
				case 11: {
					day = "11th";
					line += "11 Pipers Piping\n";
					line += "10 Lords a Leaping\n";
					line += "9 Ladies Dancing\n";
					line += "8 Maids a Milking\n";
					line += "7 Swans a Swimming\n";
					line += "6 Geese a Laying\n";
					line += "5 Golden Rings\n";
					line += "4 Calling Birds\n";
					line += "3 French Hens\n";
					line += "2 Turtle Doves\n";
					line += "and a partridge in a pear tree.\n";
					break;
				}
				case 12: {
					day = "12th";
					line += "12 Drummers Drumming\n";
					line += "11 Pipers Piping\n";
					line += "10 Lords a Leaping\n";
					line += "9 Ladies Dancing\n";
					line += "8 Maids a Milking\n";
					line += "7 Swans a Swimming\n";
					line += "6 Geese a Laying\n";
					line += "5 Golden Rings\n";
					line += "4 Calling Birds\n";
					line += "3 French Hens\n";
					line += "2 Turtle Doves\n";
					line += "and a partridge in a pear tree.\n";
					break;
				}
			}

			System.out.println(String.format("On the %1$s day of Christmas, my true love gave to me\n%2$s", day, line));
		}
	
	}
}