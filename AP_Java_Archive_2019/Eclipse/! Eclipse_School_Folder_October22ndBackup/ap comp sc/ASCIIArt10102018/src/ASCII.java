// narrow cave ASCII by Sean Myrick \\
// created 10.10.2018 @ 8:08 am \\
// written in Java 1.8 \\
public class ASCII { // [A]merican [S]tandard [C]ode for [I]nformation [I]nterchange (ASCII) \\
	public static void main(String[] args) { // main method \\
		// TODO Auto-generated method stub \\
		writeChars ('^', 48); // draws the lid of the tunnel \\
		System.out.println(); // prints a blank space each time y is called \\
		for (int y = 1; y <= 10; y++) { // first [FOR] loop \\
			writeChars('*', y); // asterisk pattern for y [part 1 of 3] \\
			writeChars('o', 24 - 2 * y); // writes the o pattern [part 1 of 2] \\
			writeChars('*', y); // asterisk pattern for y [part 2 of 3] \\
			writeChars ('*', 24); // asterisk pattern for y [part 3 of 3] \\
			System.out.println(); // prints a blank space each time y is called \\
			for (int x = 1; x <= 10; x++) { // second [FOR] loop \\
				writeChars('*', x); // asterisk pattern for x [part 1 of 3] \\
				writeChars('o', 24 - 2 * y); // writes the o pattern [part 2 of 2] \\
				writeChars('*', x); // asterisk pattern for x [part 2 of 3] \\
				writeChars ('*', 24); // asterisk pattern for x [part 3 of 3] \\
				System.out.println(); // prints a blank space each time x is called \\
				// creates a spiky path that gets thinner and thinner \\
				// just a quick fork of the project \\
}}} // I like putting all the curly brackets on one line \\
	public static void writeChars (char ch, int number) { // secondary method \\
		for (int i = 1; i <= number; i++) { // third [FOR] loop \\
			System.out.print(ch); // prints the character for EVERY statement (5498 total, 110 lines) \\
}}} // I like putting all the curly brackets on one line \\
/* change log [=]
 * added variable Y
 * added variable X
 * Third [FOR] loop
 * Lots of comments
 * modified x and y positions and add-ons
 * changed characters to make the path look better
 * replaced blank spaces with o
 * replaced > with *
 */
// extra line to separate them \\
/* observations {-(*)-(*)-}
 * the amount of o's decreases by 2 with each section
 * the section width decreases by 2 each time
 * the amount of *'s decreases by 2 with each section
 * the pattern stops when there are only 4 o's on each line
 */
// total lines of code: 161
// file size: 7,864 bytes
/* output

*oooooooooooooooooooooo*************************
*oooooooooooooooooooooo*************************
**oooooooooooooooooooooo**************************
***oooooooooooooooooooooo***************************
****oooooooooooooooooooooo****************************
*****oooooooooooooooooooooo*****************************
******oooooooooooooooooooooo******************************
*******oooooooooooooooooooooo*******************************
********oooooooooooooooooooooo********************************
*********oooooooooooooooooooooo*********************************
**********oooooooooooooooooooooo**********************************
**oooooooooooooooooooo**************************
*oooooooooooooooooooo*************************
**oooooooooooooooooooo**************************
***oooooooooooooooooooo***************************
****oooooooooooooooooooo****************************
*****oooooooooooooooooooo*****************************
******oooooooooooooooooooo******************************
*******oooooooooooooooooooo*******************************
********oooooooooooooooooooo********************************
*********oooooooooooooooooooo*********************************
**********oooooooooooooooooooo**********************************
***oooooooooooooooooo***************************
*oooooooooooooooooo*************************
**oooooooooooooooooo**************************
***oooooooooooooooooo***************************
****oooooooooooooooooo****************************
*****oooooooooooooooooo*****************************
******oooooooooooooooooo******************************
*******oooooooooooooooooo*******************************
********oooooooooooooooooo********************************
*********oooooooooooooooooo*********************************
**********oooooooooooooooooo**********************************
****oooooooooooooooo****************************
*oooooooooooooooo*************************
**oooooooooooooooo**************************
***oooooooooooooooo***************************
****oooooooooooooooo****************************
*****oooooooooooooooo*****************************
******oooooooooooooooo******************************
*******oooooooooooooooo*******************************
********oooooooooooooooo********************************
*********oooooooooooooooo*********************************
**********oooooooooooooooo**********************************
*****oooooooooooooo*****************************
*oooooooooooooo*************************
**oooooooooooooo**************************
***oooooooooooooo***************************
****oooooooooooooo****************************
*****oooooooooooooo*****************************
******oooooooooooooo******************************
*******oooooooooooooo*******************************
********oooooooooooooo********************************
*********oooooooooooooo*********************************
**********oooooooooooooo**********************************
******oooooooooooo******************************
*oooooooooooo*************************
**oooooooooooo**************************
***oooooooooooo***************************
****oooooooooooo****************************
*****oooooooooooo*****************************
******oooooooooooo******************************
*******oooooooooooo*******************************
********oooooooooooo********************************
*********oooooooooooo*********************************
**********oooooooooooo**********************************
*******oooooooooo*******************************
*oooooooooo*************************
**oooooooooo**************************
***oooooooooo***************************
****oooooooooo****************************
*****oooooooooo*****************************
******oooooooooo******************************
*******oooooooooo*******************************
********oooooooooo********************************
*********oooooooooo*********************************
**********oooooooooo**********************************
********oooooooo********************************
*oooooooo*************************
**oooooooo**************************
***oooooooo***************************
****oooooooo****************************
*****oooooooo*****************************
******oooooooo******************************
*******oooooooo*******************************
********oooooooo********************************
*********oooooooo*********************************
**********oooooooo**********************************
*********oooooo*********************************
*oooooo*************************
**oooooo**************************
***oooooo***************************
****oooooo****************************
*****oooooo*****************************
******oooooo******************************
*******oooooo*******************************
********oooooo********************************
*********oooooo*********************************
**********oooooo**********************************
**********oooo**********************************
*oooo*************************
**oooo**************************
***oooo***************************
****oooo****************************
*****oooo*****************************
******oooo******************************
*******oooo*******************************
********oooo********************************
*********oooo*********************************
**********oooo**********************************

*/
// end of script
