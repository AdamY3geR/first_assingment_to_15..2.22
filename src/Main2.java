import java.util.Scanner;
public class Main2
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int min;
        System.out.println("Enter minutes and seconds");
        min = input.nextInt();
        double sec = input.nextDouble();
        double total = sec/60.0;
        System.out.println("your min and seconds in total is "+(total+min));
        hrs(min);
    }
    public static void hrs(int min)
    {
        Scanner input= new Scanner(System.in);
        int bet,hrs;
        System.out.println("Enter minutes and hours");
        min = input.nextInt();
        hrs = input.nextInt();
        bet = hrs*60;
        System.out.println("this is the time between "+(bet-min)+" minutes");
        week(min,hrs);
    }
    public static void week(int hrs, int min)
    {
        Scanner input= new Scanner(System.in);
        int day=7,longest,min2,total,minend2,minend,hrsend,total1,total2;
        for (int i=day;i>0;i--)
        {
            System.out.println("Enter when you started to worked today and when you finished in minutes and hours");
            min = input.nextInt();
            hrs = input.nextInt();
            minend = input.nextInt();
            hrsend = input.nextInt();
            min2 = hrs*60;
            total = min+min2;
            minend2 = hrsend*60;
            total1 = minend+minend2;
            total2 = total-total1;
            System.out.println(total2);
        }
    }
}