package Easy;
//1118
public class NumberofDaysinaMonth {

	public static void main(String[] args) {
		System.out.println(numberOfDays(2000,2));

	}

	static int numberOfDays(int Y, int M) {		
		int daysOfMonth [][] = {
		        {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		        {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}};
        return daysOfMonth[isLeapYear(Y)][M - 1];
    }
	static int isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)?1:0;
    }
	
}
