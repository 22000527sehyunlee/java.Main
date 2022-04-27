import java.util.Scanner;

public class _10870{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println(fibo(a));
    }
    static int fibo (int a){
        if (a==0) return 0;
        if (a==1) return 1;
        if (a>1) {
            return fibo(a-1) + fibo(a-2);
        } 
        return 0;
    }
}