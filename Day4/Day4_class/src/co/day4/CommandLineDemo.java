package co.day4;

public class CommandLineDemo {

	public static void main(String[] args) {
	String value = args[0];
	int number = Integer.parseInt(args[1]);
	float floatNum = Float.parseFloat(args[2]);
	System.out.println("Argument 1 : "+value);
	System.out.println("Argument 2 : "+number + 5);
	System.out.println("Argument 3 : "+floatNum);

	}

}
