package start42;
//6/12/2022
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
        int run = input.nextInt();
        while(run>0){
        int X = input.nextInt();
        int Y = input.nextInt();
        int A = input.nextInt();
        if (A>=X && A<Y){
            System.out.println("YES");
        }else System.out.println("NO");
        run--;
        }
	}
}
