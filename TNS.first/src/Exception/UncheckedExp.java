package Exception;

class Sample{
	int a=4,b=10;
	int c=a/b;
	public  void show()
	{
		
		System.out.println(this.c);
	}
}
public class UncheckedExp {

	public static void main(String[] args) {
		Sample s = new Sample();
		s.show();

	}

}