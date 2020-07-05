package Day4;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter your birth year：");
        int year = in.nextInt();
        if(year>=1980)
        {
            System.out.println("please enter your birth month and date, connect them with a digital dot:");
            double monthAndDate = in.nextDouble();
            System.out.println("please tell us which integer you like the most:");
            int num = in.nextInt();
            if(num>=3)
            {
                System.out.println("please use a number to represent the letter of your family name. For instance: 1 represents A:");
                int name = in.nextInt();
                switch (name)
                {
                    case (3):
                        System.out.println("i think you shold better give up find one");
                        break;
                    case(19):
                        System.out.println("that one will be: Eguchi Takuya");
                        break;
                    case(14):
                        System.out.print("i recommend you Annie Chen since she likes female more than male.");
                        break;
                }

            }
            else
            {
                System.out.println("people who like this number couldn't possibly find one.");
            }
        }
        else
        {
            System.out.println("you are too old to find one");
        }












//        int balance = 0;
//        while (true)
//        {
//            System.out.println("请投币：");
//            int amount = in.nextInt();
//            balance = balance + amount;
//
//            if (balance >= 10) {
//                System.out.println("车票");
//                System.out.println("找零：" + (balance - 10));
//                balance = 0;
//            }
//
//        }
////do while循环
////        while后面有分号
//        int num = in.nextInt();
//        int count = 0;
//        do
//        {
//            num = num/10;
//            count = count + 1;
//        }while(num > 0);
//        System.out.println(count);




    }
}
