import java.util.Scanner;

public class DumbCalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		float num1, num2, num3;

		System.out.print( "What is your first number? " );
		num1 = keyboard.nextFloat();

		System.out.print( "What is your second number? " );
		num2 = keyboard.nextFloat();

		System.out.print( "What is your third number? " );
		num3 = keyboard.nextFloat();

		System.out.println();
		System.out.println( "( " + num1 + " + " + num2 + " + " + num3 + " ) / 2 is... " + ( ( num1 + num2 + num3 ) / 2 ) );
	}
}

