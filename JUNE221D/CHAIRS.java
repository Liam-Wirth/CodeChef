package JUNE221D;

import java.util.Scanner;

public class CHAIRS {
       public static void main(String[] args) {
        //your code goes here
         Scanner in = new Scanner(System.in);
        Short t = in.nextShort();
        while(t-- > 0){
            byte x = in.nextByte(), y = in.nextByte();
            //x is the number of students
            //y is the number of chairs he has
            if(x-y<=0) System.out.println("0");
            else System.out.println(x-y);

        }
        in.close();
    }

}
