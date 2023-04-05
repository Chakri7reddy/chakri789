import java.util.Scanner;
public class Exceptiontest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number");
		int a,b,c;
		try {
			a=scanner.nextInt();
			b=scanner.nextInt();
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("Please do input correctly");
		}
       	}

}
