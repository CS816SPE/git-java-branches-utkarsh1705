import java.util.Scanner;
public class caladd{
	public static void main (String arg[]){
	float a,b,res;
	char choice,ch;
	Scanner scan = new Scanner(System.in);
	
	do {
		System.out.print("1. Add two numbers\n");
		System.out.print("2. Mul two numbers\n");
		System.out.print("3. Exit\n");
		System.out.print("Enter yout choice : ");
		choice = scan.next.charAt(0);
		switch(choice){
			case '1':System.out.print("Enter Two Number : ");
				a = scan.nextFloat();
				b = scan.nextFloat();
				res = a + b;
				System.out.print("Result = "+res);
				break;
			case '2':System.out.print("Enter Two Number : ");
				a = scan.nextFloat();
				b = scan.nextFloat();
				res = a * b;
				System.out.print("Result = "+res);
				break;
			case '3':System.exit(0);
				break;
			default : System.out.print("INVALID CHOICE!!!!");
				break;
			}
		System.out.print("\n----------------------------------------------\n");
		}while(choice!=3);
	}
}	
