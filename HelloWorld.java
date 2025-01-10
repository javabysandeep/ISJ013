public class HelloWorld {

	public static void main(String[] args){

		System.out.println(args[0]);

		System.out.println("for loop");


		for(String str: args){

			System.out.println(str);
		}
	}

}