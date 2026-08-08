import java.util.Scanner;



public class powercheck 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        System.out.println(check(n));
    }

    public static boolean check (int n)
{
    int pow;
    
    for(int i = 0; i<50;i++)
        {
        pow = (int)Math.pow(2,i);
        
        if ( n == pow)
            {
                return true;
            }    
        }
         return false;
}

}

