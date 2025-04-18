public class AdditionCommandLineArgguments {

	public static void main(String[] args){

		int number1 = Integer.parseInt( args[0] ) ;
		int number2 = Integer.parseInt( args[1] ) ;
		System.out.println("Addition is "+ (number1+number2) );
	}

}