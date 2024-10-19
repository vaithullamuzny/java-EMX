import java.util.Scanner;

class demo {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        System.out.println("Enter num1: "+num1);
        System.out.println("Enter num2: "+num2);
        //check whether Number 1 and Number2 is equal or not
        if (num1==num2 ) 
        {
            System.out.println("num1 and num2 is equal");

        }
        else
        {
            System.out.println("num2 and num1 is not equal");
        } 
        
        
    }
}
