package hello;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args){
//     System.out.println("Hello World");
        Scanner in=new Scanner(System.in);
        System.out.println("echo:"+in.nextLine());
        int amount=100;
        int price=0;
        System.out.print("请输入票面：");
//        amount =in.nextInt();
        System.out.print("请输入金额：");
//        price = in.nextInt();
        System.out.println(amount+"-"+price+ "=" + (amount-price));
        



    }
}
