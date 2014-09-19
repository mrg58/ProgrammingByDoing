import java.util.Scanner;

public class BMI
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		float height, weight;

		System.out.print( "Your height in m: " );
		height = keyboard.nextFloat();

		System.out.print( "Your weight in kg: " );
		weight = keyboard.nextFloat();

		System.out.println();
		System.out.println( "Your BMI is " + ( weight / Math.pow( height, 2 ) ) ); 
	}
}

