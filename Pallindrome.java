import java.util.Scanner;

public class Pallindrome
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int real = x;
        int rev=0;
        while (x>0)
        {
            int ref = x % 10;
            rev = (rev * 10) + ref;
            x=x/10;
        }
        System.out.println(check(real,rev));
    }

    public static boolean check(int real,int rev)
    {
        if (real==rev)
        {
            return true;
        } else {
            return false;
        }
    }

}