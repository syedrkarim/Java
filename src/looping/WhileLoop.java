package looping;

public class WhileLoop {

	public static void main(String[] args) {
		// printing even number from 0 to 10
		
				// approach 1
				 int i=2;
				/*while(i<=10)
				{
					System.out.println(i);
					i+=2;
				}*/
				
				// Approach 2
				/*while(i<=10)
				{
					if(i%2==0)
						System.out.println(i);
					i++;
				}*/
				
				// Approach 3
				while(i<=10)
				{
					if(i%2==0)
						System.out.println(i+"-Even");
					else
						System.out.println(i+"-Odd");
					i++;
				}
		
				// Infinite Loop
				/*int i=0;
				while(true)
				{
					System.out.println("Hello");
					i++;
					if(i==3)
						break;
				}*/
				

	}

}
