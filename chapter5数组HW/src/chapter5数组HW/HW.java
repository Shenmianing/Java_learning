package chapter5数组HW;

import java.util.Scanner;

public class HW {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int coeSum = 0;
        int[] numbers = new int[101];
        int index;
        for(int count=0; count<2;)
        {
            index = in.nextInt();
            numbers[index] = in.nextInt() + numbers[index];
            if(index == 0)
            {
                count++;
            }
        }
        for(int i = 100; i>=0; i--)
        {
            if(numbers[i] != 0 && i != 1 && i != 0)
            {
                System.out.print(numbers[i]+"x"+i+"+");
            }
            if(i == 1 && numbers[i] != 0)
            {
                System.out.print(numbers[i]+"x+");
            }
            if(i == 0 && numbers[i] != 0)
            {
                System.out.print(numbers[i]);
            }
        }






    }
}
