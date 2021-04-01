package day30_wrapperClass;

public class commandLineArgument {

	public static void main(String[] args) {
		
		// there is a main method accepting a String type array called args as an argument
		
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);	// this code works when you run from command line
			
			
	// interview question : How you are using commandLine Argument for example?
			// answer is: In the command line after I compile when I run/execute my code with java class name 
			// and then I pass array elements ( array data type here String and name is args here main method puts args name 
			// but args name may change )
		}

	}

}
