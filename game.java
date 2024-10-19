import java.util.Scanner;
public class game{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int core=scan.nextInt();
        if(core<50){
            System.out.println("You need to imporve");
        }
        else if(core>49 && core<71){
            System.out.println("Good job");

        }
        else if(core>70){
            System.out.println("Exellent performance");
        }
    
    
    
    }
}