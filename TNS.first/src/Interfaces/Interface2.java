package Interfaces;
interface Interface2 extends Interface1 {
	    void methodB();
	}
	class MyClass implements Interface2 {
	    public void methodA() {
	        System.out.println("Method A implemented.");
	    }
	    public void methodB() {
	        System.out.println("Method B implemented.");
	    }
	}
