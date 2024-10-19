import java.util.Scanner;

public class q13{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int mark=scan.nextInt();

        if(mark<65 && mark>35){
            System.out.println("video game");
        }
        else if(mark <95 && mark>65){
            System.out.println("phone");
        }
        else if(mark>95){
            System.out.println("laptop");
        }

       

    }
}