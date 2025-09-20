package polymorphism;

public class MethodOverloading {
	    public static void main(String[] args) {
	        calculator calc = new calculator();
	        System.out.println(calc.add(10, 20));
	        System.out.println(calc.add(10, 20, 30));
	        System.out.println(calc.add(7.5, 2.5));
	    }
	}


