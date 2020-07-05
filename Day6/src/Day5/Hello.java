package Day5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int i;//判断素数时的因数
//        int n = in.nextInt();
//        int m = in.nextInt();
//        int j = 1;//工具人
//        int h;//数字
//        int count = 0;//素数的个数
//        int sum = 0;
//        OUT:
//        for (h = 2; h >= 2;h++ )
//        {
//            for (i = 2; i < h; i++)
//            {
//                if (h % i == 0)
//                {
//                    j = 0;
//                    break;
//                }
//            }
//            if(j != 0)
//            {
//                count++;
//
//                if (count >= n && count <= m)
//                {
//                    sum = sum + h;
//                }
//                if(count==m)
//                {
//                    break OUT;
//                }
//            }
//            j = 1;
//
//        }
//        System.out.println(sum);
//


//        double num = in.nextDouble();
//        int count = 0;
//        double sum = 0;
//        while(num>=0)
//        {
//            sum = sum + num;
//            count = count + 1;
//            num = in.nextInt();
//        }
//        System.out.print("average:" +sum/count );

//        double num=0;
//        do {num = in.nextDouble();
//            if(num>=0)
//        {
//            sum = sum + num;
//            count = count + 1;
//        }
//
//        }while( num >=0);
//        System.out.print("average:" +sum/count );

//
//
//        int num = (int)(Math.random()*100+1);
//        int a = in.nextInt();
//        int count = 0;
//        while(a != num)
//            {
//                if (a > num)
//                {
//                    System.out.println("偏大");
//                }
//                else
//                {
//                    System.out.println("偏小");
//                }
//                count = count + 1;
//                a = in.nextInt();
//            }
//            count = count + 1;
//            System.out.println("猜对了,你猜了"+count+"次");


//          阶乘
//        int n = in.nextInt();
//        int result = 1;
////        while(n >= 1)
////        {
////            result = result * n;
////            n--;
////        }
//        //for 循环，变量只在循环里面用
//        //表达式可以省略但是分号不可以。
//        for(;n >= 1; n--)
//        {
//            result = result * n;
//        }
//        System.out.print(result);
        /* i++
           ++i
           factor*=i
         */
        //素数，找出一百里的所有素数
//        int n = in.nextInt();
//        int count = 0;
//        int i = 2;
//        int count = 0;
//        for(int n = 2;n <= 100;n++)
//        {
//            for (i = 2; i < n; i++)
//            {
//                count=0;
//                if (n % i == 0)
//                {
//                    count++;
////                    System.out.println(i);
//                    break;
//                    //break跳出for循环
//                }
//
//            }
//            if (count == 0)
//            {
//                System.out.println(n);
//            }
////
//        }

//        int a =3;
//        a++;
//        int p;
//        int t;
//        System.out.println(a);
//        t=a++;
//        p=++a;
//        System.out.println(t+"  "+p);

//
//        int amount = in.nextInt();
//        for(int one = 0;one <= amount;++ one)
//        {
//            for(int five = 0;five <= amount/5;++ five)
//            {
//                for (int ten = 0;ten <= amount/10;++ ten)
//                {
//                    for(int twenty = 0;twenty <= amount/20;++twenty)
//                        if(one + five*5 + twenty*20 == amount)
//                        {
//                            System.out.println(one+"张一元"+five+"张五元"+ten+"张十元"+twenty+"张二十元");
//                        }
//                }
//            }
//        }

//        int num = in.nextInt();
//        int num2 = Math.abs(num);
//        int digit = 0;
//        int count = 0;
//        if(num==0)
//        {
//            count = 1;
//        }
//       if(num<0)
//       {
//           System.out.print("fu ");
//           num *= -1;
//       }
//        while(num > 0)
//        {
//            num /=10;
//            count ++;
//        }
//        while(count>0)
//        {
//            digit = num2/ (int) (Math.pow(10, count-1));
//            switch (digit)
//            {
//                case 1:
//                    System.out.print("yi");
//                    break;
//                case 2:
//                    System.out.print("er");
//                    break;
//                case 3:
//                    System.out.print("san");
//                    break;
//                case 4:
//                    System.out.print("si");
//                    break;
//                case 5:
//                    System.out.print("wu");
//                    break;
//                case 6:
//                    System.out.print("liu");
//                    break;
//                case 7:
//                    System.out.print("qi");
//                    break;
//                case 8:
//                    System.out.print("ba");
//                    break;
//                case 9:
//                    System.out.print("jiu");
//                    break;
//                case 0:
//                    System.out.print("ling");
//                    break;
//            }
//            if ( count > 1){
//                System.out.print(" ");
//            }
//            num2 = num2%(int)(Math.pow(10, count-1));
//            count--;
//        }





