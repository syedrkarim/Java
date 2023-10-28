package rough;

public class RoughClass {
	private RoughClass(int data) {
		System.out.printf("constructor called");
	}
	protected static RoughClass create(int data) {
		RoughClass obj = new RoughClass(data);
		return obj;
	}
	public void mymethod() {
		System.out.printf("method called");
	}
	
	public static void main(String[] args) {
		RoughClass obj=RoughClass.create(20);
		obj.mymethod();

	}

}
