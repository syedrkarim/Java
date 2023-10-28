package branching;

public class BloodDonor {

	public static void main(String[] args) {

		int age = 20;
		int weight = 38;
		if (age >= 18) {
			if (weight >= 40)
				System.out.println("Eligible to donate Blood");
			else
				System.out.println("Not Eligible");
		} else {
			System.out.println("Not Eligible");
		}
	}
}
