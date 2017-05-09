package samplePrograms;

import java.util.HashMap;

public class StringReverse {

		
		 static String recursiveMethod(String str)
		{
			 System.out.println(str.length());
		     if ((null == str) || (str.length() <= 1))
		     {
		            return str;
		     }
		 
		     return recursiveMethod(str.substring(1)) + str.charAt(0);
		}

	

public static void main(String[] args) {
	recursiveMethod("yash");

}
}
