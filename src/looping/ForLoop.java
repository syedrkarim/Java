package looping;

public class ForLoop {

	public static void main(String[] args) {
		/*
		 * We can have a name of each Java for loop. To do so, we use label before the
		 * for loop. It is useful while using the nested for loop as we can
		 * break/continue specific for loop.
		 */
		aa: for (int i = 1; i <= 3; i++) { // Labeled for loop
			bb: for (int j = 1; j <= 3; j++) { // labeled for loop
				if (i == 2 && j == 2) {
					break; // break will break the inner Loop. continue will continue the inner loop.
				}
				System.out.println(i + "  " + j);
			}
		}

	}

}
