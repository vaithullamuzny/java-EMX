import java.util.Scanner;
public class terrory{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        String result=n1>n2?"n1 i greater":"n2 is greate in n1";
        System.out.print(result);
    }
}