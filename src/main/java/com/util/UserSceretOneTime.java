package com.util;



public class UserSceretOneTime {
	 public static String RandGeneratedStr()
	 {
	 // a list of characters to choose from in form of a string
	 String AlphaNumericStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz0123456789";
	 // creating a StringBuffer size of AlphaNumericStr
	 StringBuilder s = new StringBuilder();
	 int i;
	 for ( i=0; i<64; i++) {
	   //generating a random number using math.random()
	   int ch = (int)(AlphaNumericStr.length() * Math.random());
	   //adding Random character one by one at the end of s
	   s.append(AlphaNumericStr.charAt(ch));
	  }
	    return s.toString();
	 }
//	 public static void main(String[] args)
//	 {
//	  //assign the size of the string
//	 // int n = 32;
//	  //Output the randomly generated alphanumeric string
//		 String token = AccessToken.RandGeneratedStr();
//	  System.out.println("random String: "+token);
//	  System.out.println( token.toLowerCase());
//	 }

}
