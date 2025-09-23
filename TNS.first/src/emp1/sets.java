
package emp1;
class Hello{
	private int age ; 
	private String name ;
	
	public int getAge() 
	{
		return age;
	}
	public void setAge(int a)
	{
		age=a;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		name = n;
	}
}
public class sets {

	public static void main(String[] args) {
		Hello h = new Hello();
		h.setAge(21);
		h.setName("Soniya");
		System.out.println(h.getAge() +":" +h.getName());

	}

}
