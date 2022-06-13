package start36;
//6/12/2022
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner input = new Scanner(System.in);
        short T = input.nextShort();
        while(T>0){
            //x = alice y = bob
            short x = input.nextShort(), y = input.nextShort();
            if (x>y) {
                System.out.println("a");
            } else {
                System.out.println("b");
            }
            T--;
        }
	}
}
