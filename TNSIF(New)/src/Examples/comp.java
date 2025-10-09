
package Examples;

public class comp implements Comparable <comp>{
	private String brand;
	private int price;
	private int Ram;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setprice(int price) {
		this.price = price;
	}
	public void setRam(int Ram) {
		this.Ram = Ram;
	}
	public String toString() {
		return "comp[brand = "+brand+",price = "+price+",Ram = "+Ram+"]";
	}
	public comp(String Brand,int price, int Ram) {
		super();
		this.brand = Brand;
		this.price = price;
		this.Ram = Ram;
	}

	public int compareTo(comp o) {
	if(this.price > o.price)
	{
		return 1;
	}else if (this.price < o.price) {
		return -1;
	}
	else {
		return 0;
	}
	}
	
	
	

}



