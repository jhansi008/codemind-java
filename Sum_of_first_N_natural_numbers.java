import java.util.Scanner;
public class sum
{
    public static void main(String[] args)
    {
        int n,res;
        Scanner read=new Scanner(System.in);
        n=read.nextInt();
        res=n*(n+1)/2;
        System.out.println(res);
    }
}