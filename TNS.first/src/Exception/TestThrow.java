package Exception;

class TestThrowDemo {
	public static void calAge(int age)
	{
		if(age<18)
			throw new ArithmeticException("The age is lessthan 18 ");
		else
			System.out.println("Eligible for voting");
	}
	
}
class TestThrow{
	public static void main(String args[])
	{
		TestThrowDemo.calAge(2);
	}
}
