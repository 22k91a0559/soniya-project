package Exception;

public class TryCatch {
	public static void main(String args[])
	{
	int a=3,b=0;
	try {
		int c=a/b;
		System.out.println(c);
		}catch(Exception e)
	{
			System.out.println("Number cannot be divided");
	}
	}
	
}