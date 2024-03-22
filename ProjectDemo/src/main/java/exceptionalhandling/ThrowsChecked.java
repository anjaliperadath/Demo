//checked exception
package exceptionalhandling;

import java.io.IOException;//we need to import IO and SQL exception 

public class ThrowsChecked {

	public static void main(String[] args) throws IOException {//when we invoke a method in case of checked exception error occurs. in order to remove the error 
		                                    //either use try-catch block or use throws	
			
				check();
	}
   
	public static void check() throws IOException//checked exception
	{
		throw new IOException("exception occured");//IO Exception show be imported right click import
	}
}
