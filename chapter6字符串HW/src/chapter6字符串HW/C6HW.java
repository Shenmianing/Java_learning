package chapter6字符串HW;

import java.util.Scanner;

public class C6HW {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = "It's great to see you here.";
        input = input.replace(".","");
//        input.indexOf()
        String[] n = input.split(" ");
        for(int i=0; i<n.length; i++)
        {
            System.out.print(n[i].length());
            if(i < n.length-1) System.out.print(" ");
        }

    }
}
