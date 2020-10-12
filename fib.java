import java.util.Scanner;
//added some commnets for better understanding of fibonaaci code using java language
public class fib {
    public static void main(String[] args) {
        int n,a,b;
        System.out.println("enter the number of terms");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        a=0;b=1;//initialise a nd b as 0 and 1 for fibonacci series 
        fib(a,b,n);

    }
    public static int fib(int a, int b,int n)
    {
        if(n==0)
            return 0;
        System.out.println(a);//printing the next number of fibonaaci series
        return fib(b,a+b,n-1);// this will update a nd c 

    }
}

