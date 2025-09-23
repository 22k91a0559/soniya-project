package Exception;

public class MultipleCatches {

	public static void main(String[] args) {
		String s = null;
		try {
			System.out.println(s.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("This is Arithmetic Exception");
		}
		
		
		

	}

}