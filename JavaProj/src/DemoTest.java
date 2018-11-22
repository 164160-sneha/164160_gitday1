import java.util.Scanner;

public class DemoTest {
	int numbers[] = new int[5];
	int temp, big = 0, small = 9999;

	public void get() {
		System.out.println("enter the values");
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			numbers[i] = scan.nextInt();
		}
	}

	public void ascending() {
		System.out.println("ascending");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if (numbers[j] > numbers[j + 1]) {
					temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}
		out();
	}

	public void descending() {
		System.out.println("descending");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if (numbers[j] < numbers[j + 1]) {
					temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}
		out();

	}

	public void biggest() {
		for (int i = 0; i < 5; i++) {
			if (numbers[i] > big) {
				big = numbers[i];
			}
		}
		System.out.println("Biggest number is " + big);
	}

	public void smallest() {
		for (int i = 0; i < 5; i++) {
			if (numbers[i] < small) {
				small = numbers[i];
			}
		}
		System.out.println("Smallest number is " + small);
	}

	public void out() {
		for (int i = 0; i < 5; i++) {
			System.out.println("" + numbers[i]);
		}

	}
}
