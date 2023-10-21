import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        Scanner sc - new Scanner(System.in);
        
        //Taking input 
        System.out.println("Enter the lenght of fabonacci series");
        int count = sc.nextInt();
        
        //method called
        fabonacci(count);
    }
    
    public static void fabonacci(int count){
        int a = 0;
        int b = 1;
        int c = 1;
        
        //loop with logic to print fabonacci series;
        for(int i = 0; i < count; i++){
            System.out.print(a+", ");
            a = b;
            b = c;
            c = a + b;
        }
    }
}
