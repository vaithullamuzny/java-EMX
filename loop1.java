import java.util.Scanner;
public class loop1{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=scan.nextInt();
        System.out.println("Enter b number: ");
        int b=scan.nextInt();
        System.out.println("");
        int oddcount =0;
        for(int i=a;i<=b;i=i+1){
            if(i%2==0){
               // System.out.println(i+" :is even number");
            }
            else{
                
                oddcount=oddcount+1;


                
            }
           
        }
        System.out.println(oddcount);    
    
    
    
    
    }
}