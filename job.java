import java.util.Scanner;
public class job{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you salay");
        int salary=scan.nextInt();
        System.out.println("what is your age");
        int age=scan.nextInt();

        if(salary>=20000 || age<=25){
            System.out.println("eligible for the loan");
            Scanner scan1=new Scanner(System.in);
            System.out.println("what i your loan amount");
            int loan=scan1.nextInt();
            System.out.println(loan);
            if(loan<=50000){
                System.out.println("You are eligible for the loan");
            }
            else{
                System.out.println("You are not eligible for the loan");
            }

        }
        else{
            System.out.println("You are not eligible for the loan");
        }
    }
}