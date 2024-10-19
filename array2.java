import java.util.Scanner;
class array2{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter how many arrays do you want");
        int i=scan.nextInt();
           int[] list=new int[i];
        
       
    
        for(int a=0;a<i;a=a+1){
            System.out.println("no position of arrry in the table "+a);
            list[a]=scan.nextInt();
            
            
        }
        System.out.println("mile of the part");
        System.out.println(list[i/2]);

    
    
    }    

}