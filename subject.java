import java.util.Scanner;
public class subject{
    public static void main(String[] arg){
        Scanner scan =new Scanner(System.in);
        int Sub1= scan.nextInt();
        int Sub2= scan.nextInt();
        int Sub3= scan.nextInt();
        int Sub4= scan.nextInt();
        int Sub5= scan.nextInt();  
    
        int Sum= Sub1+ Sub2+ Sub3+ Sub4+ Sub5;
        float avg=Sum/5;
        System.out.println(avg);
        if(avg<35){
            System.out.println("Additional class is required");
        }
        else{
            System.out.println("you are good to go");
        }
                
    
    
    }
}

