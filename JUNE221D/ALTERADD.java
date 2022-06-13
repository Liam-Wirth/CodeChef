package JUNE221D;

import java.util.Scanner;

//06-12-2022
public class ALTERADD {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
         Short t = in.nextShort();
         while(t-- > 0){
             // A is < B (A<B)
             int a = in.nextInt(), b = in.nextInt();
             int i = b - a; i%=3;
             if(i==2) System.out.println("NO");
             else System.out.println("YES");
             }
         in.close();
         }

     }


