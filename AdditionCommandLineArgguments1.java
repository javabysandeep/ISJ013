public class AdditionCommandLineArgguments1 {

	public static void main(String[] args){

		float number1 = Float.parseFloat( args[0] ) ;
		float number2 = Float.parseFloat( args[1] ) ;
		System.out.println("Addition is "+ (number1+number2) );
	}

}