import java.util.Scanner;

public class Armstrong1 {
	
	public static int number;
	
	public Armstrong1(int number){
		Armstrong1.number=number;
	}
	
	public static int logic(){
		
		int temp, total = 0;
		int num=number;
		while(number>0)
		{
			temp = number % 10;
            total = total + temp*temp*temp;
            number =number/10;
		}
		if(total == num)
		{
         System.out.println(num + " is an Armstrong number");
		}
       else
            System.out.println(num + " is not an Armstrong number");
		return num;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scan= new Scanner(System.in);
		number=scan.nextInt();
		logic();
	}
}


