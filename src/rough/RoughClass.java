package rough;

public class RoughClass {
	private RoughClass(int data) {
		System.out.println("constructor called");
	}
	protected static RoughClass create(int data) {
		RoughClass obj = new RoughClass(data);
		return obj;
	}
	public void mymethod() {
		System.out.println("method called");
	}
	
	public static void main(String[] args) {
		RoughClass obj=RoughClass.create(20);
		obj.mymethod();

	}

}

