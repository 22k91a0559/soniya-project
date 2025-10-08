package Lamda;

public class paraDemo {

	public static void main(String[] args) {
		 withpara w = (a) -> {
		System.out.println("the value of a is: "+a);
		return a;
	};
	w.hello(5);
	}
}

