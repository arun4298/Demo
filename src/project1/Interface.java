package project1;

public class Interface implements Interface1,Interface2 {

	

	@Override
	public void accountNumber() {
System.out.println("123456");		
	}

	@Override
	public void atmPin() {
		System.out.println("1235");
		
	}
	public static void main(String[] args) {
		Interface inter=new Interface();
		inter.accountNumber();
		inter.atmPin();
		

	}

}
