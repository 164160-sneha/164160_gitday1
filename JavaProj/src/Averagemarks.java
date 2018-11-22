import java.util.Scanner;

public class Averagemarks {
	public static void main(String[] args) {
		int sub1, sub2, sub3, i, avg, total;
		Scanner scan = new Scanner(System.in);
		int sub[][] = new int[3][3];

		for (i = 0; i < 3; i++) {
			System.out.println("Enter the three subject marks student"
					+ (i + 1));
			for (int j = 0; j < 3; j++) {
				sub[i][j] = scan.nextInt();
			}
		}
		System.out.println("Total and avg for for respective students");
		for (i = 0; i < 3; i++) {
			total = sub[i][0] + sub[i][1] + sub[i][2];
			avg = (total) / 3;
			System.out.println("total is " + total + " avg is " + avg);
		}
		System.out.println("Total and avg for for respective subjects");
		for (int j = 0; j < 3; j++) {
			total = sub[0][j] + sub[1][j] + sub[2][j];
			avg = (total) / 3;
			System.out.println("total is " + total + " avg is " + avg);
		}
	}
}
