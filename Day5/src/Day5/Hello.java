package Day5;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //作业1
//        int odd = 0;
//        int even = 0;
//        int num = in.nextInt();
//        while(num>0)
//        {
//            if(num%2 ==0 )
//            {
//                even = even + 1;
//            }
//            else{
//                odd = odd + 1;
//            }
//            num = in.nextInt();
//        }
//        System.out.println(odd+" "+even);


//        作业2
//        int num = in.nextInt();
//        int count = 0;
//        int digit = 0;
//        int sum = 0;
//        while(num>0)
//        {
//            digit = num%10;
//            count = count +1;
//            if((digit + count)%2 == 0)
//            {
//                sum = (int) (sum + Math.pow(2, count-1));
//            }
//            num = num/10;
//            digit = 0;
//        }
//        System.out.println(sum);
//

        //算平均数
//        int num = in.nextInt();
//        double sum = 0;
//        int count = 0;
//        while(num != 0)
//        {
//            sum = sum + num;
//            count = count +1;
//            num = in.nextInt();
//        }
//        if(count > 0)
//        {
//            System.out.println("average:"+(sum/count));
//        }

        //猜数游戏
//        int num = (int)(Math.random()*100+1);
//        int a = in.nextInt();
//        int count = 0;
//        while(a != num)
//        {
//            if(a < num)
//            {
//                count = count +1;
//                System.out.println("偏小");
//            }
//            else
//            {
//                count = count + 1;
//                System.out.println("偏大");
//            }
//            a = in.nextInt();
//        }
//        count = count +1;
//        System.out.println("恭喜你猜对了，猜了"+count+"次");

        //把数字倒过来
//        int num = in.nextInt();
//        int count = 0;
//        int result = 0;
//        int digit = 0;
//        while(num > 0)
//        {
//            digit = num%10;
//            result = result*10+ digit;
//            num = num/10;
//        }
//        System.out.println(result);


        //算奇偶个数（作业一）二周目
//        int odd = 0;
//        int even = 0;
//        int num = in.nextInt();
//        while(num>=0)
//        {
//            if (num % 2 == 0)
//            {
//                even = even + 1;
//            }
//            else
//            {
//                odd = odd + 1;
//            }
//            num = in.nextInt();
//        }
//        System.out.println("奇数个数："+odd+"个 "+"偶数个数:"+even+"个");


        //算二进制（作业二）二周目
//        int num = in.nextInt();
//        int digit = 0;
//        int count = 0;
//        int sum = 0;
//        while (num > 0)
//        {
//            digit = num % 10;
//            count = count + 1;
//            if ((digit + count) % 2 == 0)
//            {
//                sum = sum + (int) (Math.pow(2, (count - 1)));
//            }
//            num = num / 10;
//            digit = 0;
//        }
//        System.out.print(sum);


        //把数字倒过来二周目
        int num = in.nextInt();
        int result = 0;
        int digit;
        while(num > 0)
        {
           digit = num % 10;
           result = result * 10 + digit;
           System.out.print(digit);
           num = num / 10;
        }
        System.out.println();
        System.out.println(result);





















    }
}