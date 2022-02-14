package com.company;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=0;
        num = input.nextInt();
        cal(num);
    }
    public static void cal(int num)
    {
        int ash=num;
            for (int i=0 ; i<num ; i++)
            {
                for (int a=0; a<=i;a++)
                {
                System.out.printf("*");
                }
                for (int b=ash-1;b>0;b--)
                {
                    System.out.printf("#");
                }
                System.out.println("");
                ash--;
            }
    }
}