//        int f = 0;
//        int num = in.nextInt();
//        int num2 = num;
//        int digit = 0;
//        int sign = 0;
//        int count = 0;
//        if(num==0)
//        {
//            System.out.print("ling");
//            return;
//        }
//        if(num<0)
//        {
//            System.out.print("fu ");
//        }
//        while(Math.abs(num) > 0)
//        {
//            num /=10;
//            count ++;
//        }
//        while(count>1 && Math.abs(num2)>=0)
//        {
//            num2 = Math.abs(num2);
//            digit = num2/ (int) (Math.pow(10, count-1));
//            switch (digit)
//            {
//                case 1:
//                    System.out.print("yi ");
//                    break;
//                case 2:
//                    System.out.print("er ");
//                    break;
//                case 3:
//                    System.out.print("san ");
//                    break;
//                case 4:
//                    System.out.print("si ");
//                    break;
//                case 5:
//                    System.out.print("wu ");
//                    break;
//                case 6:
//                    System.out.print("liu ");
//                    break;
//                case 7:
//                    System.out.print("qi ");
//                    break;
//                case 8:
//                    System.out.print("ba ");
//                    break;
//                case 9:
//                    System.out.print("jiu ");
//                    break;
//                case 0:
//                    System.out.print("ling ");
//                    break;
//            }
//            num2 = num2-digit*(int)(Math.pow(10, count-1));
//            count--;
//        }
//        digit = num2 / (int) (Math.pow(10, count-1));
//        switch (digit)
//        {
//            case 1:
//                System.out.print("yi");
//                break;
//            case 2:
//                System.out.print("er");
//                break;
//            case 3:
//                System.out.print("san");
//                break;
//            case 4:
//                System.out.print("si");
//                break;
//            case 5:
//                System.out.print("wu");
//                break;
//            case 6:
//                System.out.print("liu");
//                break;
//            case 7:
//                System.out.print("qi");
//                break;
//            case 8:
//                System.out.print("ba");
//                break;
//            case 9:
//                System.out.print("jiu");
//                break;
//            case 0:
//                System.out.print("ling");
//                break;
//        }



//        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//        int x = in.nextInt();
//        for( int k:numbers)
//        {
//            if(x==k)
//            {
//                System.out.println(x+"在数组中");
//            }
//            else
//            {
//                System.out.println(x+"不在数组中");
//            }
//        }

//        int[][] board = new int[3][3];
//        boolean gotResult = false;
//        int numX = 0;
//        int numO =0;
//
//        for( int i=0; i<3; i++)
//        {
//            for( int j=0; j<3; j++)
//            {
//                board[i][j] = in.nextInt();
//            }
//        }
//
//        for(int i =0; i<3; i++)
//        {
//            for( int j =0; j<3; j++)
//            {
//                if(board[i][j]==1)
//                {
//                    numX++;
//                }
//                else
//                {
//                    numO++;
//                }
//            }
//            if(numX==3)
//            {
//                System.out.println("X wins");
//                return;
//            }
//            if(numO==3)
//            {
//                System.out.println("O wins");
//                return;
//            }
//            numX = 0;
//            numO = 0;
//        }
//        for(int j=0; j<3; j++)
//        {
//            for(int i=0; i<3; i++)
//            {
//                if(board[i][j]==1)
//                {
//                    numX++;
//                }
//                else
//                {
//                    numO++;
//                }
//
//            }
//            if(numX==3)
//            {
//                System.out.println("X wins");//
//                return;
//            }
//            if(numO==3)
//            {
//                System.out.println("O wins");//
//                return;
//            }
//            numX = 0;
//            numO = 0;
//        }
//        for(int i = 0, j = 0; i<3 && j<3; i++,j++)
//        {
//            if(board[i][j] == 1)
//            {
//                numX++;
//            }
//            else
//            {
//                numO++;
//            }
//            if(numX==3)
//            {
//                System.out.println("X wins");
//                return;
//            }
//            if(numO==3)
//            {
//                System.out.println("O wins");
//                return;
//            }
//        }
//        for(int i=0,j=2; i<3 && j>=0; i++,j--)
//        {
//            if(board[i][j] == 1)
//            {
//                numX++;
//            }
//            else
//            {
//                numO++;
//            }
//            if(numX==3)
//            {
//                System.out.println("X wins");
//                return;
//            }
//            if(numO==3)
//            {
//                System.out.println("O wins");
//                return;
//            }
//        }


//        int n = in.nextInt();
//        int num[]=new int[n];
//        int count = 0;
//        int m = 0;
//        int h = 0;
//        int l = num.length;
//        for(int i=0; i<num.length; i++)
//        {
//            num[i] = in.nextInt();
//        }
//         for(int k=0; k<num.length; k++)
//        {
//            secondLoop:
//            for(int i=0; i<num.length; i++)
//            {
//                if (num[k] < num[i])
//                {
//                    count++;
//                    if(count == (l - 1))
//                    {
//                        int j = 0;
//                        h = num[k];
//                        j = num[m];
//                        num[k] = j;
//                        num[m] = h;
//                        m++;
//                        l--;
//                    }
//                    else
//                    {
//                        continue secondLoop;
//                    }
//                }
//            }
//            count = 0;
//        }
//        for(int i=0; i<num.length; i++)
//        {
//            System.out.print(num[i]);
//        }

        int[] numbers = new int[101];
        for()












//        int N = 10;
//        int numbers[] = new int[N];
//        Random random = new Random();
//        for(int i=0; i< N; i++)
//        {
//            numbers[i] = random.nextInt((int)(1.5*N));
//        }
//        print(numbers);
//        for(int i=0; i<numbers.length; i++)
//        {
//            int min = numbers[i];
//            int index = i;
//            for(int k=i+1; k<numbers.length; k++)
//            {
//                if(numbers[k] < min)
//                {
//                    min = numbers[k];
//                    index = k;
//                }
//            }
//            numbers[index] = numbers[i];
//            numbers[i] = min;
//        }
//        print(numbers);
//
//
//    }
//
//    public static void print(int[] numbers){
//        for(int i : numbers){
//            System.out.print(i+" ");
//        }
//        System.out.println();
    }
}