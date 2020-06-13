
public class Problem1 {

	public static void solve() {
		int multiple5 = 0; // Store the current multiple of 5.
		int multiple3 = 0;
		int sum = 0; // Store sum of all the multiples of 3 and 5
		int max = 1000; // Store the upper limit to calculate.
		boolean sumMultiple5 = false;
		
		// Loop on all the multiples of 3 until max number.
		// Sum all the doubles of 3 (except for the ones that also double of 5), and sum 
		for( ; multiple3 < max; multiple3 = multiple3 + 3) {
			
			// Skip the double of 3 if equals to the double of 5 because the sum already handled by the double of 5. 
			if (multiple3 == multiple5 ) {
				multiple3 = multiple3 + 3;

			}
			
			// Adding this because we don't want to sum number greater of the max number.
			if(multiple3 < max) {
				sum = sum + multiple3;	

			}
			
			// Move to the next double of 5 and mark to sum it.
			if (multiple3 > multiple5) {
				multiple5 = multiple5 + 5;
				sumMultiple5 = true;

			}
			
			// don't sum doubles that are not below of the max number.
			if(multiple5 >= max) {
				sumMultiple5 = false;	

			}
			
			// Only sum the double of 5 one at the time.
			if(sumMultiple5) {
				sum = sum + multiple5;	
				sumMultiple5 = false;	

			}
		
		}
		
		// Print the result
		System.out.println(sum);
		
	}
}
