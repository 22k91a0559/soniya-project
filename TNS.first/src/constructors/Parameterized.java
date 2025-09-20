package constructors;
class Parameterized {
 int x;
 Parameterized(int y) {
     x = y;
 }

 public static void main(String[] args) {
	 Parameterized  myObj = new  Parameterized(10);
     System.out.println(myObj.x);
 }
}

