import java.util.Scanner;


public class Incometax {
	public static void main(String[] args) {
		int ctc,tax;
		System.out.println("Enter your CTC");
		Scanner scan= new Scanner(System.in);
		ctc=scan.nextInt();
		scan.close();
		int newctc=ctc-180000;
		if(ctc<=180000)
		{
			System.out.println("No tax");
		}
		else if(newctc>=180001 & newctc<=300000)
		{
			tax=newctc*10/100;
			System.out.println("Income tax is " +tax);
		}
		else if(newctc>=300001 & newctc<=500000)
		{
			tax=newctc*20/100;
			System.out.println("Income tax is " +tax);
		}
		else if(newctc>=500001 & newctc<=1000000)
		{
			tax=newctc*30/100;
			System.out.println("Income tax is " +tax);
		}
		else
			System.out.println("invald");
	}

}
