package project1;

public class Encapsulation {
	private String a;
	private int b; 

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public static void main(String[] args) {
Encapsulation a=new Encapsulation();
a.setA("arun");
a.setB(24);
System.out.println("enter name is " + a.getA());
System.out.println("enter age is " +a.getB());

	}

}
