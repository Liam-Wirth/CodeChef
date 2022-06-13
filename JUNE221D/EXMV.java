package JUNE221D;

import java.util.Scanner;

//06-12-2022
public class EXMV{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int a = in.nextInt(), b = in.nextInt();
            int ans = (a-1)*(2*b-a);
            System.out.println(ans);
            t--;
        }
    }
}
