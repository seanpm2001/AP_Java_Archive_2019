
public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		/* This is how to set up a Java comment */
		
		/* Pattern 1 */
		/* 010101/n00100/n01010 */
		
		/* Pattern 2 */
	    /* 11111/n11111 */
		
		/* Pattern 3 */
		/* 00000/n00000/n00100/n00100/n00100 */
		
		/* Pattern 4 */
		/* 00000 */
		
		/* Pattern 5 */
		/* 00000/n00000 */
		
		/* Full pattern*/
		/* Pattern 2, Pattern 1, Pattern 5, Pattern 2, Pattern 1, Pattern 2, Pattern 4, Pattern 2, Pattern 1 */
		System.out.println("Star Pattern");
		System.out.println (" ");
		
		/* The long way */
		System.out.println ("Without Objects");
		System.out.println (" ");
		System.out.println ("11111");
		System.out.println ("11111");
		System.out.println ("01010");
		System.out.println ("00100");
		System.out.println ("01010");
		System.out.println ("00000");
		System.out.println ("00000");
		System.out.println ("11111");
		System.out.println ("11111");
		System.out.println ("00000");
		System.out.println ("00000");
		System.out.println ("11111");
		System.out.println ("11111");
		System.out.println ("00000");
		System.out.println ("11111");
		System.out.println ("11111");

		/* Now to define them */		
		System.out.println ("");
		System.out.println ("With objects");
		System.out.println ("");
	}
		public static void patternOne(Object draw) {
			System.out.println ("01010");
			System.out.println ("00100");
			System.out.println ("01010");
		}		
		public static void patternTwo () {
			System.out.println ("11111");
			System.out.println ("11111");
		}		
		public static void patternThree (){
			System.out.println ("00000");
			System.out.println ("00000");
			System.out.println ("00100");
			System.out.println ("00100");
			System.out.println ("00100");
		}		
		public static void patternFour (){
			System.out.println ("00000");
		}		
		public static void patternFive (){
			System.out.println ("00000");
			System.out.println ("00000");
			
		}			
	public static class patternTwo {	
		public static <VariableDeclarators, draw> void main(String[] args, Object draw) {	
			patternOne (draw); 
			char[] patternOne = null;
			System.out.println(patternOne);
			patternOne (draw);
			/* Object 2 */		
			patternTwo (draw);
			System.out.println();
			patternTwo (draw);
			/* Object 3 */
			patternFive (draw);
			System.out.println();
			patternFive (draw);
			/* Object 4 */
			patternTwo (draw);
			System.out.println();
			patternTwo (draw);
			/* Object 5 */
			patternOne (draw);
			System.out.println();
			patternOne (draw);
			/* Object 6 */
			patternTwo (draw);
			System.out.println();
			patternTwo (draw);
			/* Object 7 */
			patternThree (draw);
			System.out.println();
			patternThree (draw);
			/* Object 8 */
			patternTwo (draw);
			System.out.println();
			patternTwo (draw);
			/* Object 9 */		
			patternOne (draw);
			System.out.println();
			patternOne (draw);	

			/* 9 total objects
			141 lines of code
			3429 bytes
			JAVA file
			 */

		}

		private static void patternThree(Object draw) {
			// TODO Auto-generated method stub
			
		}

		private static void patternFive(Object draw) {
			// TODO Auto-generated method stub
			
		}

		private static void patternTwo(Object draw) {
			// TODO Auto-generated method stub
			
		}
	}
		}
