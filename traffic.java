import java.util.Scanner;
public class traffic{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String color=scan.nextLine();
    
        if(color.equals("red")){
            System.out.println("stop");
        }
        else if(color.equals("yellow")){
            System.out.println("Get ready");
        }
        else if(color.equals("green")){
            System.out.println("go");
        }
        else{
            System.out.println("Invalid color");
        }
    
    }

}