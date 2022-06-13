package JUNE221D;
//06-12-2022

import java.util.Scanner;

public class SUBSCRIBE{
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    short t = in.nextShort();
    while(t-- > 0){
        //size of group (!IMPORTANT 6 people can share a subscription)
        byte N = in.nextByte();
        //cost of a subscription
        short x = in.nextShort();
        if(N%6==0) System.out.println((N/6)*x);
        else{
            System.out.println(((N/6)*x)+x);
        }
    }
    in.close();
}

}
