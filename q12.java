
import java.util.Scanner;
public class q12{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();

        if(a%3 == 0 && a%5 ==0)
        {
            System.out.println("a divided by 3 and 5");

        }
        else
        {
            System.out.println("a not divided by 3 and 5");
        }
    }
}