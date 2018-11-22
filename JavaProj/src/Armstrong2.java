public class Armstrong2 extends Armstrong1 {

	public Armstrong2(int number) {
		super(number);
		Armstrong2.number=number;
	}

	public static void logic1() {
		for (int i = 100; i <= 999; i++) {
			number = i;
			//int total=0;
			//while (number > 0) {
				logic();
		
			//if ( total==i) {
				//System.out.println("Armstrong numbers are");
				//System.out.println(""+i);	
			}
			//total=0;
		}
	//	}
	//}
	public static void main(String[] args) {
		logic1();
		//logic();
		
	}
}