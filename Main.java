import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int result;
        result = pac(a);
        System.out.println(result);       
    }
    
    static int pac(int x){
        if (x==0) return 1;
        if (x==1) return 1;
        else {
            return x * pac(x-1);
        }
    }
}