public class FloatingPoints 
{
	public static void main( String[] args )
	{
		// All of these lines print text and/or the result of the calculation or boolean comparison
		System.out.println( "I will now count my chickens: " );
		
		System.out.println( "Hens " + ( 25.0 + 30.0 / 6.0 ) ); 
		System.out.println( "Roosters " + (100.0 - 25.0 * 3.0 % 4.0 ) );
		
		System.out.println( "Now I will count the eggs:" );
		
		System.out.println( 3.0 + 2.0 + 1.0 - 5.0 + 4.0 % 2.0 - 1.0 / 4.0 + 6.0 );
	
		System.out.println( "Is it true that 3 + 2 < 5 - 7?" );
		
		System.out.println( 3.0 + 2.0 < 5.0 - 7.0 );
	
		System.out.println( "What is 3 + 2? " + ( 3.0 + 2.0 ) );
		System.out.println( "What is 5 - 7? " + ( 5.0 - 7.0 ) );

		System.out.println( "Oh, that's why it's false." );
	
		System.out.println( "How about some more." );

		System.out.println( "Is it greater? " + ( 5 > -2 ) );
		System.out.println( "Is it greater or equal? " + ( 5 >= -2 ) );
		System.out.println( "Is it less or equal? " + ( 5 <= -2 ) );
	}
}
