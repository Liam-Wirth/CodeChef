package start42;
//6/12/2022
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class Codechef{
	public static void main (String[] args) throws java.lang.Exception{
	// your code goes here    aight
	Scanner in = new Scanner(System.in);
	int t = in.nextInt();
	while(t-- >0){
		int a = in.nextInt();
		int b = in.nextInt();
		int count = 0;
		    for(count = 0;a%3!=0 && b%3!=0;count++)
		    {
    		    if(a>=b)
    		    {
    		        a=a-b;
    		    }
    		    else
    		    {
    		        b=b-a;
    		    }
		    }

		    System.out.println(count);
		}
		in.close();
	}
}
